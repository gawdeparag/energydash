package com.energydash.energydash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.energydash.energydash.entity.EnergyGraphData;

@Repository
public interface EnergyGraphDataRepository extends JpaRepository<EnergyGraphData, Long> {
    List<EnergyGraphData> findByStatId(Long statId);
    // Other custom query methods can be added here
}