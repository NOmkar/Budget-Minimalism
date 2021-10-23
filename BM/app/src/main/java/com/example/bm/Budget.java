package com.example.bm;

import android.widget.Toast;

import java.text.DecimalFormat;

// Class for setting the budget
public class Budget {
    private static DecimalFormat df = new DecimalFormat("0.00");
    double budgetValue;

    public Budget(double budgetValue) {
        this.budgetValue = budgetValue;
    }

    public double getBudgetValue() {
        return budgetValue;
    }

    public void setBudgetValue(double budgetValue) {
        this.budgetValue = budgetValue;
    }

    // Function to convert to string
    @Override
    public String toString() {
        return "$" + budgetValue;
    }

    // Function to check if budget is 0
    public boolean checkIfBudgetZero() {
        if(budgetValue == 0.00) {
            return true;
        }
        else return false;
    }

    // Function to check if budget is less than 0
    public boolean checkIfBudgetNegative() {
        if(budgetValue < 0) {
            return true;
        }
        else return false;
    }

    // Function to make sure 2 decimal places
    public double convertToTwoDecimals() {
        double budgetRounded = Math.round(budgetValue * 100.0)/100.0;
        return budgetRounded;
    }
}


