package com.backend.panic_nimab.controller;

import com.backend.panic_nimab.model.Equipement;
import com.backend.panic_nimab.model.Mission;
import com.backend.panic_nimab.service.MissionService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
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
    public @ResponseBody Mission ajouterEquipementMission(@RequestBody String requestBody) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(requestBody);
        Mission mission = objectMapper.convertValue(jsonNode.get("mission"), Mission.class);

        Equipement[] equipementSet = objectMapper.convertValue(jsonNode.get("equipements"), Equipement[].class);

        return this.missionService.modifierMission(mission,equipementSet);
    }

    @GetMapping(path="/lastMission")
    public @ResponseBody Mission findLastMission()
    {
        return this.missionService.findLastMission();
    }

}
