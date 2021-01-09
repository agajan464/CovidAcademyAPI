package sdaproject.covidacademyapi.single_state_specific_date.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SingleStateDateStats;
import sdaproject.covidacademyapi.single_state_specific_date.feature.SingleStateService;

@RequestMapping("/state")
@RestController
public class SingleStateController {
    private final SingleStateService singleStateService;

    @Autowired
    public SingleStateController(SingleStateService singleStateService) {
        this.singleStateService = singleStateService;
    }

    @GetMapping("/{state}/{date}")
    public SingleStateDateStats getSpecificStateStats(@PathVariable String state, @PathVariable String date) {
        return singleStateService.getSpecificStateDateStats(state, date);
    }

}
