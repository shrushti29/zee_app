package com.zee.zee5app.service;

import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.repository.SubscriptionRepository;

public class SubscriptionService {
	SubscriptionRepository subscriptionrepo=SubscriptionRepository.getInstance();
	private SubscriptionService() {
		// TODO Auto-generated constructor stub
	}
	private static SubscriptionService subservice=null;
	public static SubscriptionService getInstance()
	{
		if(subservice==null)
			subservice=new SubscriptionService();
		return subservice;
	}
	public String addSubscription(Subscription subscription)
	{
		return this.subscriptionrepo.addSubcription(subscription);
	}
	public Subscription getSubscriptionById(String id)
	{
		return this.subscriptionrepo.getSubscriptionById(id);
	}
	public Subscription[] getAllSubscriptions()
	{
		return this.subscriptionrepo.getSubscriptions();
	}
	public String modifySubscription(String id,Subscription subscription)
	{
		return this.subscriptionrepo.modifySubscription(id, subscription);
	}
}