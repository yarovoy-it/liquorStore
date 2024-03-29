package by.itacademy.liquorStore.dao;

import java.util.Collection;
import java.util.Optional;

public interface GenericDao<T> {

	Optional<T> save(T t);

	Optional<T> update(T t);

	Collection<T> getAll();

	Optional<T> getByName(String name);

	Optional<T> getById(Long id);

	void delete(T t);

	void deleteAll();

}
