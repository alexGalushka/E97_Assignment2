package cscie97.asn2.sharedesk.provider;


/**
 * The Class ShareDeskServiceAPI.
 */
public class ShareDeskServiceAPI
{
	
	/** The office provider service. */
	private OfficeProviderService officeProviderService; 

	/** The guid generator. */
	private GuidGenerator guidGenerator;
	
	/**
	 * Instantiates a new share desk service api.
	 */
	public ShareDeskServiceAPI() 
	{
		guidGenerator = new GuidGenerator();
		officeProviderService = new OfficeProviderService();
	}
			
	/**
	 * mutator method for officeProviderService association.
	 *
	 * @param officeProviderService the new office provider service
	 */
	public void setOfficeProviderService ( OfficeProviderService officeProviderService )
	{
		this.officeProviderService = officeProviderService;
	}
	
	/**
	 * accessor method for officeProviderService association.
	 *
	 * @return officeProviderService
	 */
	public OfficeProviderService getOfficeProviderService ()
	{
		return this.officeProviderService;
	}
	
	/**
	 * mutator method for guidGenerator association.
	 *
	 * @param guidGenerator the new guid generator
	 */
	public void setGuidGenerator ( GuidGenerator guidGenerator )
	{
		this.guidGenerator = guidGenerator;
	}
	
	/**
	 * accessor method for guidGenerator association.
	 *
	 * @return guidGenerator
	 */
	public GuidGenerator getGuidGenerator ()
	{
		return this.guidGenerator;
	}
	
	
}
