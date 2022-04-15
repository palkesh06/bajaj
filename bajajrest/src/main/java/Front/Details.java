package Front;

public class Details {
   private String User_id; 
   private String email_id;
   private String roll_no; 
   private String numbers ; 
   private String alpha;
   

public Details() {
	super();
}
public Details(String user_id, String email_id, String roll_no, String numbers, String alpha) {
	super();
	User_id = user_id;
	this.email_id = email_id;
	this.roll_no = roll_no;
	this.numbers = numbers;
	this.alpha = alpha;
}
public String getUser_id() {
	return User_id;
}
public void setUser_id(String user_id) {
	User_id = user_id;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getRoll_no() {
	return roll_no;
}
public void setRoll_no(String roll_no) {
	this.roll_no = roll_no;
}
public String getNumbers() {
	return numbers;
}
public void setNumbers(String numbers) {
	this.numbers = numbers;
}
public String getAlpha() {
	return alpha;
}
public void setAlpha(String alpha) {
	this.alpha = alpha;
}
   
   
}
