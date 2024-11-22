package org.mslib.fis;

public class BookBean {
	
	private Long id;
	
	private String bookId;
	
	private String bookName;
	private String author;
	private int availableCopies;
	private int totalCopies;

	public BookBean() {
		// TODO Auto-generated constructor stub
	}
	
	public BookBean(Long id, String bookId, String bookName, String author, int availableCopies, int totalCopies) {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
