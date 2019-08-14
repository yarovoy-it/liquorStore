package by.itacademy.liquorStore.service.impl.person;

import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.impl.person.CustomerDaoImpl;
import by.itacademy.liquorStore.dao.person.CustomerDao;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.person.Customer;
import by.itacademy.liquorStore.service.person.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private static CustomerService instance;

	private CustomerDao customerDao = CustomerDaoImpl.getInstance();

	private CustomerServiceImpl() {

	}

	public static CustomerService getInstance() {
		if (instance == null) {
			instance = new CustomerServiceImpl();
		}
		return instance;
	}

	@Override
	public boolean addAlcoholToCustomer(Alcohol alcohol) {
		return false;
	}

	@Override
	public List<Customer> getPersonDetailByAddress(String address) {
		return customerDao.getPersonDetailByAddress(address);
	}

	@Override
	public List<Customer> getPersonDetailByPhone(String phone) {
		return customerDao.getPersonDetailByPhone(phone);
	}

	@Override
	public Optional<Customer> save(Customer object) {
		return customerDao.save(object);
	}

	@Override
	public Optional<Customer> update(Customer object) {
		return customerDao.update(object);
	}

	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}

	@Override
	public Optional<Customer> getByName(String name) {
		return customerDao.getByName(name);
	}

	@Override
	public void delete(Customer object) {
		customerDao.delete(object);
	}

	@Override
	public void deleteAll() {
		customerDao.deleteAll();
	}

	@Override
	public List<Customer> getCustomerByDiscount(Integer discount) {
		return customerDao.getCustomerByDiscount(discount);
	}

	@Override
	public List<Customer> getCustomerByStatus(String status) {
		return customerDao.getCustomerByStatus(status);
	}

	@Override
	public List<Customer> getCustomerByAlcohol(String alcohol) {
		return customerDao.getCustomerByAlcohol(alcohol);
	}

	@Override
	public Optional<Customer> getById(Long id) {
		return customerDao.getById(id);
	}

}
