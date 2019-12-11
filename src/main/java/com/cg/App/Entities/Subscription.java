package com.cg.App.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Subscription {
	@Id
	@SequenceGenerator(name ="seq", sequenceName = "seq", initialValue = 100000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int AccsubscriptionId;
	private String subscriptionName;

	public int getSubscriptionId() {
		return AccsubscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.AccsubscriptionId = subscriptionId;
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	@Override
	public String toString() {
		return "Subscription [subscriptionId=" + AccsubscriptionId + ", subscriptionName=" + subscriptionName + "]";
	}
}
