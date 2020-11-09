package ukelele.demo.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukelele.demo.dubbo.api.DubboService;

/**
 * @author liyh
 * @version 1.0.0
 * @title
 * @description dubbo concusmer 消费测试controller
 * @date 2020/11/9 14:46
 */
@RestController
@RequestMapping("dubbo")
public class DubboController {

    @Reference(version = "1.0.0")
    private DubboService dubboService;

    @GetMapping("/hello")
    public String dubboTest() {
        return dubboService.sayHello();
    }

}
