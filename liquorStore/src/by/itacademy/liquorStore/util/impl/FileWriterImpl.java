package by.itacademy.liquorStore.util.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;

import by.itacademy.liquorStore.util.FileWriter;

public class FileWriterImpl implements FileWriter<String> {

	private static FileWriterImpl instance;

	public static FileWriterImpl getInstance() {
		if (instance == null) {
			instance = new FileWriterImpl();
		}
		return instance;
	}

	private FileWriterImpl() {

	}

	@Override
	public void writeFile(String path, Collection<?> collection) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
			collection.forEach((t) -> {
				try {
					objectOutputStream.writeObject(t);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
