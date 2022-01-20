package com.zee.zee5app.repository.Impl;

import java.util.ArrayList;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.repository.SubscriptionRepository2;

public class SubscriptionRepositoryImpl implements SubscriptionRepository2 {
	private ArrayList<Subscription> subscriptions=new ArrayList<Subscription>();
	private static int count=0;
	
	private SubscriptionRepositoryImpl()
	{
		
	}
	
	private static SubscriptionRepository2 subscription;
	public static SubscriptionRepository2 getInstance()
	{
		if(subscription==null)
			subscription=new SubscriptionRepositoryImpl();
		return subscription;
	}
	
	@Override
	public ArrayList<Subscription> getSubscriptions() {
		// TODO Auto-generated method stub
		return subscriptions;
	}

	@Override
	public String addSubcription(Subscription subscription) {
		// TODO Auto-generated method stub
		boolean res=this.subscriptions.add(subscription);
		return res?"success":"failure";
	}

	@Override
	public Subscription getSubscriptionById(String subId) {
		// TODO Auto-generated method stub
		for (Subscription subscription : subscriptions) {
			if(subscription!=null && subscription.getSubID().equals(subId))
				return subscription;
		}
		return null;
	}

	@Override
	public String modifySubscription(String subId, Subscription subscription) {
		// TODO Auto-generated method stub
		for(Subscription subscription1:subscriptions)
		{
			if(subscription1!=null && subscription1.getSubID().equals(subId))
			{
				subscription1=subscription;
				return "success";
			}
		}
		return "id does not exist";
	}
	@Override
	public String deleteSubscriptionById(String id) {
		// TODO Auto-generated method stub
		int index=-1;
		for(int i=0;i<subscriptions.size();i++)
		{
			if(subscriptions.get(i).getSubID().equals(id))
			{
				index=i;
				break;
			}
		}
		return index!=-1?"success":"id was not available";
	}

}