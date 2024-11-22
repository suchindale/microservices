package org.mslib.fis;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SubscriptionController {

	@Autowired
	private BookServiceProxy  proxy;
	
	
	@Autowired
	SubscriptionRepository repository;
	
	@GetMapping("/subscription/subscriberName/{subscriberName}/bookId/{bookId}")
	public Subscription BookInquiry(@PathVariable String subscriberName, @PathVariable String bookId) {
		
		Subscription detail = repository.findBySubscriberNameAndBookId(subscriberName, bookId);
		return detail;
	}
	
	@GetMapping("/bookInquiry/bookId/{bookId}/bookName/{bookName}")
	public BookBean bookInquiry(@PathVariable String bookId, @PathVariable String bookName) {
		
		RestTemplate restTemplate=new RestTemplate();	
		
		Map<String,String> urlVariables=new HashMap<>();
		urlVariables.put("bookId", bookId);
		urlVariables.put("bookName", bookName);
		ResponseEntity<BookBean> responseEntity=restTemplate.getForEntity("http://localhost:8000/books/bookId/{bookId}/bookName/{bookName}",
			BookBean.class, urlVariables);
		
		BookBean bookBean= responseEntity.getBody();
			
		return new BookBean(10001L, bookId, bookName, bookBean.getAuthor(), bookBean.getTotalCopies(), bookBean.getAvailableCopies());
	
	}
	
	
	@GetMapping("/bookInquiry-feign/bookId/{bookId}/bookName/{bookName}")
	public BookBean bookInquiryFeign(@PathVariable String bookId, @PathVariable String bookName) {
		
		BookBean bookBean = proxy.books(bookId, bookName);
		
		return new BookBean(bookBean.getId(), bookId, bookName, bookBean.getAuthor() + "[Feign]", bookBean.getTotalCopies(), bookBean.getAvailableCopies());
		
	}
	
	
}