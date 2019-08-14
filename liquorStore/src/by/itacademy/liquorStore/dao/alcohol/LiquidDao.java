package by.itacademy.liquorStore.dao.alcohol;

import java.util.List;

import by.itacademy.liquorStore.dao.GenericDao;
import by.itacademy.liquorStore.model.alcohol.Alcohol;

public interface LiquidDao<T extends Alcohol> extends GenericDao<T> {

	List<T> getLiquidByVolme(Double volume);

	List<T> getLiquidByPrice(Integer price);

	List<T> getLiquidByAmount(Integer amount);

	@Override
	List<T> getAll();

}
