package by.itacademy.liquorStore.service.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.PersonDetail;
import by.itacademy.liquorStore.service.GenericService;

public interface PersonDetailService<T extends PersonDetail> extends GenericService<T> {

	List<T> getPersonDetailByAddress(String address);

	List<T> getPersonDetailByPhone(String phone);

}
