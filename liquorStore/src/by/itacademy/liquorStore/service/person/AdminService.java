package by.itacademy.liquorStore.service.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.Admin;

public interface AdminService extends PersonDetailService<Admin> {

	List<Admin> getCustomerByPosition(String position);

	List<Admin> getCustomerByTasks(String tasks);

}
