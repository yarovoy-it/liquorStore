package by.itacademy.liquorStore.model.alcohol;

public abstract class ALiquid {

	private double volume;

	private String name;

	private int price;

	public ALiquid(double volume, String name, int price) {
		this.volume = volume;
		this.name = name;
		this.price = price;
	}

	public double getVolume() {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
