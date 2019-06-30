package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.List;

import by.itacademy.liquorStore.dao.alcohol.BeerDao;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.alcohol.Beer;
import by.itacademy.liquorStore.model.alcohol.Liquid;

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
	public List<Alcohol> getLiquidByCountry(String country) {
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
	public Beer save(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Beer update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Beer getByName(String Name) {
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

}
