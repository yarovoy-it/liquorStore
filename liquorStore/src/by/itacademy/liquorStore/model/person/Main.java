package by.itacademy.liquorStore.model.person;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.liquorStore.model.alcohol.AAlcohol;
import by.itacademy.liquorStore.model.alcohol.Beer;
import by.itacademy.liquorStore.model.alcohol.Wine;
import by.itacademy.liquorStore.model.person.*;

public class Main {

	public static void main(String[] args) {

		Beer beer = new Beer(34, "Бархотное", 15, "Беларусь", 3);
		Wine wine = new Wine("Хванчкара", 10, "Грузия", 13, "Грузия");
		AAlcohol aalcohol = (AAlcohol) wine;

		PersonDetail pd = new PersonDetail("ВАСЯ", "homeless", 228);
		List<String> str = new ArrayList();
		str.add("syrvive");
		Admin admin = (Admin) add(pd, "чмырдос", str);
		System.out.println(admin);

		/*
		 * System.out.println(beer);
		 * 
		 * Customer cust = new Customer("Вася", "Гродно", 334, 0, null, (List<AAlcohol>)
		 * beer); System.out.println(cust);
		 */
	}

	public static PersonDetail add(PersonDetail object, String position, List<String> tasks) {
		Admin admin = new Admin(object.getName(), object.getAddress(), object.getPhone(), position, tasks);
		return (PersonDetail) admin;
	}

}
