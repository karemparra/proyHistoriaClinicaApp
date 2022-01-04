package co.edu.utp.isc.gia.HistoriaClinicaApp.repository;

import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Long> {
    public Optional<UsuarioEntity> findByCedula(Long cedula);
}
