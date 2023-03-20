package FeignClient.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(name="eureka-provider")
public interface FeignService {
    @RequestMapping("/port")
    String sayHello();
}
