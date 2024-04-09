package com.redchat.Account.service;

import com.redchat.Account.controller.UserNotFoundException;
import com.redchat.Account.dto.AccountDto;

public interface AccountService {
    public AccountDto saveAccount(AccountDto accountDto);
    public AccountDto getAccount(Long id) throws UserNotFoundException;
}
