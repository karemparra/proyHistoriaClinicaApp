package co.edu.utp.isc.gia.HistoriaClinicaApp.repository;

import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.PacienteEntity;
import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PacienteRepository extends CrudRepository<PacienteEntity, Long> {
    public Optional<PacienteEntity> findByCedula(Long cedula);
}
