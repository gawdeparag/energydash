package com.energydash.energydash.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "energy_statistics")
public class EnergyStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private BigDecimal energyGenerated;

    @Column(nullable = false)
    private BigDecimal energyConsumed;

    @Column(nullable = false)
    private BigDecimal exportableEnergy;

    // Other relevant statistics with appropriate annotations

    // Getters and setters
}