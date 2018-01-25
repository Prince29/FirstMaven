package hello;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import java.net.URL;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)//这个端口号可以定义成固定值么
public class HelloControllerIT {
    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception{
        this.base=new URL("http://localhost:"+port+"/test/index/test");//注意application.properties配置文件里的相关配置
        System.out.println("base:"+this.base.toString());
    }

    @Test
    public void getHello() throws Exception{
        ResponseEntity<String> response=template.getForEntity(base.toString(),
                String.class);
        System.out.println("response:"+response.getBody());
        assertThat(response.getBody(),equalTo("(HelloController)this is test!"));
    }
}
