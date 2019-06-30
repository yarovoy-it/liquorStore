package by.itacademy.liquorStore.model.alcohol;

public class Beer extends Alcohol {

	public Beer(double volume, String name, int price, String county, int alcoholProof, int amount) {
		super(volume, name, price, county, alcoholProof, amount);
	}

	@Override
	public String toString() {
		return "Beer [������=" + getCountry() + " ��������=" + getAlcoholProof() + ", �����=" + getVolume()
				+ ", ��������=" + getName() + ", ����=" + getPrice() + "]";
	}

}
