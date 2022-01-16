package runningevents2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SensorService {
    
    @Autowired
    private SensorRepository repository;
    
    public List<Sensor> getSensorByEvento(String evento){
        List<Sensor> sensores = new ArrayList<>();
        repository.findByEvento(evento).forEach(sensores::add);
        return sensores;
    }

    public void createSensor(Sensor sensor) {
        repository.save(sensor);
    }
    
    public List<Sensor> getSensores(){
        List<Sensor> sensores = new ArrayList<>();
        repository.findAll().forEach(sensores::add);
        return sensores;
    }
}
