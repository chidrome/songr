package com.chidrome1.lab11.Songr;

import com.chidrome1.lab11.Songr.Controllers.HelloWorldController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
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

    @Autowired
    HelloWorldController helloWorldController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testControllerIsAutowired() {
        assertNotNull(helloWorldController);
    }

    @Test
    public void testRequestToRootGivesHelloWorld() throws Exception {
        mockMvc.perform(get("/")).andExpect(content().string(containsString("Hello, world! It's a beautiful day!")));
    }
}