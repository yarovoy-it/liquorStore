package by.itacademy.liquorStore.service.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;

public interface AlcoholService<T extends Alcohol> extends LiquidService<T> {

	List<T> getLiquidByCountry(String country);
	

}
