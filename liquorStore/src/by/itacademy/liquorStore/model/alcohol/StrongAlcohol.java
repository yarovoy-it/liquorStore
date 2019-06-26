package by.itacademy.liquorStore.model.alcohol;

public class StrongAlcohol extends AAlcohol {

	private String specificities;

	public StrongAlcohol(double volume, String name, int price, String county, int alcoholProof, String specificities) {
		super(volume, name, price, county, alcoholProof);
		this.specificities = specificities;
	}

	public StrongAlcohol(double volume, String name, int price, String county, int alcoholProof) {
		super(volume, name, price, county, alcoholProof);
	}

	public String getSpecificities() {
		return specificities;
	}

	public void setSpecificities(String specificities) {
		this.specificities = specificities;
	}

	@Override
	public String toString() {
		return "StrongAlcohol [specificities=" + specificities + ", getCounty()=" + getCounty() + ", getAlcoholProof()="
				+ getAlcoholProof() + ", getVolume()=" + getVolume() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + "]";
	}

}
