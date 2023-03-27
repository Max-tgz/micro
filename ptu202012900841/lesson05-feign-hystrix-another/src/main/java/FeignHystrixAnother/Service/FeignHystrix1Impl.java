package FeignHystrixAnother.Service;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrix1Impl implements FeignHystrix1 {

    @Override
    public String stu(String id){
        return "你好，这是feign+hystrix服务，你访问的"+ id +"服务出现异常!";
    }
    @Override
    public String port(){
        return "你好，端口服务暂时无法使用！";
    }
}
