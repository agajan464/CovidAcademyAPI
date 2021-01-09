package sdaproject.covidacademyapi.states_stats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdaproject.covidacademyapi.single_state_specific_date.service.StateStatsDTO;
import sdaproject.covidacademyapi.single_state_specific_date.service.StateStatsTransformer;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_data.service.StatesDataService;
import sdaproject.covidacademyapi.states_stats.repository.CovidTrackingApi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StateStatsService {
    private final CovidTrackingApi covidTrackingApi;
    private final StateStatsTransformer stateStatsTransformer;
    private final StatesDataService statesDataService;

    @Autowired
    public StateStatsService(CovidTrackingApi covidTrackingApi, StateStatsTransformer stateStatsTransformer, StatesDataService statesDataService) {
        this.covidTrackingApi = covidTrackingApi;
        this.stateStatsTransformer = stateStatsTransformer;
        this.statesDataService = statesDataService;
    }

    public List<StateStatsDTO> getAllStatesCurrentStats() {
        return Arrays.stream(covidTrackingApi.getAllStatesCurrentStats()).map(stateStats -> {
            StatesData statesData = statesDataService.getStateById(stateStats.getState()).get();
            return stateStatsTransformer.transformToDTO(stateStats, statesData);
        })
                .collect(Collectors.toList());
    }
}
