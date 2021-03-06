package cscie97.asn2.sharedesk.provider;


/**
 * The Class Account.
 */
public class Account
{
	
	/** The pay pal account number. */
	private Integer payPalAccountNumber;
	
	/**
	 * Instantiates a new account.
	 *
	 * @param payPalAccountNumber the pay pal account number
	 */
	public Account ( Integer payPalAccountNumber )
	{
		this.payPalAccountNumber = payPalAccountNumber;
	}
	
	/**
	 * mutator method for payPalAccountNumber attribute.
	 *
	 * @param payPalAccountNumber the new pay pal account number
	 */
	public void setPayPalAccountNumber ( Integer payPalAccountNumber )
	{
		this.payPalAccountNumber = payPalAccountNumber;
	}
	
	/**
	 * accessor method for payPalAccountNumber attribute.
	 *
	 * @return Integer
	 */
	public Integer getPayPalAccountNumber ()
	{
		return this.payPalAccountNumber;
	}
}
