package sdaproject.covidacademyapi.states_data.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_data.service.StatesDataService;

@RequestMapping("/data")
@RestController
public class StatesDataController {
    private final StatesDataService statesDataService;

    @Autowired
    public StatesDataController(StatesDataService statesDataService) {
        this.statesDataService = statesDataService;
    }

    @GetMapping
    public StatesData[] getStatesData() {
        return statesDataService.getAllStatesData();
    }
}
