package runningevents2;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface EventoRepository extends CrudRepository<Evento, Long> {
    List<Evento> findByData(String data);
}