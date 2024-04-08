package antonia.com.passin.config;

import antonia.com.passin.domain.attendee.exceptions.AttendeeAlreadyExistException;
import antonia.com.passin.domain.attendee.exceptions.AttendeeNotFoundException;
import antonia.com.passin.domain.checkin.exception.CheckInAlreadyExistsException;
import antonia.com.passin.domain.event.exceptions.EventFullException;
import antonia.com.passin.domain.event.exceptions.EventNotFoundException;
import antonia.com.passin.dto.general.ErroResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionEntityHandler {
    @ExceptionHandler(EventNotFoundException.class)
    public ResponseEntity handleEventNotFound(EventNotFoundException exception){
        return ResponseEntity.notFound().build();

    }
    @ExceptionHandler(EventFullException.class)
    public ResponseEntity handleEventNotFull(EventFullException exception){
        return ResponseEntity.badRequest().body(new ErroResponseDTO(exception.getMessage()));

    }
    @ExceptionHandler(AttendeeNotFoundException.class)
    public ResponseEntity<ErroResponseDTO> handleAttendeeNotFound(AttendeeNotFoundException exception){
        return ResponseEntity.notFound().build();

    }
    @ExceptionHandler(AttendeeAlreadyExistException.class)
    public ResponseEntity handleAttendeeAlreadyExist(AttendeeAlreadyExistException exception){
        return ResponseEntity.status(HttpStatus.CONFLICT).build();

    }
    @ExceptionHandler(CheckInAlreadyExistsException.class)
    public ResponseEntity handleCheckInAlreadyExist(CheckInAlreadyExistsException exception){
        return ResponseEntity.status(HttpStatus.CONFLICT).build();

    }
}
