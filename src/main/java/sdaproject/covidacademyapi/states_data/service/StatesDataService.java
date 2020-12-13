package sdaproject.covidacademyapi.states_data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_data.repository.StatesDataApi;

@Service
public class StatesDataService {
    private final StatesDataApi statesDataApi;

    @Autowired
    public StatesDataService(StatesDataApi statesDataApi) {
        this.statesDataApi = statesDataApi;
    }

    public StatesData[] getAllStatesData() {
        return statesDataApi.getAllStatesData();
    }
}
