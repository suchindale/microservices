package org.mslib.fis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookRepository repository;
	
	@GetMapping("/books/bookId/{bookId}/bookName/{bookName}")
	public Book BookInquiry(@PathVariable String bookId, @PathVariable String bookName) {
		
		Book detail = repository.findByBookIdAndBookName(bookId, bookName);
		return detail;
	}
}
