package by.itacademy.liquorStore.service.impl.alcohol;

import java.util.List;

import by.itacademy.liquorStore.dao.alcohol.BeerDao;
import by.itacademy.liquorStore.dao.impl.alcohol.BeerDaoImpl;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.alcohol.Liquid;
import by.itacademy.liquorStore.service.alcohol.BeerService;

public class BeerServiceImpl implements BeerService {

	private static BeerService instance;

	private BeerDao beerDao = BeerDaoImpl.getInstance();

	private BeerServiceImpl() {

	}

	public BeerService getInstance() {
		if (instance == null) {
			instance = new BeerServiceImpl();
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
	public List<Alcohol> getLiquidByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

}
