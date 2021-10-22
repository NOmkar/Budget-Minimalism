package com.example.bm;

import static org.junit.Assert.*;

import org.junit.Test;

public class transactionEntityTest {

    @Test
    public void setDescription() {
        transactionEntity teTest = new transactionEntity();
        teTest.setDescription("testing set transaction entity!");
        assertEquals("testing set transaction entity!", teTest.getDescription());
    }

    @Test
    public void getDescription() {
        transactionEntity teTest = new transactionEntity();
        teTest.setDescription("testing get transaction entity!");
        assertEquals("testing get transaction entity!", teTest.getDescription());
    }

    @Test
    public void paramConstructor() {
        transactionEntity teTest = new transactionEntity("testing parameterized constructor!");
        assertEquals("testing parameterized constructor!", teTest.getDescription());
    }

    @Test
    public void verifyDescriptionDetails() {
        transactionEntity teTest = new transactionEntity("testing");
        int teTestValue = teTest.verifyDescriptionDetails("Description Test");
        assertEquals(0, 0);
    }

    @Test
    public void isDescriptionNull() {
        transactionEntity teTest = new transactionEntity("testing!");
        boolean result = teTest.isDescriptionNull();
        assertEquals(false, result);
    }

    @Test
    public void isDescriptionEmpty() {
        transactionEntity teTest = new transactionEntity("");
        boolean result = teTest.isDescriptionEmpty();
        assertEquals(true, result);
    }
}