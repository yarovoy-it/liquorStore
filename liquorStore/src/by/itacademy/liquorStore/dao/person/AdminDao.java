package by.itacademy.liquorStore.dao.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.Admin;

public interface AdminDao extends PersonDetailDao<Admin> {

	List<Admin> getCustomerByPosition(String position);

	List<Admin> getCustomerByTasks(String tasks);

}
