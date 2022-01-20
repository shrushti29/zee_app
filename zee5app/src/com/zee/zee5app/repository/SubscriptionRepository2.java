package com.zee.zee5app.repository;

import java.util.ArrayList;

import com.zee.zee5app.dto.Subscription;

public interface SubscriptionRepository2 {
	public ArrayList<Subscription> getSubscriptions();
	public String addSubcription(Subscription subscription);
	public Subscription getSubscriptionById(String subId);
	public String modifySubscription(String subId,Subscription subscription);
	public String deleteSubscriptionById(String id);
}