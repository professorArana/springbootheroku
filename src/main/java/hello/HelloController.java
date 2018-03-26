package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/apiproxy/kittens")
    public String apione() {
        return "TODO: enter result from API 1!";
    }
    @RequestMapping("/apiproxy/anime")
    public String apitwo() {
        return "TODO: enter result from API 2!";
    }
}
