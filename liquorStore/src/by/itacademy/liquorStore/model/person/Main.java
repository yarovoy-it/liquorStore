package by.itacademy.liquorStore.model.person;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.liquorStore.model.alcohol.AAlcohol;
import by.itacademy.liquorStore.model.alcohol.Beer;
import by.itacademy.liquorStore.model.alcohol.Wine;
import by.itacademy.liquorStore.model.person.*;

public class Main {

	public static void main(String[] args) {

		Beer beer = new Beer(34, "���������", 15, "��������", 3);
		Wine wine = new Wine("���������", 10, "������", 13, "������");
		AAlcohol aalcohol = (AAlcohol) wine;

		PersonDetail pd = new PersonDetail("����", "homeless", 228);
		List<String> str = new ArrayList();
		str.add("syrvive");
		Admin admin = (Admin) add(pd, "�������", str);
		System.out.println(admin);

		/*
		 * System.out.println(beer);
		 * 
		 * Customer cust = new Customer("����", "������", 334, 0, null, (List<AAlcohol>)
		 * beer); System.out.println(cust);
		 */
	}

	public static PersonDetail add(PersonDetail object, String position, List<String> tasks) {
		Admin admin = new Admin(object.getName(), object.getAddress(), object.getPhone(), position, tasks);
		return (PersonDetail) admin;
	}

}
