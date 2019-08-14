package by.itacademy.liquorStore.model.person;

import java.io.Serializable;
import java.util.List;

import by.itacademy.liquorStore.annotation.FileStorage;
import by.itacademy.liquorStore.model.alcohol.Alcohol;

@FileStorage(name = "Customer")
public class Customer extends PersonalDetail implements Serializable {

	private Integer discount;

	private String status;

	private List<Alcohol> alcohols;

	public Customer() {
	}

	public Customer(String name, String address, Integer phone, Integer discount, String status,
			List<Alcohol> alcohols) {
		super(name, address, phone);
		this.discount = discount;
		this.status = status;
		this.alcohols = alcohols;
	}

	public Customer(String name, String address, Integer phone, Integer discount, String status) {
		super(name, address, phone);
		this.discount = discount;
		this.status = status;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Alcohol> getAlcohols() {
		return alcohols;
	}

	public void setAlcohols(List<Alcohol> alcohols) {
		this.alcohols = alcohols;
	}

	@Override
	public String toString() {
		return "Customer [discount=" + discount + ", status=" + status + ", alcohols=" + alcohols + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", getId()=" + getId()
				+ "]";
	}

}
