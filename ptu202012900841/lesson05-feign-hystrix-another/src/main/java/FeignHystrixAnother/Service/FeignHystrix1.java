package FeignHystrixAnother.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-provider",
    fallback = FeignHystrix1Impl.class)
public interface FeignHystrix1 {
    @RequestMapping("/student")
    String stu(@RequestParam("id") String id);
    @RequestMapping("/port")
    String port();
}
