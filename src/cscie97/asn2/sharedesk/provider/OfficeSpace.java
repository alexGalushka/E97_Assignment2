package cscie97.asn2.sharedesk.provider;
import java.util.ArrayList;
import java.util.List;

public class OfficeSpace
{
	
	private List<String> commonAccess;
	private Capacity capacity;
	private Facility facility;
	private Features features;
	private List<Image> images;
	private Location location;
	private List<Rate> rates;
	private List<Rating> ratings;
	//office space name
	private String name; 
	
	public OfficeSpace ( List<String> commonAccess, Capacity capacity, Facility facility,
			            Features features, List<Image> images, Location location,
			            List<Rate> rates, List<Rating> ratings, String name )
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
		this.rates =  new ArrayList<Rate>();
		this.ratings = new ArrayList<Rating>();
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
	public void setLocation ( List<Rate> rates )
	{
		this.rates = rates;
	}
	
	/**
	 * accessor method for rates attribute
	 * @return List<Rate>
	 */
	public List<Rate> geRate()
	{
		return this.rates;
	}
	
	/**
	 * mutator method for ratings attribute
	 * @param ratings
	 */
	public void setRatings ( List<Rating> ratings )
	{
		this.ratings = ratings;
	}
	
	/**
	 * accessor method for ratings attribute
	 * @return List<Rating>
	 */
	public List<Rating> geRatings()
	{
		return this.ratings;
	}
	
	/**
	 * mutator method for name attribute
	 * @param name
	 */
	public void setRatings ( String  name )
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
