package com.backend.panic_nimab.controller;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/equipementApi")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @GetMapping(path="/listerEquipements")
    private @ResponseBody Iterable<Equipement> lister(){
        return this.equipementService.listerEquipements();
    }

    @PostMapping(path = "/ajouterEquipement")
    public @ResponseBody Equipement ajouterMission(@RequestBody Equipement equipement)
    {
        return this.equipementService.ajouterEquipement(equipement);
    }
}
