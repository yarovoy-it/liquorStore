package by.itacademy.liquorStore.service;

import java.util.Collection;
import java.util.Optional;

public interface GenericService<T> {

	Optional<T> save(T object);

	Optional<T> update(T object);

	Collection<T> getAll();

	Optional<T> getById(Long id);

	Optional<T> getByName(String name);

	void delete(T object);

	void deleteAll();

}
