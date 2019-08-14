package by.itacademy.liquorStore.service.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.PersonalDetail;
import by.itacademy.liquorStore.service.GenericService;

public interface PersonDetailService<T extends PersonalDetail> extends GenericService<T> {

	List<T> getPersonDetailByAddress(String address);

	List<T> getPersonDetailByPhone(String phone);

}
