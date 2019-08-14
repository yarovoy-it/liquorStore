package by.itacademy.liquorStore.dao.impl.alcohol;

import java.util.Set;

import by.itacademy.liquorStore.dao.alcohol.WhiskyDao;
import by.itacademy.liquorStore.model.alcohol.Whisky;

import java.util.HashSet;

public class WhiskyDaoImpl extends AlcoholDaoImpl<Whisky> implements WhiskyDao {

	private static WhiskyDao instance;

	private WhiskyDaoImpl() {
		super(Whisky.class, (o) -> {
			Whisky whisky = null;
			if (o instanceof Whisky) {
				whisky = (Whisky) o;
			}
			return whisky;
		});
	}

	public static WhiskyDao getInstance() {
		if (instance == null) {
			instance = new WhiskyDaoImpl();
		}

		return instance;
	}

	@Override
	public Set<Whisky> getWhiskyBySpecificities(String specificities) {
		return new HashSet<>();
	}

}
