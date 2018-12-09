package com.backend.panic_nimab.service;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.model.Mission;
import com.backend.panic_nimab.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Set;

@Service
public class MissionServiceImpl implements MissionService
{
    @Autowired
    private MissionRepository missionRepository;

    @Override
    public Iterable<Mission> listerMissions()
    {
        return this.missionRepository.findAll();
    }

    @Override
    public Mission ajouterMission(Mission mission)
    {
        return this.missionRepository.save(mission);
    }

    @Override
    public Mission modifierMission(Mission mission, Equipement[] equipements)
    {
        mission.setEquipementSet(Arrays.asList(equipements));
        return this.missionRepository.save(mission);
    }

    @Override
    public Mission findLastMission()
    {
        return this.missionRepository.findLastMission();
    }

}
