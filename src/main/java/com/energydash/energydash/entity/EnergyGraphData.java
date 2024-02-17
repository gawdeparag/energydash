package com.energydash.energydash.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "energy_graph_data")
public class EnergyGraphData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataId;

    @ManyToOne
    @JoinColumn(name = "stat_id", nullable = false)
    private EnergyStatistics energyStatistics;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private BigDecimal energyConsumed;

    @Column(nullable = false)
    private BigDecimal energyGenerated;

    // Other relevant graph data with appropriate annotations

    // Getters and setters
}