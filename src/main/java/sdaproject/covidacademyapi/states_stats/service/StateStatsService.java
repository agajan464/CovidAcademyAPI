package sdaproject.covidacademyapi.states_stats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdaproject.covidacademyapi.states_stats.repository.CovidTrackingApiRepository;
import sdaproject.covidacademyapi.states_stats.repository.StateCurrentStats;
@Service
public class StateStatsService {
    private final CovidTrackingApiRepository covidTrackingApiRepository;
    @Autowired
    public StateStatsService(CovidTrackingApiRepository covidTrackingApiRepository) {
        this.covidTrackingApiRepository = covidTrackingApiRepository;
    }

    public StateCurrentStats[] getAllStatesCurrentStats() {
        return covidTrackingApiRepository.getAllStatesCurrentStats();
    }
}
