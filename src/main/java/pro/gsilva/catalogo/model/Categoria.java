package pro.gsilva.catalogo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "TB_Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 32)
    private String nome;
    
    
    public void setNome(String nome){
        this.nome=  nome;
   }

   public String getNome(){
       return this.nome;
   }

   public Long getId(){
       return this.id;
   }

   public void setId(Long id){
        this.id=  id;
   }
}
