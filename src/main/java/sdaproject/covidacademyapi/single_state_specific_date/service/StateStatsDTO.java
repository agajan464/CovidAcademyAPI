package sdaproject.covidacademyapi.single_state_specific_date.service;

import sdaproject.covidacademyapi.states_data.repository.StatesData;

public class StateStatsDTO {
    private StatesData statesData;
    private int positive;
    private int negative;
    private int deathConfirmed;
    private int recovered;

    public StatesData getStatesData() {
        return statesData;
    }

    public void setStatesData(StatesData statesData) {
        this.statesData = statesData;
    }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }

    public int getNegative() {
        return negative;
    }

    public void setNegative(int negative) {
        this.negative = negative;
    }

    public int getDeathConfirmed() {
        return deathConfirmed;
    }

    public void setDeathConfirmed(int deathConfirmed) {
        this.deathConfirmed = deathConfirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }
}
