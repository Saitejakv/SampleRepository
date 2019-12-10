package com.cg.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.App.Entities.Account;
import com.cg.App.Exceptions.AccountManagementException;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
