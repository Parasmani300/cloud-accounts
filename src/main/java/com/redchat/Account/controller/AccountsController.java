package com.redchat.Account.controller;

import com.redchat.Account.dto.AccountDto;
import com.redchat.Account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class AccountsController {

    @Autowired
    AccountService accountService;
    @PostMapping("/save")
    public ResponseEntity<AccountDto> getAccountInfo(@RequestBody AccountDto accountDto)
    {
        AccountDto acc =  accountService.saveAccount(accountDto);
        acc.setAddress(acc.getAddress() + " " + Optional.ofNullable(System.getenv("HOSTNAME")));
        return new ResponseEntity<>(acc, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) throws UserNotFoundException {
        AccountDto accountDto = accountService.getAccount(id);
        return new ResponseEntity<>(accountDto,HttpStatus.OK);
    }
}
