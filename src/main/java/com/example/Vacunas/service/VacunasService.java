package com.example.Vacunas.service;

import com.example.Vacunas.model.Vacuna;
import com.example.Vacunas.repository.VacunasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class VacunasService {
    @Autowired
    private VacunasRepository vacunaRepository;
    public List<Vacuna> listAllVacuna() {
        return vacunaRepository.findAll();
    }

    public void saveVacuna(Vacuna vacuna) {

    	vacunaRepository.save(vacuna);
    }

    public Vacuna getVacuna(Integer id) {
        return vacunaRepository.findById(id).get();
    }
   public List<Vacuna> getNombre(String nombre)
   {
     return vacunaRepository.Consulta_por_Nombre(nombre);
   }

    public void deleteVacuna(Integer id) {
    	vacunaRepository.deleteById(id);
    }
}
