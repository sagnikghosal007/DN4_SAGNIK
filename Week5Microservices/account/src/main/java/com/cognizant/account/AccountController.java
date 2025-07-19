package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class AccountController {
    @GetMapping("/accounts/{number}")
    public Map<String, Object> getDetails(@PathVariable String number) {
        return Map.of("number", "00987987973432", "type", "savings", "balance", 234343);
    }
}