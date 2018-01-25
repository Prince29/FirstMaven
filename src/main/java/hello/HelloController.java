package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/index")//application.properties中有对应配置，这个不是根路径
@RestController
public class HelloController {
    @RequestMapping("/test")
    public String test(){//用于测试JUnit
        return "(HelloController)this is test!";
    }
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
