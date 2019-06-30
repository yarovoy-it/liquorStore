package by.itacademy.liquorStore.model.alcohol;

public class Whisky extends Alcohol {

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
		return "StrongAlcohol [specificities=" + specificities + ", getCounty()=" + getCountry()
				+ ", getAlcoholProof()=" + getAlcoholProof() + ", getVolume()=" + getVolume() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + "]";
	}

}
