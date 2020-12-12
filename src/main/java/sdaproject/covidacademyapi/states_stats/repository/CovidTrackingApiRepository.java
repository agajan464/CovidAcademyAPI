package sdaproject.covidacademyapi.states_stats.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CovidTrackingApiRepository implements CovidTrackingApi {
    private final String url;
    private final RestTemplate restTemplate;

    public CovidTrackingApiRepository(RestTemplate restTemplate, @Value("${covidtrackingapi.url}") String url) {
        this.url = url;
        this.restTemplate = restTemplate;
    }

    @Override
    public StateCurrentStats[] getAllStatesCurrentStats() {

        return restTemplate.getForObject(url, StateCurrentStats[].class);
    }
}
