package com.cts.productmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int categoryId;
	private String categoryTitle;
	private String categoryDesc;

}
	
	
	
	




	
