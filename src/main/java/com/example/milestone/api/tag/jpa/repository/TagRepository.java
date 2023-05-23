package com.example.milestone.api.tag.jpa.repository;

import com.example.milestone.api.tag.jpa.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Long> {
}
