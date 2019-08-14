package by.itacademy.liquorStore.model.alcohol;

import java.io.Serializable;

import by.itacademy.liquorStore.annotation.FileStorage;

@FileStorage(name = "Whisky")
public class Whisky extends Alcohol implements Serializable {

	private String specificities;

	public Whisky(double volume, String name, int price, String county, int alcoholProof, String specificities,
			int amount) {
		super(volume, name, price, county, alcoholProof, amount);
		this.specificities = specificities;
	}

	public Whisky(double volume, String name, int price, String county, int alcoholProof, int amount) {
		super(volume, name, price, county, alcoholProof, amount);
	}

	public String getSpecificities() {
		return specificities;
	}

	public void setSpecificities(String specificities) {
		this.specificities = specificities;
	}

	@Override
	public String toString() {
		return "Whisky [specificities=" + specificities + ", getCountry()=" + getCountry() + ", getAlcoholProof()="
				+ getAlcoholProof() + ", getAmount()=" + getAmount() + ", getVolume()=" + getVolume() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getId()=" + getId() + "]";
	}

}
