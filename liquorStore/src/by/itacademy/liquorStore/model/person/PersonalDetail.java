package by.itacademy.liquorStore.model.person;

import by.itacademy.liquorStore.model.base.BaseEntity;

public abstract class PersonalDetail extends BaseEntity {

	private String name;

	private String address;

	private Integer phone;

	public PersonalDetail() {
	}

	public PersonalDetail(String name, String address, Integer phone) {
		super();
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

}
