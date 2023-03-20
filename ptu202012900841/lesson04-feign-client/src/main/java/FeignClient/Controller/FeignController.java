package FeignClient.Controller;


import FeignClient.Service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;
    @RequestMapping("/hi")
    public String hi(){ return  feignService.sayHello();}
}
