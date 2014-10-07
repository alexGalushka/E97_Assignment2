package cscie97.asn2.sharedesk.provider;

public class Location
{
	private Float longitude;
	private Float latitude;
	private Address address;
	
	public Location (Address address, Float longitude, Float latitude)
	{
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	/**
	 * mutator method for longitude attribute
	 * @param longitude
	 */
	public void setLongitude ( Float longitude )
	{
		this.longitude = longitude;
	}
	
	/**
	 * accessor method for longitude attribute
	 * @return Float
	 */
	public Float getLongitude ()
	{
		return this.longitude;
	}
	
	/**
	 * mutator method for latitude attribute
	 * @param latitude
	 */
	public void setLatitude ( Float latitude )
	{
		this.latitude = latitude;
	}
	
	/**
	 * accessor method for latitude attribute
	 * @return Float
	 */
	public Float getLatitude ()
	{
		return this.latitude;
	}
	
	/**
	 * mutator method for address attribute
	 * @param address
	 */
	public void setAddress ( Address address )
	{
		this.address = address;
	}
	
	/**
	 * accessor method for address attribute
	 * @return Address
	 */
	public Address getAddress ()
	{
		return this.address;
	}
}
