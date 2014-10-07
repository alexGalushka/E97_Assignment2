package cscie97.asn2.sharedesk.provider;

public class Facility
{
	private String category;
	private String type;
	
	public Facility ( String category, String type )
	{
		this.category = category;
		this.category = type;
	}
	
	/**
	 * mutator method for category attribute
	 * @param category
	 */
	public void setCategory ( String category )
	{
		this.category = category;
	}
	
	/**
	 * accessor method for category attribute
	 * @return String
	 */
	public String getCategory ()
	{
		return this.category;
	}
	
	/**
	 * mutator method for type attribute
	 * @param type
	 */
	public void setType ( String type )
	{
		this.type = type;
	}
	
	/**
	 * accessor method for type attribute
	 * @return String
	 */
	public String getType ()
	{
		return this.type;
	}
	
}
