package com.backend.panic_nimab.service;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.model.Mission;
import com.backend.panic_nimab.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import sun.net.www.http.HttpClient;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

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
    public Mission modifierMission(Mission mission, Set<Equipement> equipements)
    {
        mission.setEquipementSet(equipements);
        return this.missionRepository.save(mission);
    }

}
