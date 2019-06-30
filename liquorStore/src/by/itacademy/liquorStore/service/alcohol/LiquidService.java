package by.itacademy.liquorStore.service.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Liquid;
import by.itacademy.liquorStore.service.GenericService;

public interface LiquidService extends GenericService {

	List<Liquid> getLiquidByVolme(Double volume);

	List<Liquid> getLiquidByPrice(Integer price);

	List<Liquid> getLiquidByAmount(Integer amount);

}
