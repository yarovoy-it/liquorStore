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

	public static AdminService getInstance() {
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
		return adminDao.getAll();
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
	public List<Admin> getAdminByPosition(String position) {
		return adminDao.getAdminByPosition(position);
	}

	@Override
	public List<Admin> getAdminByTasks(String tasks) {
		return adminDao.getAdminByTasks(tasks);
	}

	@Override
	public Optional<Admin> getById(Long id) {
		return adminDao.getById(id);
	}

}
