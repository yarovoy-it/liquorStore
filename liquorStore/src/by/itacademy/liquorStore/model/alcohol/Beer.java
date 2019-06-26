package by.itacademy.liquorStore.model.alcohol;

public class Beer extends AAlcohol {

	public Beer(double volume, String name, int price, String county, int alcoholProof) {
		super(volume, name, price, county, alcoholProof);
	}

	@Override
	public String toString() {
		return "Beer [������=" + getCounty() + " ��������=" + getAlcoholProof() + ", �����=" + getVolume()
				+ ", ��������=" + getName() + ", ����=" + getPrice() + "]";
	}

}
