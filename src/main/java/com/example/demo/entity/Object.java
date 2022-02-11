package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Object {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int objectid;
	@NotNull
	private int quantity;

	@NotNull
	@NotBlank
	private String customerName;

	public Object() {

	}

	public Object(int objectid, @NotNull int quantity, @NotBlank @NotNull String customerName, String paymentMethod) {
		super();
		this.objectid = objectid;
		this.quantity = quantity;
		this.customerName = customerName;
		this.paymentMethod = paymentMethod;
	}

	private String paymentMethod;

	public int getObjectid() {
		return objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
