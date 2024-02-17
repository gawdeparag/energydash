package com.energydash.energydash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energydash.energydash.entity.EnergyGraphData;
import com.energydash.energydash.entity.EnergyStatistics;

import com.energydash.energydash.repository.EnergyStatisticsRepository;
import com.energydash.energydash.repository.EnergyGraphDataRepository;


@Service
public class DashboardService {

    @Autowired
    private EnergyStatisticsRepository energyStatisticsRepository;

    @Autowired
    private EnergyGraphDataRepository energyGraphDataRepository;

    public List<EnergyStatistics> getEnergyStatisticsForUser(Long userId) {
        return energyStatisticsRepository.findByUserId(userId);
    }

    public List<EnergyGraphData> getEnergyGraphData(Long statId) {
        return energyGraphDataRepository.findByStatId(statId);
    }

    // Other methods for dashboard-related operations

    // Add methods for adding energy statistics, energy graph data, etc.
    public EnergyStatistics addEnergyStatistics(EnergyStatistics energyStatistics) {
        return energyStatisticsRepository.save(energyStatistics);
    }

    public EnergyGraphData addEnergyGraphData(EnergyGraphData energyGraphData) {
        return energyGraphDataRepository.save(energyGraphData);
    }

    // Methods for deleting energy statistics, energy graph data, etc.
    public void deleteEnergyStatistics(Long statId) {
        energyStatisticsRepository.deleteById(statId);
    }

    public void deleteEnergyGraphData(Long dataId) {
        energyGraphDataRepository.deleteById(dataId);
    }
    

}