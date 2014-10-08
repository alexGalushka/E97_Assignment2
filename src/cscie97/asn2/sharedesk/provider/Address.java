package cscie97.asn2.sharedesk.provider;

public class Address

{
	//ISO format java.util.Locale
	private String countryCode;
	private String street1; 
	private String street2;
	private String city;
	private String state;
	private String zipcode;
	
	public Address (String countryCode, String street1, String street2,
			        String city, String state, String zipcode)
	{
		this.countryCode = countryCode;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	/**
	 * mutator method for countryCode attribute
	 * @param countryCode
	 */
	public void setCountryCode ( String countryCode )
	{
		this.countryCode = countryCode;
	}
	
	/**
	 * accessor method for countryCode attribute
	 * @return String
	 */
	public String getCountryCode ()
	{
		return this.countryCode;
	}
	
	/**
	 * mutator method for street1 attribute
	 * @param street1
	 */
	public void setStreet1 ( String street1 )
	{
		this.street1 = street1;
	}
	
	/**
	 * accessor method for street1 attribute
	 * @return String
	 */
	public String getStreet1 ()
	{
		return this.street1;
	}
	
	/**
	 * mutator method for street2 attribute
	 * @param street2
	 */
	public void setStreet2 ( String street2 )
	{
		this.street2 = street2;
	}
	
	/**
	 * accessor method for street2 attribute
	 * @return String
	 */
	public String getStreet2 ()
	{
		return this.street2;
	}
	
	/**
	 * mutator method for city attribute
	 * @param city
	 */
	public void setCity ( String city )
	{
		this.city = city;
	}
	
	/**
	 * accessor method for city attribute
	 * @return String
	 */
	public String getCity ()
	{
		return this.city;
	}
	
	/**
	 * mutator method for state attribute
	 * @param state
	 */
	public void setState ( String state )
	{
		this.state = state;
	}
	
	/**
	 * accessor method for state attribute
	 * @return String
	 */
	public String getState ()
	{
		return this.state;
	}
	
	/**
	 * mutator method for zipcode attribute
	 * @param zipcode
	 */
	public void setZipcode ( String zipcode )
	{
		this.zipcode = zipcode;
	}
	
	/**
	 * accessor method for zipcode attribute
	 * @return String
	 */
	public String getZipcode ()
	{
		return this.zipcode;
	}
	
}
