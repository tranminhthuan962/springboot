package lam.tum.lum.spring.boot.controller;

import lam.tum.lum.spring.boot.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseRestContrroller {
    @RequestMapping("/course")
    public List<Course> printList() {
        return Arrays.asList(
                new Course(1, "Java course", "Minh Thuan"),
                new Course(2, "HTML course", "Thao Vi"),
                new Course(3, "JS course", "Minh Thuan"),
                new Course(4, "C# course", "Thao Vi")

        );
    }
}
