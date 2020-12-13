package sdaproject.covidacademyapi.single_state_specific_date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
@Repository
public class SpecificTrackingApiRepository implements SpecificTrackingApi {

        private final String url;
        private final RestTemplate restTemplate;

        public SpecificTrackingApiRepository(RestTemplate restTemplate, @Value("${specifictrackingapi.url}") String url) {
            this.url = url;
            this.restTemplate = restTemplate;
        }
        @Override
        public SingleStateDateStats getSpecificStateDateStats() {
            return restTemplate.getForObject(url, SingleStateDateStats.class);
        }
}
