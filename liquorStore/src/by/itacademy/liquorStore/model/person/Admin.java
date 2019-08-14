package by.itacademy.liquorStore.model.person;

import java.io.Serializable;
import java.util.List;

import by.itacademy.liquorStore.annotation.FileStorage;

@FileStorage(name = "Admin")
public class Admin extends PersonalDetail implements Serializable {

	private String position;

	private List<String> tasks;

	public Admin() {
	}

	public Admin(String name, String address, Integer phone, String position, List<String> tasks) {
		super(name, address, phone);
		this.position = position;
		this.tasks = tasks;
	}

	public Admin(String position, List<String> tasks) {
		super();
		this.position = position;
		this.tasks = tasks;
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
		return "Admin [position=" + position + ", tasks=" + tasks + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getPhone()=" + getPhone() + ", getId()=" + getId() + "]";
	}

}
