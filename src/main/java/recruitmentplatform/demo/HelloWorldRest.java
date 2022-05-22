package recruitmentplatform.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {

    @RequestMapping("/hello")
    public ResponseEntity<String> see(){
        return ResponseEntity.ok()
                .body(get());
    }

    public String get(){
        return "witajSwiecie";
    }
}