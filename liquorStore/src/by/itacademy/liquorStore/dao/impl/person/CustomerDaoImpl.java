package by.itacademy.liquorStore.dao.impl.person;

import java.util.List;
import java.util.Optional;

import by.itacademy.liquorStore.dao.person.CustomerDao;
import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.person.Customer;

import static java.util.Optional.empty;

import java.util.ArrayList;

public class CustomerDaoImpl implements CustomerDao {

	private static CustomerDao instance;

	private CustomerDaoImpl() {
	}

	public static CustomerDao getInstance() {
		if (instance == null) {
			instance = new CustomerDaoImpl();
		}

		return instance;
	}

	@Override
	public List<Customer> getPersonDetailByAddress(String address) {
		return new ArrayList<>();
	}

	@Override
	public List<Customer> getPersonDetailByPhone(String phone) {
		return new ArrayList<>();
	}

	@Override
	public Optional<Customer> save(Customer t) {
		return empty();
	}

	@Override
	public Optional<Customer> update(Customer t) {
		return empty();
	}

	@Override
	public List<Customer> getAll() {
		return new ArrayList<>();
	}

	@Override
	public Optional<Customer> getByName(String name) {
		return empty();
	}

	@Override
	public void delete(Customer t) {

	}

	@Override
	public void deleteAll() {
	}

	@Override
	public void deleteByName(String name) {
	}

	@Override
	public List<Customer> getCustomerByAlcohol(Alcohol alcohol) {
		return new ArrayList<>();
	}

	@Override
	public List<Customer> getCustomerByDiscount(int discount) {
		return new ArrayList<>();
	}

	@Override
	public List<Customer> getCustomerByStatus(String status) {
		return new ArrayList<>();
	}

}
