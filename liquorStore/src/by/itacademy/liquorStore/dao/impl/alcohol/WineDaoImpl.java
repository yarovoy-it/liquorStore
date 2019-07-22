package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.alcohol.WineDao;
import by.itacademy.liquorStore.model.alcohol.Wine;

import static java.util.Optional.empty;

public class WineDaoImpl implements WineDao {

	private static WineDao instance;

	private WineDaoImpl() {
	}

	public static WineDao getInstance() {
		if (instance == null) {
			instance = new WineDaoImpl();
		}
		return instance;
	}

	@Override
	public List<Wine> getAlcoholByCountry(String country) {
		return new ArrayList<>();
	}

	@Override
	public List<Wine> getLiquidByVolme(Double volume) {
		return new ArrayList<>();
	}

	@Override
	public List<Wine> getLiquidByPrice(Integer price) {
		return new ArrayList<>();
	}

	@Override
	public List<Wine> getLiquidByAmount(Integer amount) {
		return new ArrayList<>();
	}

	@Override
	public Optional<Wine> save(Wine t) {
		return empty();
	}

	@Override
	public Optional<Wine> update(Wine t) {
		return empty();
	}

	@Override
	public List<Wine> getAll() {
		return new ArrayList<>();
	}

	@Override
	public Optional<Wine> getByName(String Name) {
		return empty();
	}

	@Override
	public void delete(Wine t) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public void deleteByName(String Name) {

	}

	@Override
	public List<Wine> getLiquidByRegion(String region) {
		return new ArrayList<>();
	}

}
