package by.itacademy.liquorStore.dao.alcohol;

import java.util.List;

import by.itacademy.liquorStore.dao.GenericDao;
import by.itacademy.liquorStore.model.alcohol.Liquid;

public interface LiquidDao extends GenericDao {

	List<Liquid> getLiquidByVolme(Double volume);

	List<Liquid> getLiquidByPrice(Integer price);

	List<Liquid> getLiquidByAmount(Integer amount);

}
