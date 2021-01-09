package sdaproject.covidacademyapi.states_stats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdaproject.covidacademyapi.single_state_specific_date.service.StateStatsDTO;
import sdaproject.covidacademyapi.states_stats.service.StateStatsService;

import java.util.List;

@RequestMapping("/states")
@RestController
public class StatesStatsController {
    private final StateStatsService stateStatsService;

    @Autowired
    public StatesStatsController(StateStatsService stateStatsService) {
        this.stateStatsService = stateStatsService;
    }

    @GetMapping
    public List<StateStatsDTO> getCurrentStateStats() {
        return stateStatsService.getAllStatesCurrentStats();
    }
}
