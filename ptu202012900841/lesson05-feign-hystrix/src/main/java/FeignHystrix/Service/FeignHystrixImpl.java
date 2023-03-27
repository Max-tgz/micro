package FeignHystrix.Service;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrixImpl implements FeignHystrix{
    @Override
    public String stu(String id){
        return "你好，这是feign+hystrix服务，你访问的"+ id + "服务出现异常！";
    }
}
