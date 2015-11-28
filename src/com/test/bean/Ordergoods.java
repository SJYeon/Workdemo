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
 * Ordergoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ordergoods", catalog = "worktest")
public class Ordergoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Orders orders;
	private Integer gid;
	private String gname;
	private double gprice;
	private Integer gsum;
	private String gpic;
	// Constructors

	/** default constructor */
	public Ordergoods() {
	}

	/** full constructor */
	public Ordergoods(Goods goods, Orders orders, Integer gid, String gname,
			Integer gsum) {
		this.goods = goods;
		this.orders = orders;
		this.gid = gid;
		this.gname = gname;
		this.gsum = gsum;
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
	@JoinColumn(name = "orderid")
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Column(name = "gid")
	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	@Column(name = "gname", length = 30)
	public String getGname() {
		return this.gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	@Column(name = "gsum")
	public Integer getGsum() {
		return this.gsum;
	}

	public void setGsum(Integer gsum) {
		this.gsum = gsum;
	}
	@Column(name = "gpic", length = 100)
	public String getGpic() {
		return gpic;
	}

	public void setGpic(String gpic) {
		this.gpic = gpic;
	}
	@Column(name = "gprice", length = 10)
	public double getGprice() {
		return gprice;
	}

	public void setGprice(double gprice) {
		this.gprice = gprice;
	}

	

}