package sdaproject.covidacademyapi.single_state_specific_date.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SingleStateDateStats;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SpecificTrackingApi;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_data.service.StatesDataService;

@Service
public class SingleStateService {
    private final SpecificTrackingApi specificTrackingApi;
    private final StatesDataService statesDataService;
    private final StateStatsTransformer stateStatsTransformer;


    @Autowired
    public SingleStateService(SpecificTrackingApi specificTrackingApi, StatesDataService statesDataService, StateStatsTransformer stateStatsTransformer) {
        this.specificTrackingApi = specificTrackingApi;
        this.statesDataService = statesDataService;
        this.stateStatsTransformer = stateStatsTransformer;
    }


    public StateStatsDTO getSpecificStateDateStats(String state, String date) {
        StatesData statesData = statesDataService.getStatesByName(state).orElseThrow(() -> new IllegalArgumentException());
        String acronym = statesData.getState();
        SingleStateDateStats stateStats = specificTrackingApi.getSpecificStateDateStats(acronym, date);
        return stateStatsTransformer.transformToDTO(stateStats, statesData);
    }
}
