package by.itacademy.liquorStore.dao.impl.person;

import java.util.List;

import by.itacademy.liquorStore.dao.person.AdminDao;
import by.itacademy.liquorStore.model.person.Admin;
import by.itacademy.liquorStore.model.person.PersonDetail;

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
	public List<PersonDetail> getPersonDetailByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonDetail> getPersonDetailByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin save(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByName(String Name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Admin> getCustomerByPosition(String position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getCustomerByTasks(String tasks) {
		// TODO Auto-generated method stub
		return null;
	}

}
