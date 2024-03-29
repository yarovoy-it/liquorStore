package by.itacademy.liquorStore.model.alcohol;

public abstract class Alcohol extends Liquid {

	private String country;

	private Integer alcoholProof;

	public Alcohol() {
		super();
	}

	public Alcohol(Double volume, String name, Integer price, String county, Integer alcoholProof, Integer amount) {
		super(volume, name, price, amount);
		this.country = county;
		this.alcoholProof = alcoholProof;
	}

	public Alcohol(Long id, Double volume, String name, Integer price, String county, Integer alcoholProof,
			Integer amount) {
		super(id, volume, name, price, amount);
		this.country = county;
		this.alcoholProof = alcoholProof;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String county) {
		this.country = county;
	}

	public Integer getAlcoholProof() {
		return alcoholProof;
	}

	public void setAlcoholProof(int alcoholProof) {
		this.alcoholProof = alcoholProof;
	}

}
