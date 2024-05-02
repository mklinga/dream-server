package dream.server.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;

@Serdeable
public record DreamDto(Long id, LocalDate date, String title, String draft, String description) {
}
