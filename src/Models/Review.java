package Models;

public class Review {

	private int id;
	private String user;
	private String element;
	private int rate; 
	private String comment;
	private String date;
	
	Review(int id, User user, Element ele, int rate, String comment, String date){
		
		this.setId(id);
		this.setUser(user);;
		this.setElement(ele);
		this.setRate(rate);
		this.setComment(comment);
		this.setDate(date);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user.getEmail();
	}

	public String getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element.getCat();
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
