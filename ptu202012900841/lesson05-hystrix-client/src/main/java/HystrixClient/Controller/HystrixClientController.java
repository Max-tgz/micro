package HystrixClient.Controller;

import HystrixClient.Service.HystrixClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixClientController {
    @Autowired
    HystrixClientService hystrixClientService;
    @RequestMapping("/stu")
    public String stu(String id)
    {
        return hystrixClientService.stu(id);
    }
}
