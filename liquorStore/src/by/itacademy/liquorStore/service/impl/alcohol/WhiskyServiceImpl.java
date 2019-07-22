package by.itacademy.liquorStore.service.impl.alcohol;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import by.itacademy.liquorStore.dao.alcohol.WhiskyDao;
import by.itacademy.liquorStore.dao.impl.alcohol.WhiskyDaoImpl;
import by.itacademy.liquorStore.model.alcohol.Whisky;
import by.itacademy.liquorStore.service.alcohol.WhiskyService;

public class WhiskyServiceImpl implements WhiskyService {

	private static WhiskyService instance;

	private WhiskyDao whiskyDao = WhiskyDaoImpl.getInstance();

	private WhiskyServiceImpl() {

	}

	public WhiskyService getInstance() {
		if (instance == null) {
			instance = new WhiskyServiceImpl();
		}
		return instance;
	}

	@Override
	public List<Whisky> getLiquidByVolme(Double volume) {
		return whiskyDao.getLiquidByVolme(volume);
	}

	@Override
	public List<Whisky> getLiquidByPrice(Integer price) {
		return whiskyDao.getLiquidByPrice(price);
	}

	@Override
	public List<Whisky> getLiquidByAmount(Integer amount) {
		return whiskyDao.getLiquidByAmount(amount);
	}

	@Override
	public Optional<Whisky> save(Whisky object) {
		return whiskyDao.save(object);
	}

	@Override
	public Optional<Whisky> update(Whisky object) {
		return whiskyDao.update(object);
	}

	@Override
	public List<Whisky> getAll() {
		return (List<Whisky>) whiskyDao.getAll();
	}

	@Override
	public Optional<Whisky> getByName(String name) {
		return whiskyDao.getByName(name);
	}

	@Override
	public void delete(Whisky object) {
		whiskyDao.delete(object);

	}

	@Override
	public void deleteAll() {
		whiskyDao.deleteAll();

	}

	@Override
	public void deleteByName(String name) {
		whiskyDao.deleteByName(name);

	}

	@Override
	public Set<Whisky> getWhiskyBySpecificities(String specificities) {
		return whiskyDao.getWhiskyBySpecificities(specificities);
	}

	@Override
	public List<Whisky> getLiquidByCountry(String country) {
		return whiskyDao.getAlcoholByCountry(country);
	}

}
