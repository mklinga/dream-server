package dream.server.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record DreamDto(Long id, String title, String description) {
}
