package eletronics.trigger.http;

import eletronics.api.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest implements IOrderService {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
