package runningevents2;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface ParticipanteRepository extends CrudRepository<Participante, Long> {
    List<Participante> findByEvento(String evento);
}