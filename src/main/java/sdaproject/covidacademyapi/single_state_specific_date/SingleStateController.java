package sdaproject.covidacademyapi.single_state_specific_date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/state")
@RestController
public class SingleStateController {
    private final SingleStateService singleStateService;
    @Autowired
    public SingleStateController(SingleStateService singleStateService) {
        this.singleStateService = singleStateService;
    }
    @GetMapping
    public SingleStateDateStats getSpecificStateStats(@PathVariable String state, Date date) {
        return singleStateService.getSpecificStateDateStats();
    }

}
