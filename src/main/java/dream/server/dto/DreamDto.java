package dream.server.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record DreamDto(String title, String description) {}