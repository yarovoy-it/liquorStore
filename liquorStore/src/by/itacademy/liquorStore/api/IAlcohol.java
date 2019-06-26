package by.itacademy.liquorStore.api;

import by.itacademy.liquorStore.model.alcohol.AAlcohol;

public interface IAlcohol {

	AAlcohol add(AAlcohol object);

	AAlcohol update(AAlcohol object);

	void delete(AAlcohol object);

}
