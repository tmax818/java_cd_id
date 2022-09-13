package helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String hello(){
        return "index.jsp";
    }
    // you can be explicit about the request as well
    @RequestMapping(value="/greeting/hello", method= RequestMethod.GET)
    public String hello2(){
        return "Hello world! What route did you use to access me?";
    }
    @RequestMapping("/greeting/goodbye")
    public String world(){
        return "Goodbye world!";
    }
}