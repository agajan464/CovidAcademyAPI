package sdaproject.covidacademyapi.single_state_specific_date.repository;

import sdaproject.covidacademyapi.single_state_specific_date.repository.SingleStateDateStats;

public interface SpecificTrackingApi {
    SingleStateDateStats getSpecificStateDateStats(String state, String date);
}
