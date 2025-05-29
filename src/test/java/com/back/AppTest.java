package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    @DisplayName("10 + 20 == 30")
    void t2(){
        App app = new App();
        int rs = app.plus(10, 20);

        assertEquals(30, rs);
    }
}
