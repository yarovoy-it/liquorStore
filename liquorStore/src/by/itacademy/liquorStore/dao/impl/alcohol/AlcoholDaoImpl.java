package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import by.itacademy.liquorStore.dao.alcohol.AlcoholDao;
import by.itacademy.liquorStore.dao.impl.GenericDaoImpl;
import by.itacademy.liquorStore.model.alcohol.Alcohol;

public class AlcoholDaoImpl<T extends Alcohol> extends GenericDaoImpl<T> implements AlcoholDao<T> {

	protected AlcoholDaoImpl(Class<T> typeParameterClass, Function<Object, T> mapper) {
		super(typeParameterClass, mapper);
	}

	@Override
	public List<T> getLiquidByVolme(Double volume) {
		return new ArrayList<>();
	}

	@Override
	public List<T> getLiquidByPrice(Integer price) {
		return new ArrayList<>();
	}

	@Override
	public List<T> getLiquidByAmount(Integer amount) {
		return new ArrayList<>();
	}

	@Override
	public List<T> getAll() {
		return new ArrayList<>(super.getAll());
	}

	@Override
	public List<T> getAlcoholByCountry(String country) {
		return new ArrayList<>();
	}

}
