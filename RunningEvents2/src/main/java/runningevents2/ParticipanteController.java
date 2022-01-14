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
class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;
    
    @RequestMapping("/participantes/{evento}")
    public List<Participante> getParticipantesByEvento(@PathVariable String evento){
        return participanteService.getParticipantesByEvento(evento);
    }
    @RequestMapping(method=RequestMethod.POST, value = "/participantes")
    public void inscreverParticipante(@RequestBody Participante participante) {
        participanteService.inscreverParticipante(participante);
    }
    
    
}
