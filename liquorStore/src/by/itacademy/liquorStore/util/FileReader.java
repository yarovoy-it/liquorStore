package by.itacademy.liquorStore.util;

import java.util.Collection;

public interface FileReader<T> {

	Collection<Object> readFile(T path);

}
