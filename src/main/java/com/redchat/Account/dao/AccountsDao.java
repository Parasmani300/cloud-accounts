package com.redchat.Account.dao;

import com.redchat.Account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsDao extends JpaRepository<Account,Long> {
}
