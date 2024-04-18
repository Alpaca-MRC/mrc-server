package com.alpaca.mrc.domain.record.repository;

import com.alpaca.mrc.domain.record.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
