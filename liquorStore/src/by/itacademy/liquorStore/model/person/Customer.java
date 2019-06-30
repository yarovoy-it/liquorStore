package by.itacademy.liquorStore.model.person;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;

public class Customer extends PersonDetail {

	private Integer discount;

	private String status;

	private List<Alcohol> alcohols;

	public Customer() {
	}

	public Customer(String name, String address, int phone, int discount, String status,
			List<Alcohol> alcohols) {
		super(name, address, phone);
		this.discount = discount;
		this.status = status;
		this.alcohols = alcohols;
	}

	public Customer(String name, String address, int phone, int discount, String status) {
		super(name, address, phone);
		this.discount = discount;
		this.status = status;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
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
		return "Customer [Скидка=" + discount + ", Статус=" + status + ", Имя=" + getName() + ", Адресс=" + getAddress()
				+ ", Телефон=" + getPhone() + ", Алкоголь=" + alcohols + "]";
	}

}
