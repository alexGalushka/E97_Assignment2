package cscie97.asn2.sharedesk.provider;

public class Capacity
{
	private Integer numberOfPeople;
	private Integer workSpaces;
	private Float squareFootage;
	
	public Capacity ( Integer numberOfPeople, Integer workSpaces, Float squareFootage )
	{
		this.workSpaces = workSpaces;
		this.numberOfPeople = numberOfPeople;
		this.squareFootage = squareFootage;
	}
	
	/**
	 * mutator method for numberOfPeople attribute
	 * @param numberOfPeople
	 */
	public void setNumberOfPeople ( Integer numberOfPeople )
	{
		this.numberOfPeople = numberOfPeople;
	}
	
	/**
	 * accessor method for numberOfPeople attribute
	 * @return Integer
	 */
	public Integer getNumberOfPeople ()
	{
		return this.numberOfPeople;
	}
	
	/**
	 * mutator method for workSpaces attribute
	 * @param workSpaces
	 */
	public void setWorkSpaces ( Integer workSpaces )
	{
		this.workSpaces = workSpaces;
	}
	
	/**
	 * accessor method for workSpaces attribute
	 * @return Integer
	 */
	public Integer getWorkSpaces ()
	{
		return this.workSpaces;
	}
	
	/**
	 * mutator method for squareFootage attribute
	 * @param squareFootage
	 */
	public void setSquareFootage ( Float squareFootage )
	{
		this.squareFootage = squareFootage;
	}
	
	/**
	 * accessor method for squareFootage attribute
	 * @return Integer
	 */
	public Float getSquareFootage ()
	{
		return this.squareFootage;
	}
}
