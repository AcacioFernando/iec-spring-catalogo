package pro.gsilva.catalogo.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Table(name = "TB_MUSICA")
@Data
public class Musica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String autor;

    @NotBlank
    private String titulo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", locale = "UTC-03")
    private LocalDate data;

    @NotBlank
    @Lob
    private String letra;  
    
    public String getLetra(){
        return this.letra;
    }

    public void setLetra(String letra){
         this.letra=  letra;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
         this.titulo=  titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
         this.autor=  autor;
    }

    public LocalDate getData(){
        return this.data;
    }

    public void setData(LocalDate data){
         this.data=  data;
    }

    public Long getId(){
        return this.id;
    }

    public void setData(Long id){
         this.id=  id;
    }
}
