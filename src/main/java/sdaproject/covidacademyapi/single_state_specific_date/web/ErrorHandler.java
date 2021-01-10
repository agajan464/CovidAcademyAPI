package sdaproject.covidacademyapi.single_state_specific_date.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import sdaproject.covidacademyapi.single_state_specific_date.service.NoStateFoundException;

@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(value = NoStateFoundException.class)
    public ResponseEntity<Object> exception(NoStateFoundException exception) {
        return new ResponseEntity<>("No state found", HttpStatus.NOT_FOUND);
    }
}
