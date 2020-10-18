package com.example.webusers.modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

	private String bookName;
	private String writerName;
	private String publicationName;
	private String seriesName;
	private String publicedYear;
	private String mrp;
	private String tag;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getPublicationName() {
		return publicationName;
	}
	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getPublicedYear() {
		return publicedYear;
	}
	public void setPublicedYear(String publicedYear) {
		this.publicedYear = publicedYear;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", writerName=" + writerName + ", publicationName=" + publicationName
				+ ", seriesName=" + seriesName + ", publicedYear=" + publicedYear + ", mrp=" + mrp + ", tag=" + tag
				+ "]";
	}
	
}
