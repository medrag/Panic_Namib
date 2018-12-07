package com.backend.panic_nimab.service;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.model.Mission;

import java.util.Set;

public interface MissionService
{
    Iterable<Mission> listerMissions();
    Mission ajouterMission(Mission mission);
    Mission modifierMission(Mission mission, Set<Equipement> equipementSet);
}
