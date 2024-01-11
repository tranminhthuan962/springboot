package lam.tum.lum.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/course.api.com/v1")
@Controller
public class CourseController {

    @GetMapping("/jspPages")
    public String printWelcomeJSP() {
        return "sayHello";
    }
}
