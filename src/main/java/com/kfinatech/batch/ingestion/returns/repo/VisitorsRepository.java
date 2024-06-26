package com.kfinatech.batch.ingestion.returns.repo;

import com.kfinatech.batch.ingestion.returns.data.Visitors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorsRepository extends JpaRepository<Visitors, Long> {
}