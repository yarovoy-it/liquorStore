package by.itacademy.liquorStore.dao.impl.alcohol;

import by.itacademy.liquorStore.dao.alcohol.BeerDao;
import by.itacademy.liquorStore.model.alcohol.Beer;

public class BeerDaoImpl extends AlcoholDaoImpl<Beer> implements BeerDao {

	private static BeerDao instance;

	private BeerDaoImpl() {
		super(Beer.class, (o) -> {
			Beer beer = null;
			if (o instanceof Beer) {
				beer = (Beer) o;
			}
			return beer;
		});
	}

	public static BeerDao getInstance() {
		if (instance == null) {
			instance = new BeerDaoImpl();
		}
		return instance;
	}

}
