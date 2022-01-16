package runningevents2;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.*;

@Entity
@Table(name="sensor")
class Sensor {

  private @Id @GeneratedValue Long chipId;
  private Timestamp start;
  private Timestamp p1;
  private Timestamp p2;
  private Timestamp p3;
  private Timestamp finish;
  private String evento;
  private int dorsal;
  
  
    
    //default constructor
    public Sensor(){}
    
    //constructor using fields
    public Sensor(Timestamp start, Timestamp p1, Timestamp p2, Timestamp p3, Timestamp finish, String evento, int dorsal) 
    {
    super();
    this.chipId = chipId;
    this.start = start;
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.finish = finish;
    this.evento = evento;
    this.dorsal = dorsal;
    }
    //getters and setters
    public Long getChipId() 
    {
        return chipId;
    }
    public void setChipId(Long chipId) 
    {
        this.chipId = chipId;
    }
    public Timestamp getStart() 
    {
        return start;
    }
    public void setStart(Timestamp start ) 
    {
        this.start = start;
    }
    public Timestamp getP1() 
    {
        return p1;
    }
    public void setP1(Timestamp p1) 
    {
        this.p1 = p1;
    }
    public Timestamp getP2() 
    {
        return p2;
    }
    public void setP2(Timestamp p2) 
    {
        this.p2 = p2;
    }
    public Timestamp getP3() 
    {
        return p3;
    }
    public void setP3(Timestamp p3) 
    {
        this.p3 = p3;
    }
    public Timestamp getFinish() 
    {
        return finish;
    }
    public void setFinish(Timestamp finish) 
    {
        this.finish = finish;
    }
    public String getEvento() 
    {
        return evento;
    }
    public void setEvento(String evento) 
    {
        this.evento = evento;
    }
    public int getDorsal() 
    {
        return dorsal;
    }
    public void setDorsal(int dorsal) 
    {
        this.dorsal = dorsal;
    }
}