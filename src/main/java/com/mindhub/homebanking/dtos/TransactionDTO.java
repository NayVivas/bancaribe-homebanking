package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.models.TransactionType;
import java.time.LocalDateTime;

public class TransactionDTO {

    private long id;
    private TransactionType type;
    private LocalDateTime creationDateTransaction;
    private double amount;
    private String description;

    public TransactionDTO() {
    }

    public TransactionDTO(Transaction transaction) {
        this.id = transaction.getId();
        this.type = transaction.getType();
        this.creationDateTransaction = transaction.getCreationDateTransaction();
        this.amount = transaction.getAmount();
        this.description = transaction.getDescription();
    }

    public long getId() {
        return id;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDateTime getCreationDateTransaction() {
        return creationDateTransaction;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
