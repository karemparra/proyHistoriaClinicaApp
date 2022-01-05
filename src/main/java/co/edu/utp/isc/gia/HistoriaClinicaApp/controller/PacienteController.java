package co.edu.utp.isc.gia.HistoriaClinicaApp.controller;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.PacienteDTO;
import co.edu.utp.isc.gia.HistoriaClinicaApp.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("paciente")
@CrossOrigin(origins = "http://localhost:4200")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("buscarPaciente")
    public PacienteDTO buscarPaciente(@RequestParam Long cedula){
        return pacienteService.buscarPaciente(cedula);
    }

    @PostMapping("crearPaciente")
    public PacienteDTO crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        return pacienteService.crearPaciente(pacienteDTO);
    }
}
