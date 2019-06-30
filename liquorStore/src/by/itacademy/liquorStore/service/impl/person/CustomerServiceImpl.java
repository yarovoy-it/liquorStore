package by.itacademy.liquorStore.service.impl.person;

import java.util.List;

import by.itacademy.liquorStore.dao.impl.person.CustomerDaoImpl;
import by.itacademy.liquorStore.dao.person.CustomerDao;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.person.Customer;
import by.itacademy.liquorStore.model.person.PersonDetail;
import by.itacademy.liquorStore.service.person.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private static CustomerService instance;

	private CustomerDao customerDao = CustomerDaoImpl.getInstance();

	private CustomerServiceImpl() {

	}

	public CustomerService getInstance() {
		if (instance == null) {
			instance = new CustomerServiceImpl();
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
	public List<Customer> getCustomerByAlcohol(Alcohol alcohol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerByDiscount(int discount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
