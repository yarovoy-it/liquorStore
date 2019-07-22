package by.itacademy.liquorStore.service.alcohol;

import java.util.Set;

import by.itacademy.liquorStore.model.alcohol.Whisky;

public interface WhiskyService extends AlcoholService<Whisky> {

	Set<Whisky> getWhiskyBySpecificities(String specificities);

}
