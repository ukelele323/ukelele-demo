package ukelele.demo.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import ukelele.demo.dubbo.api.DubboService;

/**
 * @author liyh
 * @version 1.0.0
 * @title
 * @description 服务提供测试
 * @date 2020/11/6 11:03
 */
@Service
public class DubboServiceImpl implements DubboService {


    /**
     * dubbo demo 服务提供测试
     *
     * @return String
     */
    public String sayHello() {
        return "Hello Dubbo Remote! I‘m Provider.";
    }

}
