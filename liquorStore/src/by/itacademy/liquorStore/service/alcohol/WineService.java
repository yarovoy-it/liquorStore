package by.itacademy.liquorStore.service.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Wine;

public interface WineService extends AlcoholService<Wine> {

	List<Wine> getLiquidByRegion(String region);

}
