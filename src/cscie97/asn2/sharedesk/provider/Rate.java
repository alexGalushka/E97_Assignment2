package cscie97.asn2.sharedesk.provider;

public class Rate
{
	//any period the customer can imagine: hour, day, week, month, year, weekend
	private String period;
	//rate in USD, can be even or with cents tail
	private Float rate;
	
	public Rate (String period, Float rate)
	{
		this.period = period;
		this.rate = rate;
	}
	
	/**
	 * mutator method for period attribute
	 * @param period
	 */
	public void setPeriod ( String period )
	{
		this.period = period;
	}
	
	/**
	 * accessor method for period attribute
	 * @return String
	 */
	public String getPeriod ()
	{
		return this.period;
	}
	
	/**
	 * mutator method for period attribute
	 * @param period
	 */
	public void setRate ( Float rate )
	{
		this.rate = rate;
	}
	
	/**
	 * accessor method for rate attribute
	 * @return Float
	 */
	public Float getRate ()
	{
		return this.rate;
	}
	
}
