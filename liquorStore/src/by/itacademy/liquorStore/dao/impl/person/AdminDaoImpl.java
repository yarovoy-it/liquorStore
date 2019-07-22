package by.itacademy.liquorStore.dao.impl.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.person.AdminDao;
import by.itacademy.liquorStore.model.person.Admin;

import static java.util.Optional.empty;

public class AdminDaoImpl implements AdminDao {

	private static AdminDao instance;

	private AdminDaoImpl() {
	}

	public static AdminDao getInstance() {
		if (instance == null) {
			instance = new AdminDaoImpl();
		}

		return instance;
	}

	@Override
	public List<Admin> getPersonDetailByAddress(String address) {
		return new ArrayList<>();
	}

	@Override
	public List<Admin> getPersonDetailByPhone(String phone) {
		return new ArrayList<>();
	}

	@Override
	public Optional<Admin> save(Admin t) {
		return empty();
	}

	@Override
	public Optional<Admin> update(Admin t) {
		return empty();
	}

	@Override
	public List<Admin> getAll() {
		return new ArrayList<>();
	}

	@Override
	public Optional<Admin> getByName(String name) {
		return empty();
	}

	@Override
	public void delete(Admin t) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public void deleteByName(String name) {

	}

	@Override
	public List<Admin> getCustomerByPosition(String position) {
		return new ArrayList<>();
	}

	@Override
	public List<Admin> getCustomerByTasks(String tasks) {
		return new ArrayList<>();
	}

}
