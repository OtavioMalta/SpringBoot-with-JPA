package com.course.sb.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.course.sb.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantiry;
	
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantiry, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantiry = quantiry;
		this.price = price;
	}

	public Integer getQuantiry() {
		return quantiry;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public void setQuantiry(Integer quantiry) {
		this.quantiry = quantiry;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
