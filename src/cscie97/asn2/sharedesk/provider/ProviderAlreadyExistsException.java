package cscie97.asn2.sharedesk.provider;

public class ProviderAlreadyExistsException extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = 8222616516878201026L;

	public ProviderAlreadyExistsException()
	{ 
		super();
	}
	public ProviderAlreadyExistsException( String message ) 
	{
		super( message );
	}
}
