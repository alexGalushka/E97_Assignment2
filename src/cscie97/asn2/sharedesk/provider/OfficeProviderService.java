package cscie97.asn2.sharedesk.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The Class OfficeProviderService.
 */
public class OfficeProviderService
{
	
	/** The office provider map. */
	private Map<String, OfficeProvider> officeProviderMap;
	
	/**
	 * Instantiates a new office provider service.
	 */
	public OfficeProviderService ()
	{
		this.officeProviderMap = new HashMap<String, OfficeProvider>();
	}
	
	/**
	 * Creates a new provider: add provider to the providerMap;
	 * check if it exists already and throws ProviderAlreadyExistException if it does.
	 *
	 * @param authToken the auth token
	 * @param provider the provider
	 * @param providerId the provider id
	 * @throws ProviderAlreadyExistsException the provider already exists exception
	 */
	public void createProvider ( String authToken, OfficeProvider provider, String providerId ) throws ProviderAlreadyExistsException
	{
		if ( !this.officeProviderMap.containsKey( providerId ) )
		{
			this.officeProviderMap.put ( providerId, provider );
		}
		else
		{
			throw new ProviderAlreadyExistsException();
		}
	}
	
	/**
	 * Returns provider per passed in providerId,
	 * if there is no match – throws ProviderNotFoundException .
	 *
	 * @param authToken the auth token
	 * @param providerId the provider id
	 * @return the provider
	 * @throws ProviderNotFoundException the provider not found exception
	 */
	public OfficeProvider getProvider( String authToken, String providerId ) throws ProviderNotFoundException
	{
		if ( this.officeProviderMap.containsKey( providerId ) )
		{
			return officeProviderMap.get( providerId );
		}
		else
		{
			throw new ProviderNotFoundException();
		}
		
	}
	
	/**
	 * Returns whole list of providers.
	 *
	 * @param authToken the auth token
	 * @return List<OfficeProvider>
	 */
	public List<OfficeProvider> getProviderList ( String authToken )
	{
		Collection<OfficeProvider> tempSet;
		tempSet = officeProviderMap.values();
		List<OfficeProvider> officeProviderGuidList = new ArrayList<OfficeProvider> ( tempSet );
		return officeProviderGuidList;
	}
	
	/**
	 * Updates the provider, new Provider instance has to be passed in.
	 * If providerId not found, throws ProviderNotFoundException.
	 *
	 * @param authToken the auth token
	 * @param providerId the provider id
	 * @param provider the provider
	 * @throws ProviderNotFoundException the provider not found exception
	 */
	public void updateProvider ( String authToken, String providerId, OfficeProvider provider) throws ProviderNotFoundException
	{
		if ( this.officeProviderMap.containsKey( providerId ) )
		{
			officeProviderMap.put( providerId, provider );
		}
		else
		{
			throw new ProviderNotFoundException();
		}
	}
	
	/**
	 * Deleted the provider.
	 * If providerId not found, throws ProviderNotFoundException.
	 *
	 * @param authToken the auth token
	 * @param providerId the provider id
	 * @throws ProviderNotFoundException the provider not found exception
	 */
	public void deleteProvider ( String authToken, String providerId ) throws ProviderNotFoundException
	{
		if ( this.officeProviderMap.containsKey( providerId ) )
		{
			officeProviderMap.remove( providerId );
		}
		else
		{
			throw new ProviderNotFoundException();
		}
	}
	
	/**
	 * Rate the provider. Rating is an integer from 0 to 5. The rating value is added to officeProviderRatingsMap.
	 * if it is found throw RatingAlreadyExistsException. ProviderId is checked as well if it's not found
	 *  - ProviderNotFoundException is thrown 
	 *
	 * @param authToken the auth token
	 * @param providerId the provider id
	 * @param renterId the renter id
	 * @param rating the rating
	 * @throws RatingAlreadyExistsException the rating already exists exception
	 * @throws ProviderNotFoundException the provider not found exception
	 */
	public void rateProvider ( String authToken, String providerId,
			                   String renterId , Rating rating ) throws RatingAlreadyExistsException, ProviderNotFoundException 
	{
		if ( officeProviderMap.containsKey( providerId ) )
		{
			OfficeProvider tempOfficeProvider;
            Map<String, Rating> tempOfficeProviderRatingMap;
			tempOfficeProvider = officeProviderMap.get( providerId );
			tempOfficeProviderRatingMap = tempOfficeProvider.getProviderRatingsMap();
			if ( !tempOfficeProviderRatingMap.containsKey( renterId ) )
			{
				tempOfficeProviderRatingMap.put( renterId, rating );
			}
			else
			{
				throw new RatingAlreadyExistsException();
			}
			tempOfficeProvider.setProviderRatingsMap ( tempOfficeProviderRatingMap );
			officeProviderMap.put( providerId, tempOfficeProvider );
		}
		else
		{
			throw new ProviderNotFoundException();
		}
	}
	
	/**
	 * The Rating correspondent to renterId is to be removed from officeProviderRatingMap within the officeSpaceMap,
	 * if office space id is not found - ProviderNotFoundException is thrown;
	 * if renterId is not found - RatingNotFoundExcepion is thrown.
	 *
	 * @param authToken the auth token
	 * @param providerId the provider id
	 * @param renterId the renter id
	 * @throws RatingNotFoundExcepion the rating not found excepion
	 * @throws ProviderNotFoundException the provider not found exception
	 */
	public void removeProviderRating ( String authToken, String providerId,
			                           String renterId) throws RatingNotFoundExcepion, ProviderNotFoundException
	{
		if ( officeProviderMap.containsKey( providerId ) )
		{
			OfficeProvider tempOfficeProvider;
            Map<String, Rating> tempOfficeProviderRatingMap;
			tempOfficeProvider = officeProviderMap.get( providerId );
			tempOfficeProviderRatingMap = tempOfficeProvider.getProviderRatingsMap();
			if ( tempOfficeProviderRatingMap.containsKey( renterId ) )
			{
				tempOfficeProviderRatingMap.remove( renterId );
			}
			else
			{
				throw new RatingNotFoundExcepion();
			}
			tempOfficeProvider.setProviderRatingsMap ( tempOfficeProviderRatingMap );
			officeProviderMap.put( providerId, tempOfficeProvider );
		}
		else
		{
			throw new ProviderNotFoundException();
		}
	}
	
	/**
	 * Gets the rating list.
	 *
	 * @param authToken the auth token
	 * @param providerId the provider id
	 * @return the rating list
	 * @throws OfficeSpaceNotFoundException the office space not found exception
	 */
	public List<Rating> getRatingList ( String authToken, String providerId ) throws OfficeSpaceNotFoundException
	{
		if ( officeProviderMap.containsKey( providerId ) )
		{
			OfficeProvider tempOfficeProvider;
			tempOfficeProvider = officeProviderMap.get( providerId );
			List<Rating> tempOfficeProviderRatingList;
			tempOfficeProviderRatingList = tempOfficeProvider.getAllRatings();
			return tempOfficeProviderRatingList;
		}
		else
		{
			throw new OfficeSpaceNotFoundException();
		}
	}
}
