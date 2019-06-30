package by.itacademy.liquorStore.dao.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;

public interface AlcoholDao extends LiquidDao {

	List<Alcohol> getLiquidByCountry(String country);

}
