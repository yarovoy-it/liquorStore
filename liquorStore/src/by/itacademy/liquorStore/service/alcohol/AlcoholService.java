package by.itacademy.liquorStore.service.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;

public interface AlcoholService extends LiquidService {

	List<Alcohol> getLiquidByCountry(String country);

}
