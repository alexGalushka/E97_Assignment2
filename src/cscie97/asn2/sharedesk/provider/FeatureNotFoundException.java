package cscie97.asn2.sharedesk.provider;

public class FeatureNotFoundException extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = 1L;
	
	public FeatureNotFoundException()
	{ 
		super();
	}
	public FeatureNotFoundException(String message) 
	{
		super(message);
	}
}
