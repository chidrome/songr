package com.chidrome1.lab11.Songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Mark this as a controller so that SpringBoot knows to look at it
@RestController
public class HelloWorldController {
    // specify the route for this method
    @GetMapping("/")
    public String getHomeRoute() {
        return "Home Stub Route";
    }

    // hello route
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World";
    }

    // all caps route
    @GetMapping("/capitalize/{string}")
    public String getCapitalizedString(@PathVariable String string) {
        return string.toUpperCase();
    }

    // reverse param route
    @GetMapping("/reverse")
    public String getReverseParam(@RequestParam String sentence) {
        String[] splitSentence =  sentence.split(" ");

        StringBuilder reverse = new StringBuilder();
        for(int i = splitSentence.length - 1; i >= 0 ; i--)
        {
            reverse.append(splitSentence[i]);
            reverse.append(" ");
        }

        return reverse.toString().trim();
    }

}
