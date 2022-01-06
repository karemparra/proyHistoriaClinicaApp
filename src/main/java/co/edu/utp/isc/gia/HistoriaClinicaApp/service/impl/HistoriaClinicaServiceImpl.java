package co.edu.utp.isc.gia.HistoriaClinicaApp.service.impl;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.HistoriaClinicaEntity;
import co.edu.utp.isc.gia.HistoriaClinicaApp.repository.HistoriaClinicaRepository;
import co.edu.utp.isc.gia.HistoriaClinicaApp.service.HistoriaClinicaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoriaClinicaServiceImpl implements HistoriaClinicaService {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<HistoriaClinicaDTO> obtenerHistoriaClinica(Long id) {
        //ListOptional<HistoriaClinicaEntity> historiaClinicaEntities = historiaClinicaRepository.findById_paciente(id);

        return null;
    }

    @Override
    public HistoriaClinicaDTO crearHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO) {
        if(!historiaClinicaDTO.equals(null) && historiaClinicaDTO != null){
            HistoriaClinicaEntity historiaClinicaEntity = modelMapper.map(historiaClinicaDTO, HistoriaClinicaEntity.class);
            HistoriaClinicaEntity historiaClinicaEntityDB = historiaClinicaRepository.save(historiaClinicaEntity);
            return modelMapper.map(historiaClinicaEntityDB, HistoriaClinicaDTO.class);
        } else {
            return null;
        }

    }
}


/* POST historia Clinica

{
    "altura": "165",
    "peso": "70",
    "medicamentosAct": "Dipirona, amoxicilina",
    "sintomatologia": "Dolor de cabeza, malestar, fiebre",
    "tratamiento": "Reposo, medicamentos, examenes",
    "medicamentosRecetados": "Acetaminofen",
    "comentarios": "Tomar 1 pasta cada 8 horas",
    "fechaAtencion": "2021-08-02",
    "paciente": {
        "id": 30,
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
}


{
    "altura": "160",
    "peso": "60",
    "medicamentosAct": "riboxaban",
    "sintomatologia": "alergia",
    "tratamiento": "Reposo, medicamentos",
    "medicamentosRecetados": "loratadina",
    "comentarios": "Tomar 1 pasta cada 12 horas",
    "fechaAtencion": "2021-11-05",
    "paciente": {
        "id": 32,
        "cedula": 41921790,
        "nombre": "Yaneth",
        "apellido": "Moreno",
        "email": "yaneth@gmail.com",
        "telefono": "3104321234",
        "direccion": "vía jardines, #35-15",
        "fechaNacimiento": "1970-11-20",
        "enfermedades": "presión alta, migraña cronica",
        "tipoSangre": "B+",
        "eps": "Sura"
    }
}
* */
