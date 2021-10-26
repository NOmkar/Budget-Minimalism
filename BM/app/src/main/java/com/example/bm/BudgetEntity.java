package com.example.bm;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "budget_table")
public class BudgetEntity {

    @NonNull
    @PrimaryKey(autoGenerate = false)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @ColumnInfo(name = "BudgetEntity")
    private double amount;
    private String date;

    // Default constructor
    public BudgetEntity() {
        this.email = "NULL";
        this.amount = 0.0;
        this.date = "NULL";
    }

    public BudgetEntity(@NonNull String email, double amount, String date) {
        this.email = email;
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
