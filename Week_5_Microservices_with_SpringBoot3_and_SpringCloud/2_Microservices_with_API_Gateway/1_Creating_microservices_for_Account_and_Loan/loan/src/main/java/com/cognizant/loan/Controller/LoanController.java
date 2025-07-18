package com.cognizant.loan.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{loanNumber}")
    public Loan getLoanDetails(@PathVariable String loanNumber) {
        return new Loan(loanNumber, "car", 400000, 3258, 18);
    }
}
