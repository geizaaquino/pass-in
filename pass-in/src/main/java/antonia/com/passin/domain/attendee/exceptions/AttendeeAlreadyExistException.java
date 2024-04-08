package antonia.com.passin.domain.attendee.exceptions;

import antonia.com.passin.domain.attendee.Attendee;

public class AttendeeAlreadyExistException extends RuntimeException{
    public AttendeeAlreadyExistException(String message){
        super(message);

    }
}
