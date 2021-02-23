package com.example.Vacunas.controller;
import com.example.Vacunas.model.Vacuna;
import com.example.Vacunas.service.VacunasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController

@RequestMapping("/vacunas")
public class VacunasController {
    @Autowired
    VacunasService vacunaService;

    @GetMapping("")
    public List<Vacuna> list() {
        return vacunaService.listAllVacuna();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vacuna> get(@PathVariable Integer id) {
        try {
            Vacuna vacuna = vacunaService.getVacuna(id);
            return new ResponseEntity<Vacuna>(vacuna, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Vacuna>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/insertar")
    public void add(@RequestBody Vacuna vacuna) {
    	vacunaService.saveVacuna(vacuna);
    }
    
  
    @PutMapping("/modificar/{id}")
    public ResponseEntity<?> update(@RequestBody Vacuna vacuna, @PathVariable Integer id) {
        try {
            Vacuna existVacuna = vacunaService.getVacuna(id);
            vacuna.setId(id);
            vacunaService.saveVacuna(vacuna);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

    @DeleteMapping("/borrar/{id}")
    public void delete(@PathVariable Integer id) {
    	
    	vacunaService.deleteVacuna(id);
    }

    

    @GetMapping("/pornombre/{nombre}")
    public List<Vacuna> getFirstName (@PathVariable String nombre)
    {
    	return vacunaService.getNombre(nombre);
     
    }

    
    
    
}
