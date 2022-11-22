package pe.unjfsc.daw.choclotv.choclotv.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Table para almacenar todos los tipos de calidad de video existente para las peliculas disponibles en ChoclitoTV.
@Entity
@Table(name = "calidad_video")
public class CalidadVideo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 3)
    // Ejm: HD, SD, 4K, FHD
    private String calidad;

    @Size(min = 2, max = 150)
    private String descripcion;

    @OneToMany(mappedBy = "calidadVideo", orphanRemoval = true, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Titulo> titulosDisponibles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Titulo> getTitulos() {
        return titulosDisponibles;
    }

    public void setTitulosDisponibles(Titulo titulo) {
        this.titulosDisponibles.add(titulo);
    }

}
