package sdaproject.covidacademyapi.single_state_specific_date.service;

public class NoStateFoundException extends RuntimeException {
    public NoStateFoundException(String stateName) {
        super(String.format("No state: %s found!", stateName));
    }
}
