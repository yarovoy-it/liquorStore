package by.itacademy.liquorStore.util.impl;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

import by.itacademy.liquorStore.util.FileReader;

public class FileReaderImpl implements FileReader<String> {

	private static FileReaderImpl instance;

	public static FileReaderImpl getInstance() {
		if (instance == null) {
			instance = new FileReaderImpl();
		}
		return instance;
	}

	private FileReaderImpl() {

	}

	@Override
	public Collection<Object> readFile(String path) {
		final ArrayList<Object> list = new ArrayList<>();
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)))) {
			while (true) {
				Object o = objectInputStream.readObject();
				list.add(o);
			}
		} catch (EOFException e) {
			// empty
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

}
