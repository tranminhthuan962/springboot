package lam.tum.lum.spring.boot.controller;

import lam.tum.lum.spring.boot.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseRestContrroller {
    @GetMapping("/course")
    public List<Course> printList() {
        return Arrays.asList(
                new Course(1, "Java course", "Minh Thuan"),
                new Course(2, "HTML course", "Thao Vi"),
                new Course(3, "JS course", "Minh Thuan"),
                new Course(4, "C# course", "Thao Vi")

        );
    }

    @GetMapping("/printMessage")
    @ResponseBody
    public String printMessage() {

        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first HTML</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My body");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
}
