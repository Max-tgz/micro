package FeignHystrix.Controller;

import FeignHystrix.Service.FeignHystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHystrixController {
    @Autowired
    FeignHystrix feignHystrix;
    @RequestMapping("/stu")
    public String student(String id){ return feignHystrix.stu(id);}
}
