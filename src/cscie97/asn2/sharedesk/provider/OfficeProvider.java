package cscie97.asn2.sharedesk.provider;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfficeProvider 
{
	private URI picture;
	private ContactInfo contact;
	private Map<String, OfficeSpace> officeSpacesMap;
	private Map<String, Rating> providerRatingsMap;
	private Account account;
	private String officeProviderGuid;
	
	public OfficeProvider ()
	{
		this.picture = null;
		this.contact = new ContactInfo("", "", "", "", "", null);
		this.officeSpacesMap = new HashMap<String, OfficeSpace>();
		this.account = new Account( 0 );
		this.officeProviderGuid = "";
	}
	
	public OfficeProvider ( URI picture, ContactInfo contact,
			               Map<String, OfficeSpace> officeSpaces, Account account, String officeProviderGuid )
	{
		this.picture = picture;
		this.contact = contact;
		this.officeSpacesMap = officeSpaces;
		this.account = account;
		this.officeProviderGuid = officeProviderGuid;
	}
	
	
	/**
	 * mutator method for officeProviderGuid attribute
	 * @param officeProviderGuid
	 */
	public void setOfficeProviderGuid ( String officeProviderGuid )
	{
		this.officeProviderGuid = officeProviderGuid;
	}
	
	/**
	 * accessor method for officeProviderGuid attribute
	 * @return String
	 */
	public String getOfficeProviderGuid ()
	{
		return this.officeProviderGuid;
	}
	
	/**
	 * mutator method for account attribute
	 * @param account
	 */
	public void setAccount ( Account account )
	{
		this.account = account;
	}
	
	/**
	 * accessor method for account attribute
	 * @return Account
	 */
	public Account getAccount ()
	{
		return this.account;
	}
	
	/**
	 * mutator method for officeSpacesMap attribute
	 * @param officeSpacesMap
	 */
	public void setOfficeSpaces ( Map<String, OfficeSpace> officeSpacesMap )
	{
		this.officeSpacesMap = officeSpacesMap;
	}
	
	/**
	 * accessor method for officeSpacesMap attribute
	 * @return Map<String, OfficeSpace>
	 */
	public Map<String, OfficeSpace> getOfficeSpaces ()
	{
		return this.officeSpacesMap;
	}

	/**
	 * mutator method for providerRatingsMap attribute
	 * @param providerRatingsMap
	 */
	public void setProviderRatingsMap ( Map<String, Rating> providerRatingsMap )
	{
		this.providerRatingsMap = providerRatingsMap;
	}
	
	/**
	 * accessor method for providerRatingsMap attribute
	 * @return Map<String, Rating>
	 */
	public Map<String, Rating> getProviderRatingsMap ()
	{
		return this.providerRatingsMap;
	}
	
	/**
	 * getter method for all ratings per office provider
	 * @return List<Rating>
	 */
	public List<Rating> getAllRatings()
	{
		Collection<Rating> tempSet;
		tempSet = providerRatingsMap.values();
		List<Rating> officeProviderRatingsList = new ArrayList<Rating> ( tempSet );
		return officeProviderRatingsList;
	}
	
	/**
	 * mutator method for contact attribute
	 * @param contact
	 */
	public void setContact ( ContactInfo contact )
	{
		this.contact = contact;
	}
	
	/**
	 * accessor method for contact attribute
	 * @return ContactInfo
	 */
	public ContactInfo getContact ()
	{
		return this.contact;
	}
	
	/**
	 * mutator method for picture attribute
	 * @param picture
	 */
	public void setPicture ( URI picture )
	{
		this.picture = picture;
	}
	
	/**
	 * accessor method for picture attribute
	 * @return URI
	 */
	public URI getPicture ()
	{
		return this.picture;
	}
	

}
