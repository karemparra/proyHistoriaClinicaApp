package co.edu.utp.isc.gia.HistoriaClinicaApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO implements Serializable {
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
