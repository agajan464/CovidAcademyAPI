package sdaproject.covidacademyapi.states_stats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdaproject.covidacademyapi.states_stats.repository.StateCurrentStats;
import sdaproject.covidacademyapi.states_stats.service.StateStatsService;

@RequestMapping("/states")
@RestController
public class StatesStatsController {
    private final StateStatsService stateStatsService;

    @Autowired
    public StatesStatsController(StateStatsService stateStatsService) {
        this.stateStatsService = stateStatsService;
    }

    @GetMapping
    public StateCurrentStats[] getCurrentStateStats() {
        return stateStatsService.getAllStatesCurrentStats();
    }
}
