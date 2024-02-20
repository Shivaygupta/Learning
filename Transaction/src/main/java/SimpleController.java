import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SimpleController {


    @GetMapping
    public String getUserId(){
        return "sdfdfd";
    }


}