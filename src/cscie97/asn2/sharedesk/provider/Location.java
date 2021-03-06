package cscie97.asn2.sharedesk.provider;


/**
 * The Class Location.
 */
public class Location
{
	
	/** The longitude. */
	private Float longitude;
	
	/** The latitude. */
	private Float latitude;
	
	/** The address. */
	private Address address;
	
	/**
	 * Instantiates a new location.
	 *
	 * @param address the address
	 * @param longitude the longitude
	 * @param latitude the latitude
	 */
	public Location (Address address, Float longitude, Float latitude)
	{
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	/**
	 * mutator method for longitude attribute.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude ( Float longitude )
	{
		this.longitude = longitude;
	}
	
	/**
	 * accessor method for longitude attribute.
	 *
	 * @return Float
	 */
	public Float getLongitude ()
	{
		return this.longitude;
	}
	
	/**
	 * mutator method for latitude attribute.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude ( Float latitude )
	{
		this.latitude = latitude;
	}
	
	/**
	 * accessor method for latitude attribute.
	 *
	 * @return Float
	 */
	public Float getLatitude ()
	{
		return this.latitude;
	}
	
	/**
	 * mutator method for address attribute.
	 *
	 * @param address the new address
	 */
	public void setAddress ( Address address )
	{
		this.address = address;
	}
	
	/**
	 * accessor method for address attribute.
	 *
	 * @return Address
	 */
	public Address getAddress ()
	{
		return this.address;
	}
}
