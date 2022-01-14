package runningevents2;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="participante")
class Participante {

  private @Id @GeneratedValue Long dorsal;
  private String nome;
  private String genero;
  private String escalao;
  private String evento;
    
    //default constructor
    public Participante(){}
    
    //constructor using fields
    public Participante(String nome, String genero, String escalao, String evento) 
    {
    super();
    this.dorsal = dorsal;
    this.nome = nome;
    this.genero = genero;
    this.evento = evento;
    }
    //getters and setters
    public Long getDorsal() 
    {
        return dorsal;
    }
    public void setDorsal(Long dorsal) 
    {
        this.dorsal = dorsal;
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public String getGenero() 
    {
        return genero;
    }
    public void setGenero(String genero) 
    {
        this.genero = genero;
    }
    
    public String getEscalao() 
    {
        return escalao;
    }
    public void setEscalao(String escalao) 
    {
        this.escalao = escalao;
    }
    
    public String getEvento() 
    {
        return evento;
    }
    public void setEvento(String evento) 
    {
        this.evento = evento;
    }
}