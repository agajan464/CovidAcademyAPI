package sdaproject.covidacademyapi.single_state_specific_date.feature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SingleStateDateStats;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SpecificTrackingApi;

@Service
public class SingleStateService {
    private final SpecificTrackingApi specificTrackingApi;
    @Autowired
    public SingleStateService(SpecificTrackingApi specificTrackingApi) {
        this.specificTrackingApi = specificTrackingApi;
    }

    public SingleStateDateStats getSpecificStateDateStats(String state, String date) {
        return specificTrackingApi.getSpecificStateDateStats(state, date);
    }
}
