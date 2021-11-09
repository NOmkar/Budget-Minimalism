package com.example.bm;

import static org.junit.Assert.*;

import org.junit.Test;

import java.security.spec.ECField;
import java.util.concurrent.ExecutionException;

public class BudgetTest {

    Budget budget = new Budget(1000.00);
    double delta = 0.01;

    @Test
    public void getBudgetValue() throws Exception {
        try {
            assertEquals(1000.00, budget.getBudgetValue(), delta);
            System.out.println("getBudgetValue test successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: getBudgetValue test failure!");
        }

    }

    @Test
    public void setBudgetValue() throws Exception{
        budget.setBudgetValue(2000.00);

        try {
            assertEquals(2000.00, budget.getBudgetValue(), delta);
            System.out.println("setBudgetValue test successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: setBudgetValue test failure!");
        }

    }

    @Test
    public void toStringTest() throws Exception{
        try {
            assertEquals("$1000.0", budget.toString());
            System.out.println("toString test successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: toString test failure!");
        }

    }

    @Test
    public void checkIfBudgetZero() throws Exception{
        budget.setBudgetValue(0.00);
        try {
            assertEquals(true, budget.checkIfBudgetZero());
            System.out.println("checkIfBudgetZero test successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: checkIfBudgetZero test failure!");
        }
    }

    @Test
    public void checkIfBudgetNegative() throws Exception{
        budget.setBudgetValue(-300.00);
        try {
            assertEquals(true, budget.checkIfBudgetNegative());
            System.out.println("checkIfBudgetNegative test successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: checkIfBudgetNegative test failure!");
        }
    }

    @Test
    public void convertToTwoDecimals() throws Exception{
        budget.setBudgetValue(49500.3652);
        try {
            assertEquals(49500.37, budget.convertToTwoDecimals(), delta);
            System.out.println("convertToTwoDecimals test successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: convertToTwoDecimals test failure!");
        }
    }
}