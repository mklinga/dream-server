package dream.server.repositories;

import dream.server.entities.Dream;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface DreamRepository extends CrudRepository<Dream, Long> {
}
