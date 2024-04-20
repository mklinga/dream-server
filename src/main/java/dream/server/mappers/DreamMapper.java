package dream.server.mappers;

import dream.server.dto.DreamDto;
import dream.server.entities.Dream;
import org.mapstruct.Mapper;

@Mapper
public interface DreamMapper {
    DreamDto dreamToDreamDto(Dream dream);
}
