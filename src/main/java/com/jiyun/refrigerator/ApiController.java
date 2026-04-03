package com.jiyun.refrigerator;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private OpenAiService aiService;

    @GetMapping("/recommend")
    public String recommend(@RequestParam String items) {
        return aiService.askAi(items);
    }
    
}
