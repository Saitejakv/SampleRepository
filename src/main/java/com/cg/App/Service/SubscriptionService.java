package com.cg.App.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Entities.Subscription;
import com.cg.App.Repository.SubscriptionRepository;

@Service
public class SubscriptionService {

	@Autowired
	private SubscriptionRepository sr;
	
	public  Subscription addSubscription(Subscription s) {
		return sr.save(s);
	}
	
public List<Subscription> getallSubs() {
		
		return sr.findAll();
	}
}
