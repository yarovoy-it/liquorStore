package by.itacademy.liquorStore.model.alcohol;

import java.io.Serializable;

import by.itacademy.liquorStore.annotation.FileStorage;

@FileStorage(name = "Wine")
public class Wine extends Alcohol implements Serializable {

	private String grapeSort;

	private static final Double volume = 0.75;

	public Wine(String name, Integer price, String county, Integer alcoholProof, String grapeSort, Integer amount) {
		super(volume, name, price, county, alcoholProof, amount);
		this.grapeSort = grapeSort;
	}

	public String getGrapeSort() {
		return grapeSort;
	}

	public void setGrapeSort(String grapeSort) {
		this.grapeSort = grapeSort;
	}

	@Override
	public String toString() {
		return "Wine [grapeSort=" + grapeSort + ", getCountry()=" + getCountry() + ", getAlcoholProof()="
				+ getAlcoholProof() + ", getAmount()=" + getAmount() + ", getVolume()=" + getVolume() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getId()=" + getId() + "]";
	}

}
