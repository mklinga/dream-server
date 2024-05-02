package dream.server.entities;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.ZonedDateTime;

@Setter
@Getter
@MappedEntity(value = "dreams")
public class Dream {
    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private Long id;

    private ZonedDateTime createdAt;
    private LocalDate date;

    private Boolean deleted;
    private String description;
    private String draft;
    private String title;
}
