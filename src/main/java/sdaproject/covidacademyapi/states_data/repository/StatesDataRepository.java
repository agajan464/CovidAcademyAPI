package sdaproject.covidacademyapi.states_data.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class StatesDataRepository implements StatesDataApi {
    private final String url;
    private final RestTemplate restTemplate;

    public StatesDataRepository(RestTemplate restTemplate, @Value("${statesdataapi.url}") String url) {
        this.url = url;
        this.restTemplate = restTemplate;
    }

    @Override
    public StatesData[] getAllStatesData() {
        return restTemplate.getForObject(url, StatesData[].class);
    }
}
