package co.edu.utp.isc.gia.HistoriaClinicaApp.service.impl;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.UsuarioDTO;
import co.edu.utp.isc.gia.HistoriaClinicaApp.entities.UsuarioEntity;
import co.edu.utp.isc.gia.HistoriaClinicaApp.repository.UsuarioRepository;
import co.edu.utp.isc.gia.HistoriaClinicaApp.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UsuarioDTO verificarUsuario(Long cedula, String contraseña){
        Optional<UsuarioEntity> optionalUsuarioEntity = this.usuarioRepository.findByCedula(cedula);
        if(optionalUsuarioEntity.isPresent()){
            UsuarioDTO usuarioDTO = modelMapper.map(optionalUsuarioEntity.get(), UsuarioDTO.class);
            if(usuarioDTO.getContraseña().equals(contraseña)){
                return usuarioDTO;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        Optional<UsuarioEntity> optionalUsuarioEntity = this.usuarioRepository.findByCedula(usuarioDTO.getCedula());
        if(!usuarioDTO.equals(null) && usuarioDTO != null && !optionalUsuarioEntity.isPresent()){
            UsuarioEntity usuarioEntity = modelMapper.map(usuarioDTO, UsuarioEntity.class);
            UsuarioEntity usuarioEntityDB = usuarioRepository.save(usuarioEntity);
            return modelMapper.map(usuarioEntityDB, UsuarioDTO.class);
        } else {
            return null;
        }
    }


}


/* POST USUARIO
{
        "cedula": 1088035490,
        "nombre": "Karem",
        "apellido": "Parra",
        "email": "karem.parra@gmail.com",
        "telefono": "3105283349",
        "direccion": "Senderos de la pradera",
        "fechaNacimiento": "1998-10-10",
        "especialidad": "Pediatría",
        "contraseña": "karemparra"
}*/
