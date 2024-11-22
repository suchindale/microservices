package org.mslib.fis;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="books")
@Service
public interface BookServiceProxy {

	@GetMapping("/books/bookId/{bookId}/bookName/{bookName}")
	public BookBean books(@PathVariable String bookId, @PathVariable String bookName);
}