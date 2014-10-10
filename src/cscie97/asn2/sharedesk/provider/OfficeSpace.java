package cscie97.asn2.sharedesk.provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfficeSpace
{
	
	private List<String> commonAccess;
	private Capacity capacity;
	private Facility facility;
	private Features features;
	private List<Image> images;
	private Location location;
	private List<Rate> rates;
	private Map<String, Rating> ratings;
	private String officeSpaceGuid;
	//office space name
	private String name; 
	
	public OfficeSpace ( List<String> commonAccess, Capacity capacity, Facility facility,
			            Features features, List<Image> images, Location location,
			            List<Rate> rates, Map<String, Rating> ratings, String name, String officeSpaceGuid )
	{
		this.capacity = capacity;
		this.commonAccess = commonAccess;
		this.facility = facility;
		this.features = features;
		this.images = images;
		this.location = location;
		this.name = name;
		this.rates = rates;
		this.ratings = ratings;
		this.officeSpaceGuid = officeSpaceGuid;
	}
	
	
	public OfficeSpace ()
	{
		this.capacity = new Capacity( null, null, null );
		this.commonAccess = new ArrayList<String>();
		this.facility = new Facility( null, null );
		this.features = new Features();
		this.images = new ArrayList<Image>();
		this.location = new Location(null, null, null);
		this.name = "";
		this.officeSpaceGuid = "";
		this.rates =  new ArrayList<Rate>();
		this.ratings = new HashMap<String, Rating>();
	}
	
	/**
	 * accessor method for officeSpaceGuid attribute
	 * @return String
	 */
	public String getOfficeSpaceGuid ()
	{
		return this.officeSpaceGuid;
	}
	
	/**
	 * mutator method for officeSpaceGuid attribute
	 * @param officeSpaceGuid
	 */
	public void setOfficeSpaceGuid ( String officeSpaceGuid )
	{
		this.officeSpaceGuid = officeSpaceGuid;
	}
	
	/**
	 * mutator method for commonAccess attribute
	 * @param commonAccess
	 */
	public void setCommonAccess ( List<String> commonAccess )
	{
		this.commonAccess = commonAccess;
	}
	
	/**
	 * accessor method for commonAccess attribute
	 * @return commonAccess
	 */
	public List<String> getCommonAccess()
	{
		return this.commonAccess;
	}
	
	
	/**
	 * mutator method for capacity attribute
	 * @param capacity
	 */
	public void setCapacity ( Capacity capacity )
	{
		this.capacity = capacity;
	}
	
	/**
	 * accessor method for capacity attribute
	 * @return Capacity
	 */
	public Capacity getCapacity()
	{
		return this.capacity;
	}
	
	/**
	 * mutator method for facility attribute
	 * @param facility
	 */
	public void setFacility ( Facility facility )
	{
		this.facility = facility;
	}
	
	/**
	 * accessor method for facility attribute
	 * @return Facility
	 */
	public Facility getFacility()
	{
		return this.facility;
	}
	
	/**
	 * mutator method for features attribute
	 * @param features
	 */
	public void setFeatures ( Features features )
	{
		this.features = features;
	}
	
	/**
	 * accessor method for features attribute
	 * @return Features
	 */
	public Features getFeatures()
	{
		return this.features;
	}
	

	/**
	 * mutator method for images attribute
	 * @param images
	 */
	public void setImages ( List<Image> images )
	{
		this.images = images;
	}
	
	/**
	 * accessor method for images attribute
	 * @return List<Image>
	 */
	public List<Image> getImages()
	{
		return this.images;
	}
	
	/**
	 * mutator method for location attribute
	 * @param location
	 */
	public void setLocation ( Location location )
	{
		this.location = location;
	}
	
	/**
	 * accessor method for location attribute
	 * @return Location
	 */
	public Location getLocation()
	{
		return this.location;
	}
	
	/**
	 * mutator method for rates attribute
	 * @param rates
	 */
	public void setRates ( List<Rate> rates )
	{
		this.rates = rates;
	}
	
	/**
	 * accessor method for rates attribute
	 * @return List<Rate>
	 */
	public List<Rate> geRates()
	{
		return this.rates;
	}
	
	/**
	 * mutator method for ratings attribute
	 * @param ratings
	 */
	public void setRatings ( Map<String, Rating> ratings )
	{
		this.ratings = ratings;
	}
	
	/**
	 * accessor method for ratings attribute
	 * @return Map<String, Rating>
	 */
	public Map<String, Rating> getRatings()
	{
		return this.ratings;
	}
	
	/**
	 * getter method for all ratings per office space
	 * @return List<Rating>
	 */
	public List<Rating> getAllRatings()
	{
		Collection<Rating> tempSet;
		tempSet = ratings.values();
		List<Rating> officeSpaceRatingsList = new ArrayList<Rating> ( tempSet );
		return officeSpaceRatingsList;
	}
	
	/**
	 * mutator method for ratings association
	 * @param ratings
	 * @throws OfficeSpaceNotFoundException 
	 */
	public void setRating( Rating rating, String authorId ) throws RatingNotFoundExcepion
	{ 
		if ( ratings.containsKey( authorId ) )
		{
			this.ratings.put( authorId, rating );
		}
		else
		{
			throw new RatingNotFoundExcepion();
		}
	}
	
	/**
	 * accessor method for rating association
	 * @return Rating
	 * @throws RatingNotFoundExcepion 
	 */
	public Rating getRating( String authorId ) throws RatingNotFoundExcepion
	{
		if ( ratings.containsKey( authorId ) )
		{	
			return this.ratings.get( authorId );
		}
		else
		{
			throw new RatingNotFoundExcepion();
		}
	}
	
	/**
	 * mutator method for name attribute
	 * @param name
	 */
	public void setName ( String  name )
	{
		this.name = name;
	}
	
	/**
	 * accessor method for name attribute
	 * @return String
	 */
	public String geName()
	{
		return name;
	}
	
	
}
