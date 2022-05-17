package recruitmentplatform.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {

    @RequestMapping("/hello")
    public String see(){
        return get();
    }


    public String get(){
        return "witajSwiecie";
    }
}


