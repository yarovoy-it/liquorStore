package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import by.itacademy.liquorStore.dao.alcohol.WhiskyDao;
import by.itacademy.liquorStore.model.alcohol.Whisky;

import static java.util.Optional.empty;

import java.util.ArrayList;
import java.util.HashSet;

public class WhiskyDaoImpl implements WhiskyDao {

	private static WhiskyDao instance;

	private WhiskyDaoImpl() {
	}

	public static WhiskyDao getInstance() {
		if (instance == null) {
			instance = new WhiskyDaoImpl();
		}

		return instance;
	}

	@Override
	public List<Whisky> getAlcoholByCountry(String country) {
		return new ArrayList<>();
	}

	@Override
	public List<Whisky> getLiquidByVolme(Double volume) {
		return new ArrayList<>();
	}

	@Override
	public List<Whisky> getLiquidByPrice(Integer price) {
		return new ArrayList<>();
	}

	@Override
	public List<Whisky> getLiquidByAmount(Integer amount) {
		return new ArrayList<>();
	}

	@Override
	public Optional<Whisky> save(Whisky t) {
		return empty();
	}

	@Override
	public Optional<Whisky> update(Whisky t) {
		return empty();
	}

	@Override
	public List<Whisky> getAll() {
		return new ArrayList<>();
	}

	@Override
	public Optional<Whisky> getByName(String Name) {
		return empty();
	}

	@Override
	public void delete(Whisky t) {
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public void deleteByName(String Name) {
	}

	@Override
	public Set<Whisky> getWhiskyBySpecificities(String specificities) {
		return new HashSet<>();
	}

}
