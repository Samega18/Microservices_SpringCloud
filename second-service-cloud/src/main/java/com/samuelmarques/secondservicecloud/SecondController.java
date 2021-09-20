package com.samuelmarques.secondservicecloud;

import org.springframework.web.bind.annotation.*;

@RestController
public class SecondController {

    @GetMapping("/second")
    public String test(@RequestHeader("X-second-Header") String headerValue){
        return headerValue;
    }

}