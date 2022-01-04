package co.edu.utp.isc.gia.HistoriaClinicaApp.controller;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.UsuarioDTO;
import co.edu.utp.isc.gia.HistoriaClinicaApp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("verificarUsuario")
    public UsuarioDTO verificarUsuario(@RequestParam Long cedula, @RequestParam String contraseña) {
        return usuarioService.verificarUsuario(cedula, contraseña);
    }

    @PostMapping("crearUsuario")
    public UsuarioDTO crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.crearUsuario(usuarioDTO);
    }

}
