package dream.server.controllers;

import dream.server.dto.Dream;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/dreams")
public class DreamController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public Dream index() {
        return new Dream("Test", "Test description");
    }
}
