package Models;

public class Element {

	private String name;
	private String owner;
	private String location;
	private String phone;
	private String description;
	private String cat;
	private int rate;
	private int reviews;
	
	Element(String name, User user, String location, String phone, String description, Cat cat, int rate, int reviews){
		
		this.setName(name); 
		this.setOwner(user);
		this.setLocation(location);
		this.setPhone(phone);
		this.setDescription(description);
		this.setCat(cat);
		this.setRate(rate);
		this.setReviews(reviews);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner.getEmail();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat.getName();
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getReviews() {
		return reviews;
	}

	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	
}
