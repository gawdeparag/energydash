package com.energydash.energydash.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.energydash.energydash.entity.EnergyStatistics;

@Repository
public interface EnergyStatisticsRepository extends JpaRepository<EnergyStatistics, Long> {
	List<EnergyStatistics> findByUserId(Long userId);
    // Other custom query methods can be added here
}
