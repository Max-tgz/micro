package HystrixClient.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixClientService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "stuError")
    public String stu(String id )
    {
        return restTemplate.getForObject("http://eureka-provider/student?id="+id,String.class);
    }

    public String stuError(String id){return "你好，你访问的学号："+id+"的服务出现异常！";}
}
