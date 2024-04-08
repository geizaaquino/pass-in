package antonia.com.passin.dto.event;

public record EventDetailDTO(
        String id,
        String title,
        String slug,
        String eventSlug, Integer maximumAttendees,
        Integer attendeesAmount
) {
}
