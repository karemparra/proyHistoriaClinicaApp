package co.edu.utp.isc.gia.HistoriaClinicaApp.service;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.PacienteDTO;

public interface PacienteService {
    PacienteDTO buscarPaciente(Long cedula);
    PacienteDTO crearPaciente(PacienteDTO pacienteDTO);
}
