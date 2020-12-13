package sdaproject.covidacademyapi.single_state_specific_date.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SingleStateDateStats;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SpecificTrackingApi;

@Repository
public class SpecificTrackingApiRepository implements SpecificTrackingApi {

        private final String url;
        private final RestTemplate restTemplate;

        public SpecificTrackingApiRepository(RestTemplate restTemplate, @Value("${specifictrackingapi.url}") String url) {
            this.url = url;
            this.restTemplate = restTemplate;
        }
        @Override
        public SingleStateDateStats getSpecificStateDateStats(String state, String date) {
            return restTemplate.getForObject(String.format(url, state, date), SingleStateDateStats.class);
        }
}
