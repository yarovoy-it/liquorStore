package by.itacademy.liquorStore.model.alcohol;

import by.itacademy.liquorStore.model.base.BaseEntity;

public abstract class Liquid extends BaseEntity {

	private Double volume;

	private String name;

	private Integer price;

	private Integer amount;

	public Liquid() {
		super();
	}

	public Liquid(Double volume, String name, Integer price, Integer amount) {
		super();
		this.amount = amount;
		this.volume = volume;
		this.name = name;
		this.price = price;
	}

	public Liquid(Long id, Double volume, String name, Integer price, Integer amount) {
		super(id);
		this.amount = amount;
		this.volume = volume;
		this.name = name;
		this.price = price;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
