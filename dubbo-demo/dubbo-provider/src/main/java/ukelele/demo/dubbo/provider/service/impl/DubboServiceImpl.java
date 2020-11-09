package ukelele.demo.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;
import ukelele.demo.dubbo.api.DubboService;

/**
 * @author liyh
 * @version 1.0.0
 * @title 服务端API实现类
 * @description 服务提供测试，自动配置的方式
 * @date 2020/11/6 11:03
 */
@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService {


    /**
     * dubbo demo 服务提供测试
     *
     * @return String
     */
    public String sayHello() {
        return "Hello! This is Auto Provider.";
    }

}
