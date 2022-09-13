

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {

    @RequestMapping("")
    public String hello() {
        return "Hello Java World!";
    }

    @RequestMapping("/world")
    public String world() {return "This is the world route";}
}

