package simplephoneinfo;

public class Phoneinfo {

	private String name;
	private String phoneNumber;
	private String birthday;
	
		
	public Phoneinfo (String name, String phoneNumber) {
		
		this(name, phoneNumber, "null");
	}
	
	public Phoneinfo (String name, String phoneNumber, String birthday) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	public void showPhoneinfo() {
		if(birthday == "null") {
			System.out.printf("name: %s\nphone: %s\n", name, phoneNumber);
		} else {
			System.out.printf("name: %s\nphone: %s\nbirth: %s\n", name, phoneNumber, birthday);
		}
			
	}
	
}














