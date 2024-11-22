package org.mslib.fis;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOK_VALUE")
public class Book {	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="BOOK_ID")
	String bookId;
	
	@Column(name="BOOK_NAME")
	String bookName;
	
	@Column(name="AUTHOR")
	String author;
	
	@Column(name="AVAILABLE_COPIES")
	int availableCopies;
	
	@Column(name="TOTAL_COPIES")
	int totalCopies;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Book(String bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}



	public Book(Long id, String bookId, String bookName, String author, int availableCopies, int totalCopies) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.availableCopies = availableCopies;
		this.totalCopies = totalCopies;
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	public int getTotalCopies() {
		return totalCopies;
	}
	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}	

}

