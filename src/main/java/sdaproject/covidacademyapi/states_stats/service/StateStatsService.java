package sdaproject.covidacademyapi.states_stats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_stats.repository.CovidTrackingApi;
import sdaproject.covidacademyapi.states_stats.repository.CovidTrackingApiRepository;
import sdaproject.covidacademyapi.states_stats.repository.StateCurrentStats;

@Service
public class StateStatsService {
    private final CovidTrackingApi covidTrackingApi;

    @Autowired
    public StateStatsService(CovidTrackingApi covidTrackingApi) {
        this.covidTrackingApi = covidTrackingApi;
    }

    public StateCurrentStats[] getAllStatesCurrentStats() {
        return covidTrackingApi.getAllStatesCurrentStats();
    }
}
