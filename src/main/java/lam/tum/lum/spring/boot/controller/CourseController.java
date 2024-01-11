package lam.tum.lum.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @GetMapping("/jspPage")
    public String printWelcomeJSP() {
        return "sayHello";
    }
}
