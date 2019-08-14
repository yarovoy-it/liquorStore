package by.itacademy.liquorStore.service.impl.alcohol;

import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.alcohol.BeerDao;
import by.itacademy.liquorStore.dao.impl.alcohol.BeerDaoImpl;
import by.itacademy.liquorStore.model.alcohol.Beer;
import by.itacademy.liquorStore.service.alcohol.BeerService;

public class BeerServiceImpl implements BeerService {

	private static BeerService instance;

	private BeerDao beerDao = BeerDaoImpl.getInstance();

	private BeerServiceImpl() {

	}

	public static BeerService getInstance() {
		if (instance == null) {
			instance = new BeerServiceImpl();
		}
		return instance;
	}

	@Override
	public List<Beer> getLiquidByCountry(String country) {
		return beerDao.getAlcoholByCountry(country);
	}

	@Override
	public List<Beer> getLiquidByVolme(Double volume) {
		return beerDao.getLiquidByVolme(volume);
	}

	@Override
	public List<Beer> getLiquidByPrice(Integer price) {
		return beerDao.getLiquidByPrice(price);
	}

	@Override
	public List<Beer> getLiquidByAmount(Integer amount) {
		return beerDao.getLiquidByAmount(amount);
	}

	@Override
	public Optional<Beer> save(Beer object) {
		return beerDao.save(object);
	}

	@Override
	public Optional<Beer> update(Beer object) {
		return beerDao.update(object);
	}

	@Override
	public List<Beer> getAll() {
		return beerDao.getAll();
	}

	@Override
	public Optional<Beer> getByName(String name) {
		return beerDao.getByName(name);
	}

	@Override
	public void delete(Beer object) {
		beerDao.delete(object);

	}

	@Override
	public void deleteAll() {
		beerDao.deleteAll();

	}

	@Override
	public Optional<Beer> getById(Long id) {
		return beerDao.getById(id);
	}

}
