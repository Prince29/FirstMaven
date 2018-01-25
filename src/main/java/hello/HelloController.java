package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/index")
@RestController
public class HelloController {
    @RequestMapping("/me")
    public String me(){
        return "(HelloController)this is me!";
    }
    @RequestMapping("/you")
    public String you(){
        return "(HelloController)this is you!";
    }
    @RequestMapping("/us")
    public String us(){
        return "(HelloController)this is us!";
    }
}
