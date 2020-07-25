package com.ui.spring.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	private long id;
	private int categoryId;
	private int subCategoryId;
	private String bookTitle;
	private String description;
	private String bookSKU;
	private String bookISNB;
	private int authorId;
	private double bookPrice;
	private int currencyId;
	private double bookTaxes;
	private String bindingType;
	private String featured;
	private int isActive;
	private int isDeleted;
	private String createdDate;
	
	public Product() {
		
	}
	
	public Product(String description) {
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "category_id", columnDefinition = "integer default 0")
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "sub_category_id", columnDefinition = "integer default 0")
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	@Column(name = "book_title")
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Column(name = "book_sku")
	public String getBookSKU() {
		return bookSKU;
	}
	public void setBookSKU(String bookSKU) {
		this.bookSKU = bookSKU;
	}

	@Column(name = "book_isnb")
	public String getBookISNB() {
		return bookISNB;
	}
	public void setBookISNB(String bookISNB) {
		this.bookISNB = bookISNB;
	}

	@Column(name = "author_id", columnDefinition = "integer default 0")
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Column(name = "book_price")
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Column(name = "currency_id", columnDefinition = "integer default 0")
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name = "book_taxes")
	public double getBookTaxes() {
		return bookTaxes;
	}
	public void setBookTaxes(double bookTaxes) {
		this.bookTaxes = bookTaxes;
	}

	@Column(name = "book_binding")
	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Column(name = "featured")
	public String getFeatured() {
		return featured;
	}

	public void setFeatured(String featured) {
		this.featured = featured;
	}

	
	@Column(name = "is_active", columnDefinition = "integer default 0")
	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	@Column(name = "is_deleted", columnDefinition = "integer default 0")
	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "cteated_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}
