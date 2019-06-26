package by.itacademy.liquorStore.model.alcohol;

import by.itacademy.liquorStore.api.Convertible;

public abstract class AAlcohol extends ALiquid implements Convertible {

	private String county;

	private int alcoholProof;

	public AAlcohol(double volume, String name, int price, String county, int alcoholProof) {
		super(volume, name, price);
		this.county = county;
		this.alcoholProof = alcoholProof;
	}

	@Override
	public Integer formProofToVolueOfSpirt(int proof) {
		return proof / 2;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public int getAlcoholProof() {
		return alcoholProof;
	}

	public void setAlcoholProof(int alcoholProof) {
		this.alcoholProof = alcoholProof;
	}

}
