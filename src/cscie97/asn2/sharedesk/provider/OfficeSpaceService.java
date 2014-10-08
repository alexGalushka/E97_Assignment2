package cscie97.asn2.sharedesk.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OfficeSpaceService
{
	
	private Map<String, OfficeSpace> officeSpaceMap;
	private List<OfficeSpace> officeSpaceList;
	
	public OfficeSpaceService ()
	{
		officeSpaceMap = new HashMap<String, OfficeSpace>();	
		officeSpaceList = new ArrayList<OfficeSpace>();
	}
	
	/**
	 * Creates a new OfficeSpace: add office space to officeSpaceMap; check if it exists already
	 * and throws OfficeSpaceAlreadyExistException if it is. If authentication fails - throw AccessException.
	 * Rating Field is initialized here.
	 * Note: officeSpaceId has to be generated first! Check for officeSpaceIds and providerId in the id buckets,
	 * if this check fails throw the 
	 * @param authToken
	 * @param officeSpace
	 * @param guid
	 * @throws OfficeSpaceAlreadyExistException
	 * @throws AccessException
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
	 * @return OfficeSpace
	 */
	public OfficeSpace getOfficeSpace ( String authToken, String guid )
	{
		return this.officeSpaceMap.get( guid );
	}
	
	/**
	 * @return all values (office spaces) from officeSpaceMap
	 */
	public List<OfficeSpace> getOfficeSpaceList ()
	{
		return this.officeSpaceList = (List<OfficeSpace>) officeSpaceMap.values();
		
	}
	
	public void updateOfficeSpace ( String authToken, String guid,
			                        String officeSpaceId , OfficeSpace office)
	{
		if ( officeSpaceMap.containsKey( guid ) )
		{
			officeSpaceMap.put( guid, officeSpace );
		}
		else
		{
			throw new OfficeSpaceAlreadyExistException();
		}
	}
	
}
