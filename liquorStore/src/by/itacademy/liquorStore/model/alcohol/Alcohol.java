package by.itacademy.liquorStore.model.alcohol;

public abstract class Alcohol extends Liquid {

	private String country;

	private Integer alcoholProof;

	public Alcohol(Double volume, String name, Integer price, String county, Integer alcoholProof, Integer amount) {
		super(volume, name, price, amount);
		this.country = county;
		this.alcoholProof = alcoholProof;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String county) {
		this.country = county;
	}

	public int getAlcoholProof() {
		return alcoholProof;
	}

	public void setAlcoholProof(int alcoholProof) {
		this.alcoholProof = alcoholProof;
	}

}
