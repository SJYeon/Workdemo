package com.test.bean;

import java.util.Date;
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
 * Shoppingcart entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "shoppingcart", catalog = "worktest")
public class Shoppingcart implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Users usersBySellerid;
	private Users usersByUserid;
	private Integer count;
	private Date time;
	private Integer version;

	// Constructors

	/** default constructor */
	public Shoppingcart() {
	}

	/** full constructor */
	public Shoppingcart(Goods goods, Users usersBySellerid,
			Users usersByUserid, Integer count, Date time, Integer version) {
		this.goods = goods;
		this.usersBySellerid = usersBySellerid;
		this.usersByUserid = usersByUserid;
		this.count = count;
		this.time = time;
		this.version = version;
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
	@JoinColumn(name = "goodsid", nullable = false)
	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sellerid", nullable = false)
	public Users getUsersBySellerid() {
		return this.usersBySellerid;
	}

	public void setUsersBySellerid(Users usersBySellerid) {
		this.usersBySellerid = usersBySellerid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	public Users getUsersByUserid() {
		return this.usersByUserid;
	}

	public void setUsersByUserid(Users usersByUserid) {
		this.usersByUserid = usersByUserid;
	}

	@Column(name = "count", nullable = false)
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "time", nullable = false, length = 0)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}