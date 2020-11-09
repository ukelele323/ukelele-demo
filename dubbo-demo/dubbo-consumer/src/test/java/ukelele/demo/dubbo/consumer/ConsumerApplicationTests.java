package ukelele.demo.dubbo.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ukelele.demo.dubbo.api.DubboService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class ConsumerApplicationTests {

    @Reference(version = "1.0.0")
    private DubboService dubboService;

    @Test
    public void dubboTest() {
        System.out.println(dubboService.sayHello());
    }

}