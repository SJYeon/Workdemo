package com.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cartgoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cartgoods", catalog = "worktest")
public class Cartgoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Shoppingcart shoppingcart;
	private Integer gid;

	// Constructors

	/** default constructor */
	public Cartgoods() {
	}

	/** full constructor */
	public Cartgoods(Goods goods, Shoppingcart shoppingcart, Integer gid) {
		this.goods = goods;
		this.shoppingcart = shoppingcart;
		this.gid = gid;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goodsid")
	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cartid")
	public Shoppingcart getShoppingcart() {
		return this.shoppingcart;
	}

	public void setShoppingcart(Shoppingcart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

	@Column(name = "gid")
	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

}