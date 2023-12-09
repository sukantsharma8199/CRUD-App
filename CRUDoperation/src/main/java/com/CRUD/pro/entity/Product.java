package com.CRUD.pro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCT_TBL")
public class Product {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    private String name;
	    private int quantity;
	    private double price;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Integer getid() {
			// TODO Auto-generated method stub
			return null;
		}
		
		}
	


