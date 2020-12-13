package sdaproject.covidacademyapi.states_data.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_data.repository.StatesDataApi;
import sdaproject.covidacademyapi.states_data.repository.StatesDataDbRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StatesDataService {
    private final StatesDataApi statesDataApi;
    private final StatesDataDbRepository statesDataDbRepository;

    @Autowired
    public StatesDataService(StatesDataApi statesDataApi, StatesDataDbRepository statesDataDbRepository) {
        this.statesDataApi = statesDataApi;
        this.statesDataDbRepository = statesDataDbRepository;
    }

    public List<StatesData> getAllStatesData() {
        if (statesDataDbRepository.count() > 0) {
            return statesDataDbRepository.findAll();
        }
        List<StatesData> statesData = Arrays.asList(statesDataApi.getAllStatesData());
        return statesDataDbRepository.saveAll(statesData);
    }
}
