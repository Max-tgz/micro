package FeignHystrixAnother.Controller;

import FeignHystrixAnother.Service.FeignHystrix1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHystrixController {
    @Autowired
    FeignHystrix1 feignHystrix1;
    @RequestMapping("/stu")
    public String student(String id){
        return feignHystrix1.stu(id);
    }
    @RequestMapping("/port")
    public String port()
    {
        return feignHystrix1.port();
    }
}
