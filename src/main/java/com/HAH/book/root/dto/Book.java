package com.HAH.book.root.dto;

import lombok.Data;

@Data
public class Book {
	
	private int id;
	private String title;
	private String Author;
	private Category category;
	private int price;
	private String remark;

}
