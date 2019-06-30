package by.itacademy.liquorStore.service.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.PersonDetail;
import by.itacademy.liquorStore.service.GenericService;

public interface PersonDetailService extends GenericService {

	List<PersonDetail> getPersonDetailByAddress(String address);

	List<PersonDetail> getPersonDetailByPhone(String phone);

}
