package dream.server.services;

import dream.server.dto.DreamDto;
import dream.server.repositories.DreamRepository;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class DreamService {
    private final DreamRepository dreamRepository;

    public DreamService(DreamRepository dreamRepository) {
        this.dreamRepository = dreamRepository;
    }

    public List<DreamDto> getAllDreams() {
        return dreamRepository.findAll().stream().map(DreamDto::fromDreamEntity).toList();
    }

    public Optional<DreamDto> findDreamById(Long id) {
        return dreamRepository.findById(id).map(DreamDto::fromDreamEntity);
    }
}
