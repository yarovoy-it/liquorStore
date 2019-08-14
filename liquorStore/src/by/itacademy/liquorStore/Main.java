package by.itacademy.liquorStore;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Alcohol;
import by.itacademy.liquorStore.model.alcohol.Beer;
import by.itacademy.liquorStore.model.alcohol.Whisky;
import by.itacademy.liquorStore.model.alcohol.Wine;
import by.itacademy.liquorStore.model.person.Admin;
import by.itacademy.liquorStore.model.person.Customer;
import by.itacademy.liquorStore.service.alcohol.BeerService;
import by.itacademy.liquorStore.service.alcohol.WhiskyService;
import by.itacademy.liquorStore.service.alcohol.WineService;
import by.itacademy.liquorStore.service.impl.alcohol.BeerServiceImpl;
import by.itacademy.liquorStore.service.impl.alcohol.WhiskyServiceImpl;
import by.itacademy.liquorStore.service.impl.alcohol.WineServiceImpl;
import by.itacademy.liquorStore.service.impl.person.AdminServiceImpl;
import by.itacademy.liquorStore.service.impl.person.CustomerServiceImpl;
import by.itacademy.liquorStore.service.person.AdminService;
import by.itacademy.liquorStore.service.person.CustomerService;

public class Main {

	private final BeerService beerService;
	private final WhiskyService whiskyService;
	private final WineService wineService;

	private final AdminService adminService;
	private final CustomerService customerService;

	private Main() {
		this.beerService = BeerServiceImpl.getInstance();
		this.whiskyService = WhiskyServiceImpl.getInstance();
		this.wineService = WineServiceImpl.getInstance();

		this.adminService = AdminServiceImpl.getInstance();
		this.customerService = CustomerServiceImpl.getInstance();
	}

	public static void main(String[] args) {
		final Main main = new Main();

		List<String> tasks;
		List<Alcohol> alcohols;

		Wine wine = new Wine("Barefoot", 7, "Austalian", 13, "Chardonnay", 5);
		Whisky whisky = new Whisky(1.0, "Highland Park", 30, "Ireland", 40, 1);
		Beer beer = new Beer(5.0, "MasterPiceBeer", 5, "someWhere", 3, 10);

		tasks = new ArrayList<>();
		tasks.add("sleep");
		tasks.add("relax");
		tasks.add("enjoiYourLife");

		alcohols = new ArrayList<>();
		alcohols.add(wine);
		alcohols.add(beer);
		alcohols.add(whisky);

		Admin admin = new Admin("Vasia", "Far Far Away kingdom", 999, "Boss", tasks);
		Admin admin2 = new Admin("Vasia2", "Far Far Away kingdom2", 9992, "Boss2", tasks);
		Customer customer = new Customer("Grisha", "next to kingdom", 345, 0, "guest", alcohols);

		main.adminService.deleteAll();
		main.adminService.save(admin);
		main.adminService.save(admin2);
		main.adminService.getAdminByPosition("Boss2").forEach(System.out::println);

		Admin adminId = main.adminService.update(admin2).get();
		System.out.println(adminId);
		main.adminService.getAll().forEach(System.out::println);

		main.customerService.deleteAll();
		main.customerService.save(customer);
		main.customerService.getAll().forEach(System.out::println);

		main.beerService.deleteAll();
		main.beerService.save(beer);
		main.beerService.getAll().forEach(System.out::println);

		main.whiskyService.deleteAll();
		main.whiskyService.save(whisky);
		main.whiskyService.getAll().forEach(System.out::println);

		main.wineService.deleteAll();
		main.wineService.save(wine);
		main.wineService.getAll().forEach(System.out::println);

		System.out.println("Done");

	}

}
