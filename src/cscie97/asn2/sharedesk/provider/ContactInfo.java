package cscie97.asn2.sharedesk.provider;

public class ContactInfo
{
	private String firstName;
	private String lastName;
	private String email;
	//the following format should be enforced: +1(617)-777-7777
	private String phoneNumber;
	private String dateOfBirth;
	private Address address;
	
	
	public ContactInfo (String firstName, String lastName, String email, 
						String phoneNumber, String dateOfBirth, Address address)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * mutator method for firstName attribute
	 * @param firstName
	 */
	public void setFirstName ( String firstName )
	{
		this.firstName = firstName;
	}
	
	/**
	 * accessor method for firstName attribute
	 * @return String
	 */
	public String getFirstName ()
	{
		return this.firstName;
	}
	
	/**
	 * mutator method for firstName attribute
	 * @param lastName
	 */
	public void setLastName ( String lastName )
	{
		this.lastName = lastName;
	}
	
	/**
	 * accessor method for lastName attribute
	 * @return String
	 */
	public String getLastName ()
	{
		return this.lastName;
	}
	
	/**
	 * mutator method for email attribute
	 * @param email
	 */
	public void setEmail ( String email )
	{
		this.email = email;
	}
	
	/**
	 * accessor method for email attribute
	 * @return String
	 */
	public String getEmail ()
	{
		return this.email;
	}
	
	/**
	 * mutator method for phoneNumber attribute
	 * @param phoneNumber
	 */
	public void setPhoneNumber ( String phoneNumber )
	{
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * accessor method for phoneNumber attribute
	 * @return String
	 */
	public String getPhoneNumber ()
	{
		return this.phoneNumber;
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
	
	/**
	 * mutator method for dateOfBirth attribute
	 * @param dateOfBirth
	 */
	public void setDateOfBirth ( String dateOfBirth )
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * accessor method for dateOfBirth attribute
	 * @return String
	 */
	public String getDateOfBirth ()
	{
		return this.dateOfBirth;
	}
	
	
}
