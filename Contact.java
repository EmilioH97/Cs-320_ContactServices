package com.milestone.three.contact;

public class Contact {

	private String _id;				//cannot be >10 char
	private String _firstName;		//cannot be >10 char
	private String _lastName;		//cannot be >10 char
	private String _phoneNumber;	//must be exactly 10 char
	private String _address;		//cannot be >30 char
	
	//none of the above can be null
	
	public Contact(String id, String fName, String lName, String phone, String addy) {
		//String newid = GenerateUniqueID();
		
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phone == null || phone.length() > 10 || phone.length() < 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(addy == null || addy.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		_id = id;
		_firstName = fName;
		_lastName = lName;
		_phoneNumber = phone;
		_address = addy;
	}
	
	public String getId() {
		return _id;
	}
	public String getFullName() {
		return _firstName + " " + _lastName;
	}
	public String getPhoneNumber() {
		return _phoneNumber;
	}
	public String getAddress() {
		return _address;
	}
	
	public void setFirstName(String fName) {
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		_firstName = fName;
	}
	public void setLastName (String lName){
		if(lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		_lastName = lName;
	}
	public void setPhoneNumber (String phone) {
		if(phone == null || phone.length() > 10 || phone.length() < 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		_phoneNumber = phone;
	}
	public void setAddress(String addy) {
		if(addy == null || addy.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		_address = addy;
	}
}