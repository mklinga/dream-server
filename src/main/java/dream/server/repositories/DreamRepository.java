package dream.server.repositories;

import dream.server.entities.Dream;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface DreamRepository extends CrudRepository<Dream, Long> {
    List<Dream> findAllByDeletedEquals(Boolean deleted);
}
