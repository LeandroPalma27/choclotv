package pe.unjfsc.daw.choclotv.choclotv.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnore;

// Tabla para guardar todos los tipos de calificacion de madurez que tendran las peliculas o series dentro de ChoclitoTV
@Entity
@Table(name = "calificacion_madurez")
public class CalificacionMadurez {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Min(value = 0)
    // Si es 0, se contara como apto para todos:
    private Integer edadMinima;

    @Size(min = 2, max = 150)
    private String descripcion;

    @OneToMany(mappedBy = "calificacionMadurez", orphanRemoval = true, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Titulo> titulosDisponibles;

    @Size(min = 1, max = 3)
    private String clasificacion;

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Titulo> getTitulosDisponibles() {
        return titulosDisponibles;
    }

    public void setTitulosDisponibles(Titulo titulo) {
        this.titulosDisponibles.add(titulo);
    }

}
