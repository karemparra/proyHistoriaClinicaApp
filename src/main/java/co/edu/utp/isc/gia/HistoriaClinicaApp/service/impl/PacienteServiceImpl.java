package co.edu.utp.isc.gia.HistoriaClinicaApp.service.impl;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.PacienteDTO;
import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.PacienteEntity;
import co.edu.utp.isc.gia.HistoriaClinicaApp.repository.PacienteRepository;
import co.edu.utp.isc.gia.HistoriaClinicaApp.service.PacienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PacienteDTO buscarPaciente(Long cedula) {
        Optional<PacienteEntity> optionalPacienteEntity = pacienteRepository.findByCedula(cedula);
        if (optionalPacienteEntity.isPresent()){
            PacienteDTO pacienteDTO = modelMapper.map(optionalPacienteEntity.get(), PacienteDTO.class);
            return pacienteDTO;
        } else {
            return null;
        }
    }

    @Override
    public PacienteDTO crearPaciente(PacienteDTO pacienteDTO) {
        Optional<PacienteEntity> optionalPacienteEntity = pacienteRepository.findByCedula(pacienteDTO.getCedula());
        if(!pacienteDTO.equals(null) && pacienteDTO != null && !optionalPacienteEntity.isPresent()){
            PacienteEntity pacienteEntity = modelMapper.map(pacienteDTO, PacienteEntity.class);
            PacienteEntity pacienteEntityDB = pacienteRepository.save(pacienteEntity);
            return modelMapper.map(pacienteEntityDB, PacienteDTO.class);
        } else {
            return null;
        }
    }
}


/* POST PACIENTE
{
        "cedula": 7562461,
        "nombre": "Nestor",
        "apellido": "Parra",
        "email": "nestor.parra@gmail.com",
        "telefono": "3108636166",
        "direccion": "Senderos de la pradera",
        "fechaNacimiento": "1971-06-03",
        "enfermedades": "rodilla, azucar alta",
        "tipoSangre": "O+",
        "eps": "Sura"
}
*/
