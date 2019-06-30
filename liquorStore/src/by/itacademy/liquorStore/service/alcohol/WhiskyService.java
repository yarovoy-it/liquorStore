package by.itacademy.liquorStore.service.alcohol;

import java.util.List;

import by.itacademy.liquorStore.model.alcohol.Whisky;

public interface WhiskyService extends AlcoholService {

	List<Whisky> getWhiskyBySpecificities(String specificities);

}
