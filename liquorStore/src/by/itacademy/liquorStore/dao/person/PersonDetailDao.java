package by.itacademy.liquorStore.dao.person;

import java.util.List;

import by.itacademy.liquorStore.dao.GenericDao;
import by.itacademy.liquorStore.model.person.PersonDetail;

public interface PersonDetailDao extends GenericDao {

	List<PersonDetail> getPersonDetailByAddress(String address);

	List<PersonDetail> getPersonDetailByPhone(String phone);

}
