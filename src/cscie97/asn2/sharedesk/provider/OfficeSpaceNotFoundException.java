package cscie97.asn2.sharedesk.provider;

public class OfficeSpaceNotFoundException extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = -5700009222647459810L;

	public OfficeSpaceNotFoundException()
	{ 
		super();
	}
	public OfficeSpaceNotFoundException(String message) 
	{
		super(message);
	}
}
