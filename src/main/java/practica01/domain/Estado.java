package practica01.domain;

import java.io.Serializable;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")

public class Estado implements Serializable {

    private static final long seralVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    

    //Atributos
    private String estado_nom;
    private String capital;
    private int poblacion;
    private String costas;
    

    //Contructor
    public Estado(String estado_nom, String capital, int poblacion, String costas) {
        this.estado_nom = estado_nom;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

    public Estado() {
    }

}
