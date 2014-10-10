package cscie97.asn2.sharedesk.provider;

public class Account
{
	private Integer payPalAccountNumber;
	
	public Account ( Integer payPalAccountNumber )
	{
		this.payPalAccountNumber = payPalAccountNumber;
	}
	
	/**
	 * mutator method for payPalAccountNumber attribute
	 * @param payPalAccountNumber
	 */
	public void setPayPalAccountNumber ( Integer payPalAccountNumber )
	{
		this.payPalAccountNumber = payPalAccountNumber;
	}
	
	/**
	 * accessor method for payPalAccountNumber attribute
	 * @return Integer
	 */
	public Integer getPayPalAccountNumber ()
	{
		return this.payPalAccountNumber;
	}
}
