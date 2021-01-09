package sdaproject.covidacademyapi.single_state_specific_date.feature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SingleStateDateStats;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SpecificTrackingApi;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_data.repository.StatesDataApi;
import sdaproject.covidacademyapi.states_data.repository.StatesDataDbRepository;
import sdaproject.covidacademyapi.states_data.service.StatesDataService;

import java.util.Arrays;
import java.util.List;

@Service
public class SingleStateService {
    private final SpecificTrackingApi specificTrackingApi;
    private final StatesDataService statesDataService;


    @Autowired
    public SingleStateService(SpecificTrackingApi specificTrackingApi, StatesDataService statesDataService) {
        this.specificTrackingApi = specificTrackingApi;
        this.statesDataService = statesDataService;

    }
    @Autowired
    StatesDataDbRepository statesDataDbRepository;


    public SingleStateDateStats getSpecificStateDateStats(String state, String date) {
        List<StatesData> statesData = statesDataService.getAllStatesData();
        String acronym = statesDataService.getStatesByName(state).orElseThrow(()->new IllegalArgumentException()).getState();
        return specificTrackingApi.getSpecificStateDateStats(acronym, date);
    }
}
