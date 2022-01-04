package co.edu.utp.isc.gia.HistoriaClinicaApp.service;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.UsuarioDTO;

public interface UsuarioService {
    UsuarioDTO verificarUsuario(Long cedula, String contraseña);
    UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO);
}
