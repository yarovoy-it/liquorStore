package by.itacademy.liquorStore.model.alcohol;

public class Wine extends Alcohol {

	private String region;

	private static final double volume = 0.75;

	public Wine(String name, int price, String county, int alcoholProof, String region, int amount) {
		super(volume, name, price, county, alcoholProof, amount);
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Wine [region=" + region + ", getCounty()=" + getCountry() + ", getAlcoholProof()=" + getAlcoholProof()
				+ ", getVolume()=" + getVolume() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

}
