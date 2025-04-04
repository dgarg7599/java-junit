package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataBaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    public void setUp() throws Exception {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    public void tearDown(){
        db.disconnect();
    }

    @Test
    public void testConnectionIsEstablished() {
        Assertions.assertTrue(db.isConnected());
    }

    @Test
    void testConnectionIsClosed() {
        db.disconnect();
        Assertions.assertFalse(db.isConnected());
    }
}
