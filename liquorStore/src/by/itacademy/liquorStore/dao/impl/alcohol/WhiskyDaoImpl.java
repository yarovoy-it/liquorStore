package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.List;

import by.itacademy.liquorStore.dao.alcohol.WhiskyDao;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.alcohol.Liquid;
import by.itacademy.liquorStore.model.alcohol.Whisky;

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
	public List<Alcohol> getLiquidByCountry(String county) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Liquid> getLiquidByVolme(Double volume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Liquid> getLiquidByPrice(Integer price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Liquid> getLiquidByAmount(Integer amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Whisky save(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Whisky update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Whisky getByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByName(String Name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Whisky> getWhiskyBySpecificities(String specificities) {
		// TODO Auto-generated method stub
		return null;
	}

}
