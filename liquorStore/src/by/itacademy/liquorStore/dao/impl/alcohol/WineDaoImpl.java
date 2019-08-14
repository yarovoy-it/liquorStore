package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.liquorStore.dao.alcohol.WineDao;
import by.itacademy.liquorStore.model.alcohol.Wine;

public class WineDaoImpl extends AlcoholDaoImpl<Wine> implements WineDao {

	private static WineDao instance;

	private WineDaoImpl() {
		super(Wine.class, (o) -> {
			Wine wine = null;
			if (o instanceof Wine) {
				wine = (Wine) o;
			}
			return wine;
		});
	}

	public static WineDao getInstance() {
		if (instance == null) {
			instance = new WineDaoImpl();
		}
		return instance;
	}

	@Override
	public List<Wine> getLiquidByRegion(String region) {
		return new ArrayList<>();
	}

}
