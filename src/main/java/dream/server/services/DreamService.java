package dream.server.services;

import dream.server.dto.DreamDto;
import dream.server.repositories.DreamRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class DreamService {
    private final DreamRepository dreamRepository;

    public DreamService(DreamRepository dreamRepository) {
        this.dreamRepository = dreamRepository;
    }

    public List<DreamDto> getAllDreams() {
        return dreamRepository.findAll().stream().map(dream -> new DreamDto(dream.getTitle(), dream.getDescription())).toList();
    }
}
