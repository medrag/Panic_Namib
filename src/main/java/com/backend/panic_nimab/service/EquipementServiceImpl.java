package com.backend.panic_nimab.service;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipementServiceImpl implements EquipementService {

    @Autowired
    EquipementRepository equipementRepository;
    @Override
    public Iterable<Equipement> listerEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
}
