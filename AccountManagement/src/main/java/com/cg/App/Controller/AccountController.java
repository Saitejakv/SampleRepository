package com.cg.App.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.Entities.Account;
import com.cg.App.Entities.Subscription;
import com.cg.App.Exceptions.AccountManagementException;
import com.cg.App.Service.AccountService;
import com.cg.App.Service.SubscriptionService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountservice;

	@Autowired
	private SubscriptionService subscriptionservice;

	@RequestMapping(value = "/addAccount", method = RequestMethod.POST)
	public Account addAccount(@RequestBody Account account) throws AccountManagementException {

		try {
			return accountservice.addAccount(account);
		}

		catch (Exception e) {
			throw new AccountManagementException(400, e.getMessage());
		}

	}
	
	@RequestMapping("/getAllAccounts")
	public List<Account> getAllAccounts() throws AccountManagementException {
		try {
			return accountservice.getAllAccounts();
		}

		catch (Exception e) {
			throw new AccountManagementException(400, e.getMessage());
		}

	}
	
	@RequestMapping(value = "/account/{accountNum}", method = RequestMethod.GET)
	public Account getEmployeedetails(@PathVariable int accountNum) throws AccountManagementException {
		try {
			return accountservice.getAccount(accountNum);
		} catch (Exception e) {
			throw new AccountManagementException(204, e.getMessage());
		}
	}
	
	
	
	@RequestMapping(value = "/subscription", method = RequestMethod.POST)
	public Subscription addSubscription(@RequestBody Subscription subs) throws AccountManagementException {
		try {
			return subscriptionservice.addSubscription(subs);
		} catch (Exception e) {
			throw new AccountManagementException(400, e.getMessage());
		}
	}

	@RequestMapping("/getAllsubs")
	public List<Subscription> getallSubs() throws Exception {
		return subscriptionservice.getallSubs();
	}


}
