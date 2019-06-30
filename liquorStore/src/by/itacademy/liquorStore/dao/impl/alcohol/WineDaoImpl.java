package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.List;

import by.itacademy.liquorStore.dao.alcohol.WineDao;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.alcohol.Liquid;
import by.itacademy.liquorStore.model.alcohol.Wine;

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
	public Object save(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getByName(String Name) {
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
	public List<Wine> getLiquidByRegion(String region) {
		// TODO Auto-generated method stub
		return null;
	}

}
