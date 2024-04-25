package dream.server.mappers;

import dream.server.dto.DreamDto;
import dream.server.entities.Dream;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DreamMapper {
    DreamDto dreamToDreamDto(Dream dream);

    @Mapping(target = "deleted", ignore = true)
    Dream dreamDtoToDream(DreamDto dream);
}
