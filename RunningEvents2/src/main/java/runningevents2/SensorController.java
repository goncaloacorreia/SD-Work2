package runningevents2;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SensorController {

    @Autowired
    private SensorService sensorService;
    
    @RequestMapping(method=RequestMethod.POST, value = "/sensores")
    public void createSensor(@RequestBody Sensor sensores) {
        sensorService.createSensor(sensores);
    }
    
    @RequestMapping("/sensores/{evento}")
    public List<Sensor> getSensorByEvento(@PathVariable String evento){
        return sensorService.getSensorByEvento(evento);
    }
    
    @RequestMapping("/sensores")
    public List<Sensor> getSensores(){
        return sensorService.getSensores();
    }
    
    
}
