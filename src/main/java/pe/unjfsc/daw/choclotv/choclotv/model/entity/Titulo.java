package pe.unjfsc.daw.choclotv.choclotv.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "titulo")
public class Titulo {
    
    @Id
    @Size(max = 8, min = 8)
    private String codigo;

    @Size(max = 120)
    private String nombre;

    @Min(value = 1899)
    private Integer año;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaRegistro;

    @ManyToOne(targetEntity = CalificacionMadurez.class)
    @JoinColumn(name = "calificacion_id", nullable = false, referencedColumnName="id", updatable = false)
    private CalificacionMadurez calificacionMadurez;

    @ManyToOne(targetEntity = CalidadVideo.class)
    @JoinColumn(name = "calidad_id", nullable = false, referencedColumnName="id", updatable = false)
    private CalidadVideo calidadVideo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
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

}
