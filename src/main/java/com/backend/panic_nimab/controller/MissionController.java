package com.backend.panic_nimab.controller;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.model.Mission;
import com.backend.panic_nimab.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path="/missionApi")
public class MissionController
{
    @Autowired
    private MissionService missionService;

    @PostMapping(path = "/ajouterMission")
    public @ResponseBody Mission ajouterMission(@RequestBody Mission mission)
    {
        return this.missionService.ajouterMission(mission);
    }

    @GetMapping(path = "/listerMission")
    public @ResponseBody Iterable<Mission> listerMissions()
    {
        return this.missionService.listerMissions();
    }

    @PostMapping(path = "/modifierMission")
    public @ResponseBody Mission ajouterEquipementMission(@RequestParam Mission mission, @RequestParam Set<Equipement> equipementSet)
    {
        return this.missionService.modifierMission(mission,equipementSet);
    }

    @GetMapping(path = "/getLastMission")
    public @ResponseBody Mission getLastMission()
    {
        return this.missionService.getLastMission();
    }
}
