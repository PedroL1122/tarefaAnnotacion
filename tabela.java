import javax.persistence.*;

   
  @Entity
  @Table(name="annotacion")
  public class tabela {
   
  private Integer codigo;
  public String nome;
   
public tabela(Integer codigo, String nome){
  this.codigo = codigo;
  this.nome = nome;
}


  }
