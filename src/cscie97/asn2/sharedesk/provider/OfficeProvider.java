package cscie97.asn2.sharedesk.provider;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The Class OfficeProvider.
 */
public class OfficeProvider 
{
	
	/** The picture. */
	private URI picture;
	
	/** The contact. */
	private ContactInfo contact;
	
	/** The office spaces map. */
	private Map<String, OfficeSpace> officeSpacesMap;
	
	/** The provider ratings map. */
	private Map<String, Rating> providerRatingsMap;
	
	/** The account. */
	private Account account;
	
	/** The office provider guid. */
	private String officeProviderGuid;
	
	/**
	 * Instantiates a new office provider.
	 */
	public OfficeProvider ()
	{
		this.picture = null;
		this.contact = new ContactInfo("", "", "", "", "", null);
		this.officeSpacesMap = new HashMap<String, OfficeSpace>();
		this.providerRatingsMap = new HashMap<String, Rating>();
		this.account = new Account( 0 );
		this.officeProviderGuid = "";
	}
	
	/**
	 * Instantiates a new office provider.
	 *
	 * @param picture the picture
	 * @param contact the contact
	 * @param officeSpaces the office spaces
	 * @param account the account
	 * @param officeProviderGuid the office provider guid
	 */
	public OfficeProvider ( URI picture, ContactInfo contact,
			               Map<String, OfficeSpace> officeSpaces, Account account, String officeProviderGuid )
	{
		this.picture = picture;
		this.contact = contact;
		this.officeSpacesMap = officeSpaces;
		this.account = account;
		this.officeProviderGuid = officeProviderGuid;
		this.providerRatingsMap = new HashMap<String, Rating>();
	}
	
	
	/**
	 * mutator method for officeProviderGuid attribute.
	 *
	 * @param officeProviderGuid the new office provider guid
	 */
	public void setOfficeProviderGuid ( String officeProviderGuid )
	{
		this.officeProviderGuid = officeProviderGuid;
	}
	
	/**
	 * accessor method for officeProviderGuid attribute.
	 *
	 * @return String
	 */
	public String getOfficeProviderGuid ()
	{
		return this.officeProviderGuid;
	}
	
	/**
	 * mutator method for account attribute.
	 *
	 * @param account the new account
	 */
	public void setAccount ( Account account )
	{
		this.account = account;
	}
	
	/**
	 * accessor method for account attribute.
	 *
	 * @return Account
	 */
	public Account getAccount ()
	{
		return this.account;
	}
	
	/**
	 * mutator method for officeSpacesMap attribute.
	 *
	 * @param officeSpacesMap the office spaces map
	 */
	public void setOfficeSpaces ( Map<String, OfficeSpace> officeSpacesMap )
	{
		this.officeSpacesMap = officeSpacesMap;
	}
	
	/**
	 * accessor method for officeSpacesMap attribute.
	 *
	 * @return Map<String, OfficeSpace>
	 */
	public Map<String, OfficeSpace> getOfficeSpaces ()
	{
		return this.officeSpacesMap;
	}

	/**
	 * mutator method for providerRatingsMap attribute.
	 *
	 * @param providerRatingsMap the provider ratings map
	 */
	public void setProviderRatingsMap ( Map<String, Rating> providerRatingsMap )
	{
		this.providerRatingsMap = providerRatingsMap;
	}
	
	/**
	 * accessor method for providerRatingsMap attribute.
	 *
	 * @return Map<String, Rating>
	 */
	public Map<String, Rating> getProviderRatingsMap ()
	{
		return this.providerRatingsMap;
	}
	
	/**
	 * getter method for all ratings per office provider.
	 *
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
	 * mutator method for contact attribute.
	 *
	 * @param contact the new contact
	 */
	public void setContact ( ContactInfo contact )
	{
		this.contact = contact;
	}
	
	/**
	 * accessor method for contact attribute.
	 *
	 * @return ContactInfo
	 */
	public ContactInfo getContact ()
	{
		return this.contact;
	}
	
	/**
	 * mutator method for picture attribute.
	 *
	 * @param picture the new picture
	 */
	public void setPicture ( URI picture )
	{
		this.picture = picture;
	}
	
	/**
	 * accessor method for picture attribute.
	 *
	 * @return URI
	 */
	public URI getPicture ()
	{
		return this.picture;
	}
	

}
