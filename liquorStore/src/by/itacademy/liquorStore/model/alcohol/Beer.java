package by.itacademy.liquorStore.model.alcohol;

import java.io.Serializable;

import by.itacademy.liquorStore.annotation.FileStorage;

@FileStorage(name = "Beer")
public class Beer extends Alcohol implements Serializable {

	public Beer() {

	}

	public Beer(Long id, Double volume, String name, Integer price, String county, Integer alcoholProof,
			Integer amount) {
		super(id, volume, name, price, county, alcoholProof, amount);
	}

	public Beer(Double volume, String name, Integer price, String county, Integer alcoholProof, Integer amount) {
		super(volume, name, price, county, alcoholProof, amount);
	}

	@Override
	public String toString() {
		return "Beer [getCountry()=" + getCountry() + ", getAlcoholProof()=" + getAlcoholProof() + ", getAmount()="
				+ getAmount() + ", getVolume()=" + getVolume() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + ", getId()=" + getId() + "]";
	}

}
