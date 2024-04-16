package dream.server.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record Dream(String title, String description) {}