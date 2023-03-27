package FeignHystrixAnother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
public class FeignHystrixAnotherApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixAnotherApplication.class,args);
    }
}
