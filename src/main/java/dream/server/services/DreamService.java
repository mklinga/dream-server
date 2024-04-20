package dream.server.services;

import dream.server.dto.DreamDto;
import dream.server.mappers.DreamMapper;
import dream.server.repositories.DreamRepository;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class DreamService {
    private final DreamRepository dreamRepository;
    private final DreamMapper dreamMapper;

    public DreamService(DreamRepository dreamRepository, DreamMapper dreamMapper) {
        this.dreamRepository = dreamRepository;
        this.dreamMapper = dreamMapper;
    }

    public List<DreamDto> getAllDreams() {
        return dreamRepository.findAll().stream().map(dreamMapper::dreamToDreamDto).toList();
    }

    public Optional<DreamDto> findDreamById(Long id) {
        return dreamRepository.findById(id).map(dreamMapper::dreamToDreamDto);
    }
}
