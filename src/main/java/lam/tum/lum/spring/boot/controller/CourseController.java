package lam.tum.lum.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
    @RequestMapping(value = "/printMessage", method = RequestMethod.GET)
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

    @RequestMapping("/jspPage")
    public String printWelcomeJSP() {
        return "sayHello";
    }
}
