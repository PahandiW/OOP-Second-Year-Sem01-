package uk.ac.westminster.Tutorial01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/hello")
        public String home(){
        return "<h1>Hello</h1>";

    @GetMapping("/test/{username}")
            public String test(@PathVariable("username"))

    @GetMapping("/hello")
    }
}
