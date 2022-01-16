package runningevents2;

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
class EventoController {

    @Autowired
    private EventoService eventoService;
    
    @RequestMapping("/eventos/{data}")
    public List<Evento> getEventosByData(@PathVariable String data){
        return eventoService.getEventosByData(data);
    }
    
    @RequestMapping(method=RequestMethod.POST, value = "/eventos")
    public void createEvento(@RequestBody Evento evento) {
        eventoService.createEvento(evento);
    }
    
    
}