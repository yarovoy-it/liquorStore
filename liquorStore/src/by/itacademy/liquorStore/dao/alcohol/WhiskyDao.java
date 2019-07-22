package by.itacademy.liquorStore.dao.alcohol;

import java.util.Set;

import by.itacademy.liquorStore.model.alcohol.Whisky;

public interface WhiskyDao extends AlcoholDao<Whisky> {

	Set<Whisky> getWhiskyBySpecificities(String specificities);

}
