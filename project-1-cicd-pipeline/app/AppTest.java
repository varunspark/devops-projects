package com.devops.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello from DevOps Pipeline!", App.greet());
    }
}
