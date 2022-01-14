package runningevents2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParticipanteService {
    
    @Autowired
    private ParticipanteRepository repository;
    
    public List<Participante> getParticipantesByEvento(String evento){
        List<Participante> participantes = new ArrayList<>();
        repository.findByEvento(evento).forEach(participantes::add);
        return participantes;
    }

    public void inscreverParticipante(Participante participante) {
        repository.save(participante);
    }
}