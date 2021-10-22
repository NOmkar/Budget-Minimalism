package com.example.bm;


import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


// Mitchell
// This is an "Entity" for user input in the SQLite database
@Entity(tableName = "transaction_table")
public class transactionEntity {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "transactionEntity")
    private String description;
    //@ColumnInfo(name = "amount")
    //private String amount;

    // Default constructor
    public transactionEntity() {
        this.description = "NULL";
       //this.amount = "NULL";
    }

    // Parameterized constructor
    public transactionEntity(@NonNull String passedDescription) {
        this.description = passedDescription;
    }

    // Mitchell
    public void setDescription(@NonNull String passedDescription){
        this.description = passedDescription;
    }

    // Mitchell
    @NonNull
    public String getDescription() {
        return this.description;
    }

    // To make sure system doesn't encounter a numbers or any other meaningless values
    public int verifyDescriptionDetails (String description) {
        int x;
        // Verifying that this is a string
        try {
            x = Integer.parseInt(description);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    // To make sure system doesn't encounter a NULL pointer exception
    public boolean isDescriptionNull() {
        if (this.description == null) {
            return true;
        }
        return false;
    }

    // To make sure system doesn't encounter an empty string
    public boolean isDescriptionEmpty() {
        if (this.description.equals("")) {
            return true;
        }
        return false;
    }

    /* Uncomment after learning more about columns
    public void setAmount(@NonNull String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return this.transactionEntity;
    }
    */
}