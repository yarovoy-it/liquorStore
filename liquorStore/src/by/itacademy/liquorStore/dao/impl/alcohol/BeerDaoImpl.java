package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.alcohol.BeerDao;
import by.itacademy.liquorStore.model.alcohol.Beer;

import static java.util.Optional.empty;

public class BeerDaoImpl implements BeerDao {

	private static BeerDao instance;

	private BeerDaoImpl() {
	}

	public static BeerDao getInstance() {
		if (instance == null) {
			instance = new BeerDaoImpl();
		}
		return instance;
	}

	@Override
	public List<Beer> getAlcoholByCountry(String country) {
		return new ArrayList<>();
	}

	@Override
	public List<Beer> getLiquidByVolme(Double volume) {
		return new ArrayList<>();
	}

	@Override
	public List<Beer> getLiquidByPrice(Integer price) {
		return new ArrayList<>();
	}

	@Override
	public List<Beer> getLiquidByAmount(Integer amount) {
		return new ArrayList<>();
	}

	@Override
	public Optional<Beer> save(Beer t) {
		return empty();
	}

	@Override
	public Optional<Beer> update(Beer t) {
		return empty();
	}

	@Override
	public List<Beer> getAll() {
		return new ArrayList<>();
	}

	@Override
	public Optional<Beer> getByName(String Name) {
		return empty();
	}

	@Override
	public void delete(Beer t) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public void deleteByName(String Name) {

	}

}
