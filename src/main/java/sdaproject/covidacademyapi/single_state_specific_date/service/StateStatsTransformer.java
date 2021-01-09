package sdaproject.covidacademyapi.single_state_specific_date.service;

import org.springframework.stereotype.Component;
import sdaproject.covidacademyapi.single_state_specific_date.repository.SingleStateDateStats;
import sdaproject.covidacademyapi.states_data.repository.StatesData;
import sdaproject.covidacademyapi.states_stats.repository.StateCurrentStats;

@Component
public class StateStatsTransformer {

    public StateStatsDTO transformToDTO(SingleStateDateStats singleStateDateStats, StatesData statesData) {
        StateStatsDTO stateStatsDTO = new StateStatsDTO();
        stateStatsDTO.setStatesData(statesData);
        stateStatsDTO.setNegative(singleStateDateStats.getNegative());
        stateStatsDTO.setPositive(singleStateDateStats.getPositive());
        stateStatsDTO.setDeathConfirmed(singleStateDateStats.getDeathConfirmed());
        stateStatsDTO.setRecovered(singleStateDateStats.getRecovered());
        return stateStatsDTO;
    }

    public StateStatsDTO transformToDTO(StateCurrentStats stateCurrentStats, StatesData statesData) {
        StateStatsDTO stateStatsDTO = new StateStatsDTO();
        stateStatsDTO.setStatesData(statesData);
        stateStatsDTO.setNegative(stateCurrentStats.getNegative());
        stateStatsDTO.setPositive(stateCurrentStats.getPositive());
        stateStatsDTO.setDeathConfirmed(stateCurrentStats.getDeathConfirmed());
        stateStatsDTO.setRecovered(stateCurrentStats.getRecovered());
        return stateStatsDTO;
    }
}
