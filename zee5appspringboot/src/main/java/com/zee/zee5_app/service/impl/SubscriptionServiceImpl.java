package com.zee.zee5_app.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidAmountException;
import com.zee.zee5_app.exception.InvalidEmailException;
import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.exception.InvalidNameException;
import com.zee.zee5_app.exception.InvalidPasswordException;
import com.zee.zee5_app.service.SubscriptionService;
import com.zee.zee5_app.repository.SubscriptionRepository;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	public SubscriptionRepository repository;


	@Override
	public String addSubscription(Subscription subscription) throws InvalidAmountException {
		// TODO Auto-generated method stub
		Subscription subscription2 = repository.save(subscription);
		if (subscription2 != null) {
			return "record added in subscription";
		} else {
			return "fail";
		}
	}

	@Override
	public String deleteSubscription(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Subscription> optional;
		try {
			optional = this.getSubscriptionById(id);
			if(optional.isEmpty()) {
				throw new IdNotFoundException("record not found");
			}
			else {
				repository.deleteById(id);
				return "subscription record deleted";
			}
		} catch (IdNotFoundException | InvalidIdLengthException | InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IdNotFoundException(e.getMessage());
		}
	}

	@Override
	public String modifySubscription(String id, Subscription subscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Subscription> getSubscriptionById(String id) throws IdNotFoundException, InvalidIdLengthException, InvalidAmountException {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Optional<List<Subscription>> getAllSubscription() throws InvalidIdLengthException, InvalidAmountException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(repository.findAll());
	}

}