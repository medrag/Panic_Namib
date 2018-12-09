package com.backend.panic_nimab.service;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.model.Mission;


public interface MissionService
{
    Iterable<Mission> listerMissions();
    Mission ajouterMission(Mission mission);
    Mission modifierMission(Mission mission, Equipement[] equipementSet);
    Mission findLastMission();
}
