package antonia.com.passin.dto.event;

import antonia.com.passin.domain.event.Event;
import antonia.com.passin.dto.event.EventDetailDTO;
import lombok.Getter;

@Getter
public class EventResponseDTO {
    EventDetailDTO event;

    public EventResponseDTO (Event event, Integer numberOfAttendees) {
        this.event = new EventDetailDTO(event.getId(), event.getTitle(), event.getDetails(), event.getSlug(), event.getMaximumAttendees(), numberOfAttendees);

    }
}
