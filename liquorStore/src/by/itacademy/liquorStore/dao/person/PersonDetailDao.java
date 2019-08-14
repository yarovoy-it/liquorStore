package by.itacademy.liquorStore.dao.person;

import java.util.List;

import by.itacademy.liquorStore.dao.GenericDao;
import by.itacademy.liquorStore.model.person.PersonalDetail;

public interface PersonDetailDao<T extends PersonalDetail> extends GenericDao<T> {

	List<T> getPersonDetailByAddress(String address);

	List<T> getPersonDetailByPhone(String phone);

	@Override
	List<T> getAll();

}
