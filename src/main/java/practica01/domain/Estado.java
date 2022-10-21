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
    private String nomEstado;
    private String capital;
    private int poblacion;
    private String costas;
    

    //Contructor
    public Estado(Long idEstado, String nomEstado, String capital, int poblacion, String costas) {
        this.idEstado = idEstado;
        this.nomEstado = nomEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

    public Estado() {
    }

}
