package cscie97.asn2.sharedesk.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;




/**
 * The Class OfficeSpaceService.
 */
public class OfficeSpaceService
{
	
	/** The office space map. */
	private Map<String, OfficeSpace> officeSpaceMap;
	
	/**
	 * Instantiates a new office space service.
	 */
	public OfficeSpaceService ()
	{
		officeSpaceMap = new HashMap<String, OfficeSpace>();	
	}
	
	/**
	 * Creates a new OfficeSpace: add office space to officeSpaceMap; check if it exists already
	 * and throws OfficeSpaceAlreadyExistException if it is. If authentication fails - throw AccessException.
	 * Rating Field is initialized here.
	 * Note: officeSpaceId has to be generated first! Check for officeSpaceIds and providerId in the id buckets,
	 * if this check fails throw the 
	 *
	 * @param authToken the auth token
	 * @param officeSpace the office space
	 * @param guid the guid
	 * @throws OfficeSpaceAlreadyExistException the office space already exist exception
	 * @throws AccessException the access exception
	 */
	public void createOfficeSpace ( String authToken, OfficeSpace officeSpace, String guid )
			                        throws OfficeSpaceAlreadyExistException, AccessException
	{
		if ( !officeSpaceMap.containsKey( guid ) )
		{
			officeSpaceMap.put( guid, officeSpace );
		}
		else
		{
			throw new OfficeSpaceAlreadyExistException();
		}
	}
	
	/**
	 * accessor method for officeSpaceMap attribute
	 * if the guid not found in the map, it throws OfficeSpaceNotFoundException exception.
	 *
	 * @param authToken the auth token
	 * @param guid the guid
	 * @return OfficeSpace
	 * @throws OfficeSpaceNotFoundException the office space not found exception
	 */
	public OfficeSpace getOfficeSpace ( String authToken, String guid ) throws OfficeSpaceNotFoundException
	{
		if ( officeSpaceMap.containsKey( guid ) )
		{
			return this.officeSpaceMap.get( guid );
		}
		else
		{
			throw new OfficeSpaceNotFoundException();
		}
	}
	
	/**
	 * Gets the office space list.
	 *
	 * @return all values (office spaces) from officeSpaceMap
	 */
	public List<OfficeSpace> getOfficeSpaceList ()
	{
		List<OfficeSpace> officeSpaceList = null;
		officeSpaceList = (List<OfficeSpace>) officeSpaceMap.values();
		return officeSpaceList;
	}
	
	/**
	 * Gets the office space guid list.
	 *
	 * @return List<String>
	 */
	public List<String> getOfficeSpaceGuidList ()
	{
		Set<String> tempSet;
		tempSet = officeSpaceMap.keySet();
		List<String> officeSpaceGuidList = new ArrayList<String> ( tempSet );
		return officeSpaceGuidList;
	}
	
	/**
	 * updates particular office space in the office space map with a new office space based on guid passed in
	 * if the guid not found in the map, it throws OfficeSpaceNotFoundException exception.
	 *
	 * @param authToken the auth token
	 * @param guid the guid
	 * @param officeSpaceId the office space id
	 * @param updatedOffice the updated office
	 * @throws OfficeSpaceNotFoundException the office space not found exception
	 */
	public void updateOfficeSpace ( String authToken, String guid,
			                        String officeSpaceId , OfficeSpace updatedOffice) throws OfficeSpaceNotFoundException
	{
		if ( officeSpaceMap.containsKey( guid ) )
		{
			officeSpaceMap.put( guid, updatedOffice );
		}
		else
		{
			throw new OfficeSpaceNotFoundException();
		}
	}
	
	/**
	 * removed particular office space from the office space map based on guid passed in
	 * if the guid not found in the map, it throws OfficeSpaceNotFoundException exception.
	 *
	 * @param authToken the auth token
	 * @param guid the guid
	 * @param officeSpaceId the office space id
	 * @param updatedOffice the updated office
	 * @throws OfficeSpaceNotFoundException the office space not found exception
	 */
	public void removeOfficeSpace ( String authToken, String guid,
                                    String officeSpaceId , OfficeSpace updatedOffice) throws OfficeSpaceNotFoundException
	{
		if ( officeSpaceMap.containsKey( guid ) )
		{
			officeSpaceMap.remove( guid );
		}
		else
		{
			throw new OfficeSpaceNotFoundException();
		}
	}	
	
	/**
	 * The new Rating is added to officeSpaceRatingMap within the officeSpaceMap,
	 * if the office space id is not found - OfficeSpaceNotFoundException is thrown;
	 * if the rater already provided his/her rating - RatingAlreadyExistsException is thrown.
	 *
	 * @param authToken the auth token
	 * @param renterId the renter id
	 * @param officeSpaceId the office space id
	 * @param rating the rating
	 * @throws OfficeSpaceNotFoundException the office space not found exception
	 * @throws RatingAlreadyExistsException the rating already exists exception
	 */
	public void rateOfficeSpace ( String authToken, String renterId,
			                      String officeSpaceId, Rating rating ) throws OfficeSpaceNotFoundException, RatingAlreadyExistsException 
	{
		if ( officeSpaceMap.containsKey( officeSpaceId ) )
		{
			OfficeSpace tempOfficeSpace;
            Map<String, Rating> tempOfficeSpaceRatingMap;
			tempOfficeSpace = officeSpaceMap.get( officeSpaceId );
			tempOfficeSpaceRatingMap = tempOfficeSpace.getRatings();
			if ( !tempOfficeSpaceRatingMap.containsKey( renterId ) )
			{
				tempOfficeSpaceRatingMap.put(renterId, rating );
			}
			else
			{
				throw new RatingAlreadyExistsException();
			}
			tempOfficeSpace.setRatings( tempOfficeSpaceRatingMap );
			officeSpaceMap.put( officeSpaceId, tempOfficeSpace );
		}
		else
		{
			throw new OfficeSpaceNotFoundException();
		}
	}
	
	/**
	 * The Rating correspondent to renterId is to be removed from officeSpaceRatingMap within the officeSpaceMap,
	 * if office space id is not found - OfficeSpaceNotFoundException is thrown;
	 * if renterId is not found - RatingNotFoundExcepion is thrown.
	 *
	 * @param authToken the auth token
	 * @param renterId the renter id
	 * @param officeSpaceId the office space id
	 * @throws OfficeSpaceNotFoundException the office space not found exception
	 * @throws RatingNotFoundExcepion the rating not found excepion
	 */
	public void removeOfficeSpaceRating ( String authToken, String renterId,
                                          String officeSpaceId ) throws OfficeSpaceNotFoundException, RatingNotFoundExcepion 
    {
		if ( officeSpaceMap.containsKey( officeSpaceId ) )
		{
			OfficeSpace tempOfficeSpace;
            Map<String, Rating> tempOfficeSpaceRatingMap;
			tempOfficeSpace = officeSpaceMap.get( officeSpaceId );
			tempOfficeSpaceRatingMap = tempOfficeSpace.getRatings();
			if ( tempOfficeSpaceRatingMap.containsKey( renterId ) )
			{
				tempOfficeSpaceRatingMap.remove( renterId );
			}
			else
			{
				throw new RatingNotFoundExcepion();
			}
			tempOfficeSpace.setRatings( tempOfficeSpaceRatingMap );
			officeSpaceMap.put( officeSpaceId, tempOfficeSpace );
		}
		else
		{
			throw new OfficeSpaceNotFoundException();
		}
    }
	
	
	/**
	 * Returns the list all Ratings correspondent to office space the officeSpaceMap,
	 * if the office space id is not found - OfficeSpaceNotFoundException is thrown.
	 *
	 * @param authToken the auth token
	 * @param officeSpaceId the office space id
	 * @return List<Rating>
	 * @throws OfficeSpaceNotFoundException the office space not found exception
	 */
	public List<Rating> getOfficeSpaceRatingList  ( String authToken, String officeSpaceId ) throws OfficeSpaceNotFoundException 
	{
		if ( officeSpaceMap.containsKey( officeSpaceId ) )
		{
			OfficeSpace tempOfficeSpace;
			tempOfficeSpace = officeSpaceMap.get( officeSpaceId );
			List<Rating> tempOfficeSpaceRatingList;
			tempOfficeSpaceRatingList = tempOfficeSpace.getAllRatings();
			return tempOfficeSpaceRatingList;
		}
		else
		{
			throw new OfficeSpaceNotFoundException();
		}
	}
}
