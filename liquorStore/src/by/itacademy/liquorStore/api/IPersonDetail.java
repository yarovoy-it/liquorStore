package by.itacademy.liquorStore.api;

import by.itacademy.liquorStore.model.person.PersonDetail;

public interface IPersonDetail {

	PersonDetail add(PersonDetail object);

	PersonDetail update(PersonDetail object);

	void delete(PersonDetail object);

}
