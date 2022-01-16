package runningevents2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventoService {
    
    @Autowired
    private EventoRepository repository;
    
    public List<Evento> getEventosByData(String data){
        List<Evento> eventos = new ArrayList<>();
        repository.findByData(data).forEach(eventos::add);
        return eventos;
    }

    public void createEvento(Evento evento) {
        repository.save(evento);
    }
}
