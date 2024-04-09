package com.redchat.Account.utils;

import com.redchat.Account.dto.AccountDto;
import com.redchat.Account.model.Account;

public class AccountToDtoMapper {
    public static AccountDto map(Account account)
    {
        AccountDto accountDto = new AccountDto();
        accountDto.setName(account.getName());
        accountDto.setId(account.getId());
        accountDto.setAddress(account.getAddress());
        accountDto.setModifiedDate(account.getModifiedDate());
        accountDto.setCreatedDate(account.getCreatedDate());

        return accountDto;
    }
}
