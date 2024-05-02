package dream.server.mappers;

import dream.server.dto.DreamDto;
import dream.server.entities.Dream;
import dream.server.utils.TextUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface DreamMapper {
    DreamDto dreamToDreamDto(Dream dream);

    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "description", source = "description", qualifiedByName = "normaliseDescriptionLineEndings")
    Dream dreamDtoToDream(DreamDto dream);

    /**
     * By default the HTML <textarea> component sends the input string using windows' \r\n line endings.
     * We don't want that kind of nonsense here.
     * @param description The description of the Dream
     * @return Normalised description of the Dream
     */
    @Named("normaliseDescriptionLineEndings")
    default String withUnixLineEndings(String description) {
        return TextUtils.normaliseLineEndings(description);
    }
}
