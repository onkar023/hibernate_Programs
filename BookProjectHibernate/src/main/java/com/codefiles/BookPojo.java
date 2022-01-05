package com.codefiles;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class BookPojo {
	@Id
	private String isbn;
	private String bname;
	private String bauthor;
	private float bprice;
	private String bpubl;
	private String bimg;
	
	public BookPojo() {
		// TODO Auto-generated constructor stub
	}

	public BookPojo(String isbn, String bname, String bauthor, float bprice, String bpubl, String bimg) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bpubl = bpubl;
		this.bimg = bimg;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public float getBprice() {
		return bprice;
	}

	public void setBprice(float bprice) {
		this.bprice = bprice;
	}

	public String getBpubl() {
		return bpubl;
	}

	public void setBpubl(String bpubl) {
		this.bpubl = bpubl;
	}

	public String getBimg() {
		return bimg;
	}

	public void setBimg(String bimg) {
		this.bimg = bimg;
	}
	

}
