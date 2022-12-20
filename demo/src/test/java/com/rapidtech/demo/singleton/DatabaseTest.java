package com.rapidtech.demo.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    @Test
    void singleton() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        Database database3 = Database.getInstance();

        Assertions.assertSame(database1,database2);
    }
}