/**
 * 
 */
package com.bookapp.model;
import java.time.LocalDateTime;

import java.util.List;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

/**
 * @author AvinashSankineni
 *
 */
@Node
public class Book {
	@Id
	private int id;
	private String title;
	private String subTitle;
	private String author;
	private double originalPrice;
	private double sellingPrice;
	private List<Category> category;
	private List<Type> type;
	private int rating;
	private int discount;
	private int paperQuality;
	private int bookSize;
	private String language;
	private String editor;
	private String publisher;
	private int edition;
	private LocalDateTime publishDate;
	private LocalDateTime manufactureDate;
	private String manufacturePlace;
	private int pages;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param subTitle
	 * @param author
	 * @param originalPrice
	 * @param sellingPrice
	 * @param category
	 * @param type
	 * @param rating
	 * @param discount
	 * @param paperQuality
	 * @param bookSize
	 * @param language
	 * @param editor
	 * @param publisher
	 * @param edition
	 * @param publishDate
	 * @param manufactureDate
	 * @param manufacturePlace
	 * @param pages
	 */
	public Book(int id,String title, String subTitle, String author, double originalPrice, double sellingPrice,
			List<Category> category, List<Type> type, int rating, int discount, int paperQuality, int bookSize,
			String language, String editor, String publisher, int edition, LocalDateTime publishDate, LocalDateTime manufactureDate,
			String manufacturePlace, int pages) {
		super();
		this.id=id;
		this.title = title;
		this.subTitle = subTitle;
		this.author = author;
		this.originalPrice = originalPrice;
		this.sellingPrice = sellingPrice;
		this.category = category;
		this.type = type;
		this.rating = rating;
		this.discount = discount;
		this.paperQuality = paperQuality;
		this.bookSize = bookSize;
		this.language = language;
		this.editor = editor;
		this.publisher = publisher;
		this.edition = edition;
		this.publishDate = publishDate;
		this.manufactureDate = manufactureDate;
		this.manufacturePlace = manufacturePlace;
		this.pages = pages;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * @param subTitle the subTitle to set
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the originalPrice
	 */
	public double getOriginalPrice() {
		return originalPrice;
	}

	/**
	 * @param originalPrice the originalPrice to set
	 */
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	/**
	 * @return the sellingPrice
	 */
	public double getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * @param sellingPrice the sellingPrice to set
	 */
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	/**
	 * @return the category
	 */
	public List<Category> getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(List<Category> category) {
		this.category = category;
	}

	/**
	 * @return the type
	 */
	public List<Type> getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(List<Type> type) {
		this.type = type;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * @return the paperQuality
	 */
	public int getPaperQuality() {
		return paperQuality;
	}

	/**
	 * @param paperQuality the paperQuality to set
	 */
	public void setPaperQuality(int paperQuality) {
		this.paperQuality = paperQuality;
	}

	/**
	 * @return the bookSize
	 */
	public int getBookSize() {
		return bookSize;
	}

	/**
	 * @param bookSize the bookSize to set
	 */
	public void setBookSize(int bookSize) {
		this.bookSize = bookSize;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * @param editor the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the edition
	 */
	public int getEdition() {
		return edition;
	}

	/**
	 * @param edition the edition to set
	 */
	public void setEdition(int edition) {
		this.edition = edition;
	}

	/**
	 * @return the publishDate
	 */
	public LocalDateTime getPublishDate() {
		return publishDate;
	}

	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(LocalDateTime publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * @return the manufactureDate
	 */
	public LocalDateTime getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * @param manufactureDate the manufactureDate to set
	 */
	public void setManufactureDate(LocalDateTime manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	/**
	 * @return the manufacturePlace
	 */
	public String getManufacturePlace() {
		return manufacturePlace;
	}

	/**
	 * @param manufacturePlace the manufacturePlace to set
	 */
	public void setManufacturePlace(String manufacturePlace) {
		this.manufacturePlace = manufacturePlace;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", subTitle=" + subTitle + ", author=" + author
				+ ", originalPrice=" + originalPrice + ", sellingPrice=" + sellingPrice + ", rating=" + rating
				+ ", discount=" + discount + ", paperQuality=" + paperQuality + ", bookSize=" + bookSize + ", language="
				+ language + ", editor=" + editor + ", publisher=" + publisher + ", edition=" + edition
				+ ", publishDate=" + publishDate + ", manufactureDate=" + manufactureDate + ", manufacturePlace="
				+ manufacturePlace + ", pages=" + pages + "]";
	}
}
