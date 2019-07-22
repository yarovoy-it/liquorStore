package by.itacademy.liquorStore.dao.person;

import java.util.List;

import by.itacademy.liquorStore.dao.GenericDao;
import by.itacademy.liquorStore.model.person.PersonDetail;

public interface PersonDetailDao<T extends PersonDetail> extends GenericDao<T> {

	List<T> getPersonDetailByAddress(String address);

	List<T> getPersonDetailByPhone(String phone);

}
