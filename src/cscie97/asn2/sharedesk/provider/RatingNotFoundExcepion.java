package cscie97.asn2.sharedesk.provider;

public class RatingNotFoundExcepion extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = 5398777165845179444L;
	public RatingNotFoundExcepion()
	{ 
		super();
	}
	public RatingNotFoundExcepion(String message) 
	{
		super(message);
	}
}