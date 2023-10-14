package com.lulu02.lulu02_SportsProductShop.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String product;
	double cost;
	Date dateofpurchase;
	Date deliverydate;
	String customerfeedback;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Date getDateofpurchase() {
		return dateofpurchase;
	}

	public void setDateofpurchase(Date dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public String getCustomerfeedback() {
		return customerfeedback;
	}

	public void setCustomerfeedback(String customerfeedback) {
		this.customerfeedback = customerfeedback;
	}

	public Purchase(Long id, String product, double cost, Date dateofpurchase, Date deliverydate,
			String customerfeedback) {
		super();
		this.id = id;
		this.product = product;
		this.cost = cost;
		this.dateofpurchase = dateofpurchase;
		this.deliverydate = deliverydate;
		this.customerfeedback = customerfeedback;
	}

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", product=" + product + ", cost=" + cost + ", dateofpurchase=" + dateofpurchase
				+ ", deliverydate=" + deliverydate + ", customerfeedback=" + customerfeedback + "]";
	}

	// Getters and setters

	// Constructors
}
