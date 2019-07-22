package by.itacademy.liquorStore.service.impl.person;

import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.impl.person.AdminDaoImpl;
import by.itacademy.liquorStore.dao.person.AdminDao;
import by.itacademy.liquorStore.model.person.Admin;
import by.itacademy.liquorStore.service.person.AdminService;

public class AdminServiceImpl implements AdminService {

	private static AdminService instance;

	private AdminDao adminDao = AdminDaoImpl.getInstance();

	private AdminServiceImpl() {

	}

	public AdminService getInctance() {
		if (instance == null) {
			instance = new AdminServiceImpl();
		}
		return instance;
	}

	@Override
	public List<Admin> getPersonDetailByAddress(String address) {
		return adminDao.getPersonDetailByAddress(address);
	}

	@Override
	public List<Admin> getPersonDetailByPhone(String phone) {
		return adminDao.getPersonDetailByPhone(phone);
	}

	@Override
	public Optional<Admin> save(Admin object) {
		return adminDao.save(object);
	}

	@Override
	public Optional<Admin> update(Admin object) {
		return adminDao.update(object);
	}

	@Override
	public List<Admin> getAll() {
		return (List<Admin>) adminDao.getAll();
	}

	@Override
	public Optional<Admin> getByName(String name) {
		return adminDao.getByName(name);
	}

	@Override
	public void delete(Admin object) {
		adminDao.delete(object);
	}

	@Override
	public void deleteAll() {
		adminDao.deleteAll();
	}

	@Override
	public void deleteByName(String name) {
		adminDao.deleteByName(name);
	}

	@Override
	public List<Admin> getCustomerByPosition(String position) {
		return adminDao.getCustomerByPosition(position);
	}

	@Override
	public List<Admin> getCustomerByTasks(String tasks) {
		return adminDao.getCustomerByTasks(tasks);
	}

}
