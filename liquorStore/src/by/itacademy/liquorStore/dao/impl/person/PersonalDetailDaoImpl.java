package by.itacademy.liquorStore.dao.impl.person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import by.itacademy.liquorStore.dao.impl.GenericDaoImpl;
import by.itacademy.liquorStore.dao.person.PersonDetailDao;
import by.itacademy.liquorStore.model.person.PersonalDetail;

public class PersonalDetailDaoImpl<T extends PersonalDetail> extends GenericDaoImpl<T> implements PersonDetailDao<T> {

	protected PersonalDetailDaoImpl(Class<T> typeParameterClass, Function<Object, T> mapper) {
		super(typeParameterClass, mapper);
	}

	@Override
	public List<T> getPersonDetailByAddress(String address) {
		return new ArrayList<>();
	}

	@Override
	public List<T> getPersonDetailByPhone(String phone) {
		return new ArrayList<>();
	}

	@Override
	public List<T> getAll() {
		return new ArrayList<>(super.getAll());
	}

}
