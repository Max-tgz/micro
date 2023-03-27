package FeignHystrix.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-provider", fallback = FeignHystrixImpl.class )
public interface FeignHystrix {
    @RequestMapping("/student")
    String stu(@RequestParam("id") String id);
}
