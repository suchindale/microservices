package org.mslib.fis;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SUBSCRIPTION_VALUE")
public class Subscription {	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="SUBSCRIBER_NAME")
	String subscriberName;
	
	@Column(name="BOOK_ID")
	String bookId;
	
	@Column(name="DATE_SUBSCRIBED")
	String dateSubscribed ;
	
	@Column(name="DATE_RETURNED")
	String dateReturned ;
	
	
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Subscription(String subscriberName, String bookId) {
		super();
		this.subscriberName = subscriberName;
		this.bookId = bookId;
	}

	public Subscription(Long id, String subscriberName, String bookId, String dateSubscribed, String dateReturned, String totalCopies) {
		super();
		this.id = id;
		this.subscriberName = subscriberName;
		this.bookId = bookId;
		this.dateSubscribed = dateSubscribed;
		this.dateReturned = dateReturned;
	}

	public String getSubscriberName() {
		return subscriberName;
	}


	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public String getBookId() {
		return bookId;
	}


	public void setBookId(String bookId) {
		this.bookId = bookId;
	}




	public String getDateSubscribed() {
		return dateSubscribed;
	}


	public void setDateSubscribed(String dateSubscribed) {
		this.dateSubscribed = dateSubscribed;
	}


	public String getDateReturned() {
		return dateReturned;
	}


	public void setDateReturned(String dateReturned) {
		this.dateReturned = dateReturned;
	}



}
