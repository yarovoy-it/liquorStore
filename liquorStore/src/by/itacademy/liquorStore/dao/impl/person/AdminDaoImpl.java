package by.itacademy.liquorStore.dao.impl.person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import by.itacademy.liquorStore.dao.person.AdminDao;
import by.itacademy.liquorStore.model.person.Admin;

public class AdminDaoImpl extends PersonalDetailDaoImpl<Admin> implements AdminDao {

	private static AdminDao instance;

	private AdminDaoImpl() {
		super(Admin.class, (o) -> {
			Admin admin = null;
			if (o instanceof Admin) {
				admin = (Admin) o;
			}
			return admin;
		});
	}

	public static AdminDao getInstance() {
		if (instance == null) {
			instance = new AdminDaoImpl();
		}

		return instance;
	}

	@Override
	public List<Admin> getAdminByPosition(String position) {
		return getAll()
				.stream()
				.filter(a -> a.getPosition().equals(position))
				.collect(Collectors.toList());
	}

	@Override
	public List<Admin> getAdminByTasks(String tasks) {
		return new ArrayList<>();
	}

	@Override
	public List<Admin> getAll() {
		return new ArrayList<>(super.getAll());
	}
}
