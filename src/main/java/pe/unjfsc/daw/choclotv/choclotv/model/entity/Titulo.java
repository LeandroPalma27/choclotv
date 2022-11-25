package pe.unjfsc.daw.choclotv.choclotv.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "titulo")
public class Titulo {
    
    @Id
    @Column(name = "codigo", unique = true, nullable = false)
    @Size(max = 8, min = 8)
    private String codigo;

    @Size(max = 120)
    @Column(unique = true, nullable = false)
    private String nombre;

    @Min(value = 1899)
    private Integer anio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaRegistro;

    @ManyToOne(targetEntity = CalificacionMadurez.class)
    @JoinColumn(name = "calificacion_id", nullable = false, referencedColumnName="id", updatable = false)
    private CalificacionMadurez calificacionMadurez;

    @ManyToOne(targetEntity = CalidadVideo.class)
    @JoinColumn(name = "calidad_id", nullable = false, referencedColumnName="id", updatable = false)
    private CalidadVideo calidadVideo;

    @OneToMany(mappedBy = "titulo", orphanRemoval = true, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Trailer> trailersDisponibles;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "logo_id", referencedColumnName = "id")
    private Logo logo;

    @Size(min = 1, max = 500)
    private String descripcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public CalificacionMadurez getCalificacionMadurez() {
        return calificacionMadurez;
    }

    public void setCalificacionMadurez(CalificacionMadurez calificacionMadurez) {
        this.calificacionMadurez = calificacionMadurez;
    }

    public CalidadVideo getCalidadVideo() {
        return calidadVideo;
    }

    public void setCalidadVideo(CalidadVideo calidadVideo) {
        this.calidadVideo = calidadVideo;
    }

    public List<Trailer> getTrailersDisponibles() {
        return trailersDisponibles;
    }

    public void setTrailersDisponibles(Trailer trailer) {
        this.trailersDisponibles.add(trailer);
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
