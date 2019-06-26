package by.itacademy.liquorStore.model.person;

public class PersonDetail {

	private String name;

	private String address;

	private int phone;

	public PersonDetail() {
	}

	public PersonDetail(String name, String address, int phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
