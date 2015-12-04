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
public class Ordergoods implements java.io.Serializable{

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Goods goods;
	private Orders orders;
	private Integer gid;
	private double gprice;
	private String gname;
	private Integer gsum;
	private String gpic;

	// Constructors

	/** default constructor */
	public Ordergoods() {
	}

	/** full constructor */
	public Ordergoods(Goods goods, Orders orders, Integer gid, double gprice,
			String gname, Integer gsum, String gpic) {
		this.goods = goods;
		this.orders = orders;
		this.gid = gid;
		this.gprice = gprice;
		this.gname = gname;
		this.gsum = gsum;
		this.gpic = gpic;
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

	@Column(name = "gprice", precision = 10)
	public double getGprice() {
		return this.gprice;
	}

	public void setGprice(double gprice) {
		this.gprice = gprice;
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
		return this.gpic;
	}

	public void setGpic(String gpic) {
		this.gpic = gpic;
	}

}