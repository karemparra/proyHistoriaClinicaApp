package co.edu.utp.isc.gia.HistoriaClinicaApp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PACIENTES")
public class PacienteEntity {
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
    private String enfermedades;
    private String tipoSangre;
    private String eps;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.MERGE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<HistoriaClinicaEntity> historiasClinicas;

}
