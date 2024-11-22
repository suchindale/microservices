package org.mslib.fis;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

	Subscription findBySubscriberNameAndBookId(String subscriberName, String bookId);	
	
	
}