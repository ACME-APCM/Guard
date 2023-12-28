package Guard.Guard;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String test(){
        return LocalDateTime.now().toString();
    }

}
