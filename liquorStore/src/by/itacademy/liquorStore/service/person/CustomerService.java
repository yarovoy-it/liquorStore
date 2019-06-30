package by.itacademy.liquorStore.service.person;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.person.Customer;

public interface CustomerService extends PersonDetailService {

	List<Customer> getCustomerByAlcohol(Alcohol alcohol);

	List<Customer> getCustomerByDiscount(int discount);

	List<Customer> getCustomerByStatus(String status);

}
