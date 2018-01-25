package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/index")
@RestController
public class HelloController {
    @RequestMapping("/me")
    public String index(){
        return "(HelloController)this is me!";
    }
    @RequestMapping("/you")
    public String user(){
        return "(HelloController)this is you!";
    }
}
