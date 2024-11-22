package org.mslib.fis;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

	Book findByBookIdAndBookName(String bookId, String bookName);	
	
	
}
