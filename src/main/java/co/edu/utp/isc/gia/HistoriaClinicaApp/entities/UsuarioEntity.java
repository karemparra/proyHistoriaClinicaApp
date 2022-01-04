package co.edu.utp.isc.gia.HistoriaClinicaApp.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USUARIOS")

public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long cedula;
    private String nombre;
    private String apellido;
    private String email;
    private Long telefono;
    private String direccion;
    private Date fechaNacimiento;
    private String especialidad;
    private String contraseña;
}
