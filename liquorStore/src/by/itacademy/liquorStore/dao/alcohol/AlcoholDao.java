package by.itacademy.liquorStore.dao.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;

public interface AlcoholDao<T extends Alcohol> extends LiquidDao<T> {

	List<T> getAlcoholByCountry(String country);

}
