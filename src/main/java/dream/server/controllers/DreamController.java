package dream.server.controllers;

import dream.server.dto.DreamDto;
import dream.server.services.DreamService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/dreams")
public class DreamController {

    private final DreamService dreamService;

    public DreamController(DreamService dreamService) {
        this.dreamService = dreamService;
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public List<DreamDto> index() {
        return dreamService.getAllDreams();
    }
}
