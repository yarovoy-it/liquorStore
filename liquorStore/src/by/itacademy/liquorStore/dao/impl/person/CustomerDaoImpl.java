package by.itacademy.liquorStore.dao.impl.person;

import java.util.List;

import by.itacademy.liquorStore.dao.person.CustomerDao;
import by.itacademy.liquorStore.model.person.Customer;

import java.util.ArrayList;

public class CustomerDaoImpl extends PersonalDetailDaoImpl<Customer> implements CustomerDao {

	private static CustomerDao instance;

	private CustomerDaoImpl() {
		super(Customer.class, (o) -> {
			Customer customer = null;
			if (o instanceof Customer) {
				customer = (Customer) o;
			}
			return customer;
		});
	}

	public static CustomerDao getInstance() {
		if (instance == null) {
			instance = new CustomerDaoImpl();
		}

		return instance;
	}

	@Override
	public List<Customer> getCustomerByAlcohol(String alcohol) {
		return new ArrayList<>();
	}

	@Override
	public List<Customer> getCustomerByDiscount(Integer discount) {
		return new ArrayList<>();
	}

	@Override
	public List<Customer> getCustomerByStatus(String status) {
		return new ArrayList<>();
	}
}
