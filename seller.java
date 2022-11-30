package model;

public class seller {

	@Column(name="First_Name", nullable=false, length=30)	
	private String First_Name;
	@Column(name="Last_Name", nullable=false, length=25)
	private String Last_Name;
	private String  Address;
	private String City; 
	 private String State;
	private int Pin;
	@Column(name="Phone", nullable=false, length=10)
     private int Phone;
     @Column(name="email", nullable=false, length=30)
     
	private String Email;
	
	
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
	
}

