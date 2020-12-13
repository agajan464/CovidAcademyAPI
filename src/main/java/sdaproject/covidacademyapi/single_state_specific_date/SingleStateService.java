package sdaproject.covidacademyapi.single_state_specific_date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Date;

@Service
public class SingleStateService {
    private final SpecificTrackingApi specificTrackingApi;
    @Autowired
    public SingleStateService(SpecificTrackingApi specificTrackingApi) {
        this.specificTrackingApi = specificTrackingApi;
    }

    public SingleStateDateStats getSpecificStateDateStats() {
        return specificTrackingApi.getSpecificStateDateStats();
    }
}
