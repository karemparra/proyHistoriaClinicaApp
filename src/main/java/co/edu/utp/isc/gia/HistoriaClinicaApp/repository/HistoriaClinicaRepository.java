package co.edu.utp.isc.gia.HistoriaClinicaApp.repository;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.HistoriaClinicaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HistoriaClinicaRepository extends CrudRepository<HistoriaClinicaEntity, Long> {
    //public Optional<HistoriaClinicaEntity> findByIdPaciente(Long id);
}
