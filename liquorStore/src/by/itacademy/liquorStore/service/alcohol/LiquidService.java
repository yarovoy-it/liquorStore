package by.itacademy.liquorStore.service.alcohol;

import java.util.List;

import by.itacademy.liquorStore.service.GenericService;

public interface LiquidService<T> extends GenericService<T> {

	List<T> getLiquidByVolme(Double volume);

	List<T> getLiquidByPrice(Integer price);

	List<T> getLiquidByAmount(Integer amount);

}
