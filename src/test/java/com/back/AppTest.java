package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    @DisplayName("1 + 2 == 3")
    void t1(){
        App app = new App();
        int rs = app.plus(1, 2);

        assertEquals(3, rs);
    }
}
