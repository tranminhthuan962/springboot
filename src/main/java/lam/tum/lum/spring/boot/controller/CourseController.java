package lam.tum.lum.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/course.api.com/v1")
@Controller
public class CourseController {

    @RequestMapping("/jspPages/welcome")
    public String login() {
        return "sayHello";
    }

}
