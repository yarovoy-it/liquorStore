package by.itacademy.liquorStore.dao.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Whisky;

public interface WhiskyDao extends AlcoholDao {

	List<Whisky> getWhiskyBySpecificities(String specificities);

}
