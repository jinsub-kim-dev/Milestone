package com.example.milestone.api.transaction.jpa.entity;

import com.example.milestone.base.jpa.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "tag")
public class TagEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagId;

    @Column(name = "tag_name")
    private String tagName;
}
