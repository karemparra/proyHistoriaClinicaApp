package co.edu.utp.isc.gia.HistoriaClinicaApp.service;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.HistoriaClinicaDTO;

import java.util.List;

public interface HistoriaClinicaService {
    HistoriaClinicaDTO crearHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO);
    List<HistoriaClinicaDTO> obtenerHistoriaClinica(Long id);
}
