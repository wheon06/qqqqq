package com.wheon.dockercompleate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping()
    public String helloSpring() {
        return "Hello Spring";
    }

}
