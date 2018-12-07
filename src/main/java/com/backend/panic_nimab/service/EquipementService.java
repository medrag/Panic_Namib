package com.backend.panic_nimab.service;

import com.backend.panic_nimab.model.Equipement;

public interface EquipementService
{
    Iterable<Equipement> listerEquipements();
    Equipement ajouterEquipement(Equipement equipement);
}
