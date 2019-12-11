package com.cg.App.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Entities.Account;
import com.cg.App.Repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account addAccount(Account a) {
		return accountRepository.save(a);// saveAndFlush(a); // save(a);
	}

	public Account getAccount(int accountNum) {
		if (ValiadateAcctNum(accountNum))
			return accountRepository.getOne(accountNum);
		else
			return null;
	}

	private boolean ValiadateAcctNum(int accountNum) {
		Account acc = accountRepository.findOne(accountNum);
		if (acc != null)
			return true;
		else
			return false;
	}

	public List<Account> getAllAccounts() {

		return accountRepository.findAll();
	}

}
