package by.itacademy.liquorStore.service.impl.person;

import java.util.List;

import by.itacademy.liquorStore.dao.impl.person.AdminDaoImpl;
import by.itacademy.liquorStore.dao.person.AdminDao;
import by.itacademy.liquorStore.model.person.Admin;
import by.itacademy.liquorStore.model.person.PersonDetail;
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
	public Object save(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getByName(String Name) {
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
