package runningevents2;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evento")
class Evento {

  private @Id @GeneratedValue Long id;
  private String nome;
  private String data;
    
    //default constructor
    public Evento(){}
    
    //constructor using fields
    public Evento(String nome, String data) 
    {
    super();
    this.id = id;
    this.nome = nome;
    this.data = data;
    }
    //getters and setters
    public Long getId() 
    {
        return id;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }
    public String getNome() 
    {
        return nome;
    }
    public void set(String nome) 
    {
        this.nome = nome;
    }
    public String getData() 
    {
        return data;
    }
    public void setData(String data) 
    {
        this.data = data;
    }
}