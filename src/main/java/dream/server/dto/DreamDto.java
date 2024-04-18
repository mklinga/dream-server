package dream.server.dto;

import dream.server.entities.Dream;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record DreamDto(String title, String description) {
    public static DreamDto fromDreamEntity(Dream entity) {
        return new DreamDto(entity.getTitle(), entity.getDescription());
    }
}
