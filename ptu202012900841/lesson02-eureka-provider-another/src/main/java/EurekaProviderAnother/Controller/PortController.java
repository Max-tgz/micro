package EurekaProviderAnother.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/port")
    public String getPort() {return "你好，我是服务提供者，我的端口是："+port;}
    @RequestMapping("/student")
    String student(String id) { return "你好，你访问的学号是： "+ id +",服务端口是：" +port;}

}
