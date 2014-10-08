package cscie97.asn2.sharedesk.provider;

public class Rating 
{

	private String authorsId;
	private String comment;
	private String date;
	private Integer stars;
	
	public Rating (	String authorsId, String comment,
			        String date, Integer stars )
	{
		this.authorsId = authorsId;
		this.comment = comment;
		this.date = date;
		this.stars = stars;
	}
	
	/**
	 * mutator method for authorsId attribute
	 * @param period
	 */
	public void setAuthorsId ( String authorsId )
	{
		this.authorsId = authorsId;
	}
	
	/**
	 * accessor method for authorsId attribute
	 * @return String
	 */
	public String getAuthorsId ()
	{
		return this.authorsId;
	}
	
	/**
	 * mutator method for comment attribute
	 * @param comment
	 */
	public void setComment ( String comment )
	{
		this.comment = comment;
	}
	
	/**
	 * accessor method for comment attribute
	 * @return String
	 */
	public String getComment ()
	{
		return this.comment;
	}
	
	/**
	 * mutator method for date attribute
	 * @param date
	 */
	public void setDate ( String date )
	{
		this.date = date;
	}
	
	/**
	 * accessor method for date attribute
	 * @return String
	 */
	public String getDate ()
	{
		return this.date;
	}
	
	/**
	 * mutator method for stars attribute
	 * @param stars
	 */
	public void setStars ( Integer stars )
	{
		this.stars = stars;
	}
	
	/**
	 * accessor method for stars attribute
	 * @return Integer
	 */
	public Integer getStars ()
	{
		return this.stars;
	}
}
