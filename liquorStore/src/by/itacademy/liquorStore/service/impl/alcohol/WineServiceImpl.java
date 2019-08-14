package by.itacademy.liquorStore.service.impl.alcohol;

import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.alcohol.WineDao;
import by.itacademy.liquorStore.dao.impl.alcohol.WineDaoImpl;
import by.itacademy.liquorStore.model.alcohol.Wine;
import by.itacademy.liquorStore.service.alcohol.WineService;

public class WineServiceImpl implements WineService {

	private static WineService instance;

	private WineDao wineDao = WineDaoImpl.getInstance();

	private WineServiceImpl() {

	}

	public static WineService getInstance() {
		if (instance == null) {
			instance = new WineServiceImpl();
		}
		return instance;
	}

	@Override
	public List<Wine> getLiquidByVolme(Double volume) {
		return wineDao.getLiquidByVolme(volume);
	}

	@Override
	public List<Wine> getLiquidByPrice(Integer price) {
		return wineDao.getLiquidByPrice(price);
	}

	@Override
	public List<Wine> getLiquidByAmount(Integer amount) {
		return wineDao.getLiquidByAmount(amount);
	}

	@Override
	public Optional<Wine> save(Wine object) {
		return wineDao.save(object);
	}

	@Override
	public Optional<Wine> update(Wine object) {
		return wineDao.update(object);
	}

	@Override
	public List<Wine> getAll() {
		return wineDao.getAll();
	}

	@Override
	public Optional<Wine> getByName(String name) {
		return wineDao.getByName(name);
	}

	@Override
	public void delete(Wine object) {
		wineDao.delete(object);

	}

	@Override
	public void deleteAll() {
		wineDao.deleteAll();

	}

	@Override
	public List<Wine> getLiquidByRegion(String region) {
		return wineDao.getLiquidByRegion(region);
	}

	@Override
	public List<Wine> getLiquidByCountry(String country) {
		return wineDao.getAlcoholByCountry(country);
	}

	@Override
	public Optional<Wine> getById(Long id) {
		return wineDao.getById(id);
	}

}
