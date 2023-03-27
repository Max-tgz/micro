package Gateway.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
    @RequestMapping("")
    public String fallback()
    {
        return "所访问的服务异常，这是一条来自网关的消息";
    }
}
