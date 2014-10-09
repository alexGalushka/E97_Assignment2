package cscie97.asn2.sharedesk.provider;

public class ProviderNotFoundException extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = 8530344751450677081L;

	public ProviderNotFoundException()
	{ 
		super();
	}
	public ProviderNotFoundException( String message ) 
	{
		super( message );
	}
}