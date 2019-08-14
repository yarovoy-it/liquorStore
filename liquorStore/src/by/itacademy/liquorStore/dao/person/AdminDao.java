package by.itacademy.liquorStore.dao.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.Admin;

public interface AdminDao extends PersonDetailDao<Admin> {

	List<Admin> getAdminByPosition(String position);

	List<Admin> getAdminByTasks(String tasks);

}
