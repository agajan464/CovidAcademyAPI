package sdaproject.covidacademyapi.single_state_specific_date;

public interface SpecificTrackingApi {
    SingleStateDateStats getSpecificStateDateStats(String state, String date);
}
