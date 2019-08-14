package by.itacademy.liquorStore.dao.impl;

import java.util.*;
import java.util.function.Function;

import by.itacademy.liquorStore.annotation.processor.FileStoragePathProcessor;
import by.itacademy.liquorStore.dao.GenericDao;
import by.itacademy.liquorStore.model.base.BaseEntity;
import by.itacademy.liquorStore.util.FileReader;
import by.itacademy.liquorStore.util.FileWriter;
import by.itacademy.liquorStore.util.impl.FileReaderImpl;
import by.itacademy.liquorStore.util.impl.FileWriterImpl;

import static java.util.stream.Collectors.toList;

public class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

	final FileWriter<String> writer;
	final FileReader<String> reader;
	final Function<Object, T> mapper;
	private final String path;

	protected GenericDaoImpl(Class<T> typeParameterClass, Function<Object, T> mapper) {
		this.writer = FileWriterImpl.getInstance();
		this.reader = FileReaderImpl.getInstance();
		this.mapper = mapper;
		this.path = FileStoragePathProcessor.getInstance().getPath(typeParameterClass);

	}

	@Override
	public Optional<T> save(T t) {
		final Collection<T> collection = getCollection();
		t.setId(generateId(collection));
		collection.add(t);
		writer.writeFile(path, collection);
		return Optional.of(t);
	}

	@Override
	public Optional<T> update(T t) {
		final Collection<T> collection = getCollection();
		final List<T> list = getUpdatedList(t, collection);
		writer.writeFile(path, list);
		return Optional.of(t);
	}

	@Override
	public Collection<T> getAll() {
		return getCollection();
	}

	@Override
	public Optional<T> getById(Long id) {
		return getCollection().stream().filter(o -> o.getId().equals(id)).findFirst();
	}

	@Override
	public void delete(T t) {
		final Collection<T> collection = getCollection();
		final List<T> list = collection.stream().filter(o -> !o.getId().equals(t.getId())).collect(toList());
		writer.writeFile(path, list);

	}

	@Override
	public void deleteAll() {
		writer.writeFile(path, new ArrayList<>());

	}

	private Long generateId(Collection<T> collection) {
		Optional<Long> elementOptional = collection.stream().map(BaseEntity::getId).max(Comparator.naturalOrder());
		return elementOptional.orElse(0L) + 1L;
	}

	private List<T> getUpdatedList(T t, Collection<T> collection) {
		final Optional<T> elementOptional = collection.stream().filter((o) -> o.getId().equals(t.getId())).findFirst();
		final T element = elementOptional
				.orElseThrow(() -> new RuntimeException("Cannot update a non-existing object!"));
		return collection.stream().map(o -> o.getId().equals(element.getId()) ? element : o).collect(toList());
	}

	private Collection<T> getCollection() {
		return reader.readFile(path).stream().map(mapper).collect(toList());
	}

	@Override
	public Optional<T> getByName(String name) {
		return Optional.empty();
	}

}
