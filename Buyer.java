package model;

public class Buyer {

	private String First_Name;
	private String Last_Name;
	private String  Address;
	private String City; 
	 private String State;
	private int Pin;
     private int Phone;
	private String Email;
	private int Product_Id;
	private int bid_amount;
	
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}
	public int getBid_amount() {
		return bid_amount;
	}
	public void setBid_amount(int bid_amount) {
		this.bid_amount = bid_amount;
	}

}
