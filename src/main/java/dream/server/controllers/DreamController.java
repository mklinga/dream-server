package dream.server.controllers;

import dream.server.dto.DreamDto;
import dream.server.services.DreamService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;

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

    @Get(produces = MediaType.APPLICATION_JSON, value = "/{id}")
    public DreamDto one(Long id) {
        return dreamService.findDreamById(id).orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Not found"));
    }

    @Post(produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public DreamDto create(@Body DreamDto dream) {
        return dreamService.createDream(dream);
    }

    @Delete(value = "/{id}")
    public HttpResponse<Void> delete(Long id) {
        dreamService.deleteDream(id);
        return HttpResponse.ok();
    }
}
