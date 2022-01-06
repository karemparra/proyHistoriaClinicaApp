package co.edu.utp.isc.gia.HistoriaClinicaApp.controller;

import co.edu.utp.isc.gia.HistoriaClinicaApp.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.HistoriaClinicaApp.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("historiaClinica")
@CrossOrigin(origins = "http://localhost:4200")
public class HistoriaClinicaController {

    @Autowired
    private HistoriaClinicaService historiaCLinicaService;

    @GetMapping("obtenerHistoriaClinica")
    public List<HistoriaClinicaDTO> obtenerHistoriaClinica(@RequestParam Long id){
        return this.historiaCLinicaService.obtenerHistoriaClinica(id);
    }

    @PostMapping("crearHistoriaClinica")
    public HistoriaClinicaDTO crearHistoriaClinica(@RequestBody HistoriaClinicaDTO historiaClinicaDTO){
        return this.historiaCLinicaService.crearHistoriaClinica(historiaClinicaDTO);
    }
}
