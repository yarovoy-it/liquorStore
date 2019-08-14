package by.itacademy.liquorStore.service.person;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.person.Customer;

public interface CustomerService extends PersonDetailService<Customer> {

	List<Customer> getCustomerByAlcohol(String alcohol);

	List<Customer> getCustomerByDiscount(Integer discount);

	List<Customer> getCustomerByStatus(String status);
	
	boolean addAlcoholToCustomer(Alcohol alcohol);

}
