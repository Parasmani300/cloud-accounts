package com.redchat.Account.impl;

import com.redchat.Account.controller.UserNotFoundException;
import com.redchat.Account.dao.AccountsDao;
import com.redchat.Account.dto.AccountDto;
import com.redchat.Account.model.Account;
import com.redchat.Account.service.AccountService;
import com.redchat.Account.utils.AccountToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountsDao accountsDao;

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setName(accountDto.getName());
        account.setAddress(accountDto.getAddress());

        Account savedAccount = accountsDao.save(account);
        return AccountToDtoMapper.map(savedAccount);
    }

    @Override
    public AccountDto getAccount(Long id) throws UserNotFoundException {
        Account account = accountsDao.findById(id).orElseThrow(
                ()->new UserNotFoundException("Account not found"));

        return AccountToDtoMapper.map(account);
    }
}
