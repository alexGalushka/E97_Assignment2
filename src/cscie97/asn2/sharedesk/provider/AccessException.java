package cscie97.asn2.sharedesk.provider;

public class AccessException extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = -4710568791280793495L;

	public AccessException()
	{ 
		super();
	}
	public AccessException( String message ) 
	{
		super( message );
	}
}
