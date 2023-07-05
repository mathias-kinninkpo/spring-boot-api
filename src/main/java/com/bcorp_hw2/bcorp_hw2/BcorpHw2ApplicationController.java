package com.bcorp_hw2.bcorp_hw2;

// package com.bcorp_hw2.bcorp_hw2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BcorpHw2ApplicationController {

    @GetMapping("/")
    public String welcomeApi() {
        return "Jesus remains my only savior and my alone capacity.";
    }

    @GetMapping("/welcome")
    public String firstApi() {
        return "First API, let's go...";
    }
}
