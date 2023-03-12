package com.example.milestone.api.transaction.jpa.repository;

import com.example.milestone.api.transaction.jpa.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}
