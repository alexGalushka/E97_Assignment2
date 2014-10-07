package cscie97.asn2.sharedesk.provider;
import java.net.URI;

public class Image
{
	private String description; 
	private String name;
	private URI uri;
	
	public Image ( String desciption, String name, URI uri )
	{
		this.description = desciption;
		this.name = name;
		this.uri = uri;
	}
	
	/**
	 * mutator method for description attribute
	 * @param description
	 */
	public void setDescription ( String description )
	{
		this.description = description;
	}
	
	/**
	 * accessor method for description attribute
	 * @return String
	 */
	public String getDescription ()
	{
		return this.description;
	}
	
	/**
	 * mutator method for name attribute
	 * @param name
	 */
	public void setName ( String name )
	{
		this.name = name;
	}
	
	/**
	 * accessor method for name attribute
	 * @return String
	 */
	public String getName ()
	{
		return this.name;
	}
	
	/**
	 * mutator method for uri attribute
	 * @param uri
	 */
	public void setUri ( URI uri )
	{
		this.uri = uri;
	}
	
	/**
	 * accessor method for uri attribute
	 * @return URI
	 */
	public URI getUri ()
	{
		return this.uri;
	}
	
}
