package co.edu.utp.isc.gia.HistoriaClinicaApp.dto;

import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.PacienteEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoriaClinicaDTO implements Serializable {
    private Long id;
    private Long altura;
    private Long peso;
    private String medicamentosAct;
    private String sintomatologia;
    private String tratamiento;
    private String medicamentosRecetados;
    private String comentarios;
    private Date fechaAtencion;
    private PacienteDTO paciente;
}
