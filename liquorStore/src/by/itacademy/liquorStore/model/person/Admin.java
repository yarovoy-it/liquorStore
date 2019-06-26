package by.itacademy.liquorStore.model.person;

import java.util.List;

public class Admin extends PersonDetail {

	private String position;

	private List<String> tasks;

	public Admin() {
	}

	public Admin(String name, String address, int phone, String position, List<String> tasks) {
		super(name, address, phone);
		this.position = position;
		this.tasks = tasks;
	}

	public Admin(String name, String address, int phone, String position) {
		super(name, address, phone);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<String> getTasks() {
		return tasks;
	}

	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Admin [position=" + position + ", task=" + tasks + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getPhone()=" + getPhone() + "]";
	}

}
