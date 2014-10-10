package cscie97.asn2.sharedesk.provider;

public class ShareDeskServiceAPI
{
	private OfficeProviderService officeProviderService; 

	private GuidGenerator guidGenerator;
	
	public ShareDeskServiceAPI() 
	{
		guidGenerator = new GuidGenerator();
		officeProviderService = new OfficeProviderService();
	}
			
	/**
	 * mutator method for officeProviderService association
	 * @param officeProviderService
	 */
	public void setOfficeProviderService ( OfficeProviderService officeProviderService )
	{
		this.officeProviderService = officeProviderService;
	}
	
	/**
	 * accessor method for officeProviderService association
	 * @return officeProviderService
	 */
	public OfficeProviderService getOfficeProviderService ()
	{
		return this.officeProviderService;
	}
	
	/**
	 * mutator method for guidGenerator association
	 * @param GuidGenerator
	 */
	public void setGuidGenerator ( GuidGenerator guidGenerator )
	{
		this.guidGenerator = guidGenerator;
	}
	
	/**
	 * accessor method for guidGenerator association
	 * @return guidGenerator
	 */
	public GuidGenerator getGuidGenerator ()
	{
		return this.guidGenerator;
	}
	
	
}
