package sn.sonatel.springjenkinscicd.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }
}
