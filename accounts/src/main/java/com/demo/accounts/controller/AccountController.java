package com.demo.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("accounts/")
public class AccountController {

    @GetMapping()
    public String getAccounts() {
        return "Accounts";
    }

}
