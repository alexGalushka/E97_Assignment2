package cscie97.asn2.sharedesk.provider;

public class RatingAlreadyExistsException extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = -883996508627597612L;	
	public RatingAlreadyExistsException()
	{ 
		super();
	}
	public RatingAlreadyExistsException(String message) 
	{
		super(message);
	}
}