package by.itacademy.liquorStore.dao.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Wine;

public interface WineDao extends AlcoholDao<Wine> {

	List<Wine> getLiquidByRegion(String region);

}
