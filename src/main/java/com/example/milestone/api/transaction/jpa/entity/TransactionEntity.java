package com.example.milestone.api.transaction.jpa.entity;

import com.example.milestone.api.transaction.enums.TransactionType;
import com.example.milestone.api.transaction.jpa.converter.TransactionTypeConverter;
import com.example.milestone.base.jpa.BaseTimeEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "transaction")
public class TransactionEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Convert(converter = TransactionTypeConverter.class)
    @Column(name = "transaction_type")
    private TransactionType transactionType;

    @Column(name = "amount")
    private int amount;

    @Column(name = "description")
    private String description;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;

    @OneToMany(mappedBy = "transaction", fetch = FetchType.EAGER)
    private List<TransactionTagEntity> transactionTags;
}
