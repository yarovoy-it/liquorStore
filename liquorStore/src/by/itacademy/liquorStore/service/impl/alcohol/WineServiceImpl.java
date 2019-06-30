package by.itacademy.liquorStore.service.impl.alcohol;

import java.util.List;

import by.itacademy.liquorStore.dao.alcohol.WineDao;
import by.itacademy.liquorStore.dao.impl.alcohol.WineDaoImpl;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.alcohol.Liquid;
import by.itacademy.liquorStore.model.alcohol.Wine;
import by.itacademy.liquorStore.service.alcohol.WineService;

public class WineServiceImpl implements WineService {

	private static WineService instance;

	private WineDao wineDao = WineDaoImpl.getInstance();

	private WineServiceImpl() {

	}

	public WineService getInstance() {
		if (instance == null) {
			instance = new WineServiceImpl();
		}
		return instance;
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
	public Wine save(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wine update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wine getByName(String Name) {
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

	@Override
	public List<Alcohol> getLiquidByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

}
