package runningevents2;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

interface SensorRepository extends CrudRepository<Sensor, Long> {
    List<Sensor> findByEvento(String evento);
    
}
