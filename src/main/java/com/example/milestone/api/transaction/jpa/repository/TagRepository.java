package com.example.milestone.api.transaction.jpa.repository;

import com.example.milestone.api.transaction.jpa.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Long> {
}
