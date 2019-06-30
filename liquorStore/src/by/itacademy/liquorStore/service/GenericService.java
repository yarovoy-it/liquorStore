package by.itacademy.liquorStore.service;

import java.util.List;

public interface GenericService {

	Object save(Object object);

	Object update(Object object);

	List<Object> getAll();

	Object getByName(String Name);

	void delete(Object object);

	void deleteAll();

	void deleteByName(String Name);

}
