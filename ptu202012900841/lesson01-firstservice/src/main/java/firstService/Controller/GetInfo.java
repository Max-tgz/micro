package firstService.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetInfo {
    @Value("${info.name}")
    private String name;
    @Value("${info.sno}")
    private String sno;
    @RequestMapping("/info")
    public String getinfo(){
        String strInfo = "Hello world, my name is " + name +"," + "my student number is : " + sno;
        return strInfo;
    }
}