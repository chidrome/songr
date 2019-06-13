package com.chidrome1.lab11.Songr;

import com.chidrome1.lab11.Songr.Controllers.HelloWorldController;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void getHelloWorld() {
        // test hell world route
        HelloWorldController testController = new HelloWorldController();
        assertEquals("You should get Hello World",
                "Hello World",
                testController.getHelloWorld());
    }

    @Test
    public void getCapitalizedString() {
        HelloWorldController testController = new HelloWorldController();
        assertEquals("You should get Hello World capitalized",
                "HELLO WORLD",
                testController.getCapitalizedString("hello world"));
    }

    @Test
    public void getReverseParam() {
        HelloWorldController testController = new HelloWorldController();
        assertEquals("You should get Hello World backwards",
                "World Hello",
                testController.getReverseParam("Hello World"));
    }
}