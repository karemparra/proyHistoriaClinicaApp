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
@Table(name = "HISTORIAS_CLINICAS")
public class HistoriaClinicaEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private Long altura;
    private Long peso;
    private String medicamentosAct;
    private String sintomatologia;
    private String tratamiento;
    private String medicamentosRecetados;
    private String comentarios;
    private Date fechaAtencion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_paciente")
    private PacienteEntity paciente;
}
