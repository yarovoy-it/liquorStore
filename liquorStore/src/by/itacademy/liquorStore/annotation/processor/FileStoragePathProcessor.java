package by.itacademy.liquorStore.annotation.processor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

import by.itacademy.liquorStore.annotation.FileStorage;

public class FileStoragePathProcessor {

	private static FileStoragePathProcessor instance;

	private FileStoragePathProcessor() {

	}

	public static FileStoragePathProcessor getInstance() {
		if (instance == null) {
			instance = new FileStoragePathProcessor();
		}
		return instance;
	}

	public String getPath(Class<?> aClass) {
		final String name = getFileStorageName(aClass);
		return getPath(name);

	}

	private String getFileStorageName(Class<?> objectClass) {
		final Optional<FileStorage> optionalFileStorage = Optional
				.ofNullable(objectClass.getAnnotation(FileStorage.class));
		final FileStorage fileStorage = optionalFileStorage.orElseThrow(
				() -> new RuntimeException("Class: " + objectClass.getName() + "don't have a FileStorage annotation!"));
		final String name = fileStorage.name();
		if (name.isEmpty()) {
			throw new RuntimeException(
					"Class: " + objectClass.getName() + "annotation FileStorage don't have a name param!");
		}
		return name;
	}

	private String getPath(String name) {
		try (InputStream input = this.getClass().getClassLoader().getResourceAsStream("application.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			final String root = prop.getProperty("dao.file.root");
			final String format = prop.getProperty("dao.file.format");
			return root + name + format;
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}

	}

}
