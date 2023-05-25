package com.example.milestone.api.transaction.jpa.entity;

import com.example.milestone.api.tag.jpa.entity.TagEntity;
import com.example.milestone.base.jpa.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "transaction_tag")
public class TransactionTagEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionTagId;

    @ManyToOne(targetEntity = TransactionEntity.class)
    @JoinColumn(name = "transaction_id")
    private TransactionEntity transaction;

    @ManyToOne(targetEntity = TagEntity.class)
    @JoinColumn(name = "tag_id")
    private TagEntity tag;
}
