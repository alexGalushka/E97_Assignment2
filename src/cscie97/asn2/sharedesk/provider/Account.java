package cscie97.asn2.sharedesk.provider;

public class Account
{
	private String payPalAccountNumber;
	
	public Account ( String payPalAccountNumber )
	{
		this.payPalAccountNumber = payPalAccountNumber;
	}
	
	/**
	 * mutator method for payPalAccountNumber attribute
	 * @param payPalAccountNumber
	 */
	public void setPayPalAccountNumber ( String payPalAccountNumber )
	{
		this.payPalAccountNumber = payPalAccountNumber;
	}
	
	/**
	 * accessor method for payPalAccountNumber attribute
	 * @return String
	 */
	public String getPayPalAccountNumber ()
	{
		return this.payPalAccountNumber;
	}
}
