package by.itacademy.liquorStore.service.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.Admin;

public interface AdminService extends PersonDetailService<Admin> {

	List<Admin> getAdminByPosition(String position);

	List<Admin> getAdminByTasks(String tasks);

}
