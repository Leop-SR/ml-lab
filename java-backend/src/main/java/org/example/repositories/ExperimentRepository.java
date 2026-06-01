package org.example.repositories;

import org.example.entities.Experiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperimentRepository
        extends JpaRepository<Experiment, Long> {

}