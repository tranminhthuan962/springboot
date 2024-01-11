package lam.tum.lum.spring.boot.controller;

import lam.tum.lum.spring.boot.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("course.api.com/v1")
@RestController
public class CourseRestContrroller {
    @GetMapping("/courses")
    public List<Course> printList() {
        return Arrays.asList(
                new Course(1, "Java course", "Minh Thuan"),
                new Course(2, "HTML course", "Thao Vi"),
                new Course(3, "JS course", "Minh Thuan"),
                new Course(4, "C# course", "Thao Vi")
        );
    }

    @GetMapping("/homes")
    public String printMessage() {
        StringBuilder sb = new StringBuilder();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first HTML</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first page");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
}
