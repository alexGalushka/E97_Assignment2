package cscie97.asn2.sharedesk.provider;

public class OfficeSpaceAlreadyExistException extends Exception
{	
	/**
	 * serialization
	 */
	private static final long serialVersionUID = -8552991948167999990L;

	public OfficeSpaceAlreadyExistException()
	{ 
		super();
	}
	public OfficeSpaceAlreadyExistException(String message) 
	{
		super(message);
	}
}

