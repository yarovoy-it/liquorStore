package by.itacademy.liquorStore.dao.person;

import java.util.List;

import by.itacademy.liquorStore.model.person.Customer;

public interface CustomerDao extends PersonDetailDao<Customer> {

	List<Customer> getCustomerByAlcohol(String alcohol);

	List<Customer> getCustomerByDiscount(Integer discount);

	List<Customer> getCustomerByStatus(String status);

}
