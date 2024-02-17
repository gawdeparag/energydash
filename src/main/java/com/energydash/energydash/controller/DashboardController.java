package com.energydash.energydash.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.energydash.energydash.service.*;
import com.energydash.energydash.entity.*;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/energyStatistics/{userId}")
    public ResponseEntity<List<EnergyStatistics>> getEnergyStatisticsForUser(@PathVariable Long userId) {
        List<EnergyStatistics> energyStatistics = dashboardService.getEnergyStatisticsForUser(userId);
        return new ResponseEntity<>(energyStatistics, HttpStatus.OK);
    }

    @GetMapping("/energyGraphData/{statId}")
    public ResponseEntity<List<EnergyGraphData>> getEnergyGraphData(@PathVariable Long statId) {
        List<EnergyGraphData> energyGraphData = dashboardService.getEnergyGraphData(statId);
        return new ResponseEntity<>(energyGraphData, HttpStatus.OK);
    }

    // Other endpoints for dashboard-related operations.

    // Add methods for adding energy statistics, energy graph data, etc.
    @PostMapping("/energyStatistics")
    public ResponseEntity<EnergyStatistics> addEnergyStatistics(@RequestBody EnergyStatistics energyStatistics) {
        EnergyStatistics addedStatistics = dashboardService.addEnergyStatistics(energyStatistics);
        return new ResponseEntity<>(addedStatistics, HttpStatus.CREATED);
    }

    @PostMapping("/energyGraphData")
    public ResponseEntity<EnergyGraphData> addEnergyGraphData(@RequestBody EnergyGraphData energyGraphData) {
        EnergyGraphData addedGraphData = dashboardService.addEnergyGraphData(energyGraphData);
        return new ResponseEntity<>(addedGraphData, HttpStatus.CREATED);
    }

    // Add endpoints for deleting energy statistics, energy graph data, etc.
    @DeleteMapping("/energyStatistics/{statId}")
    public ResponseEntity<Void> deleteEnergyStatistics(@PathVariable Long statId) {
        dashboardService.deleteEnergyStatistics(statId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/energyGraphData/{dataId}")
    public ResponseEntity<Void> deleteEnergyGraphData(@PathVariable Long dataId) {
        dashboardService.deleteEnergyGraphData(dataId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}