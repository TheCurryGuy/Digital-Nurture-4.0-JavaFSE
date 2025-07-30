package com.cognizant.loan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
import java.util.HashMap;
@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoan(@PathVariable String loanNumber) {
        Map<String, Object> loanInformation = new HashMap<>();
        loanInformation.put("number", loanNumber);
        loanInformation.put("type", "car");
        loanInformation.put("loan", 400000);
        loanInformation.put("emi", 3258);
        loanInformation.put("tenure", 18);
        return loanInformation;
    }
}
