package by.itacademy.liquorStore.util;

import java.util.Collection;

public interface FileWriter<T> {

	void writeFile(T path, Collection<?> collection);

}
