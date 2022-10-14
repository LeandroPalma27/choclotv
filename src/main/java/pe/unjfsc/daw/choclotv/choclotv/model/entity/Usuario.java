package pe.unjfsc.daw.choclotv.choclotv.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Usuario {
    
    @Id
    private Long id;

    private String nombres;

    private String apellidos;

    private String contraseña;

    private String correo;

    public Usuario () {}

}
