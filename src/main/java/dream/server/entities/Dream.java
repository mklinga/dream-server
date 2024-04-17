package dream.server.entities;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedEntity(value = "dreams")
public class Dream {
    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private Long id;

    private String title;

    private String description;

}
