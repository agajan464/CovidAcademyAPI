package sdaproject.covidacademyapi.single_state_specific_date;

import java.util.Date;

public class SingleStateDateStats {
    private String state;
    private Date date;
    private int positive;
    private int negative;
    private int deathConfirmed;
    private int recovered;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
