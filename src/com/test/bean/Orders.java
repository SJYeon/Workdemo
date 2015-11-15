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
 * Orders entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orders", catalog = "worktest")
public class Orders implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users usersByPayid;
	private Users usersByUserid;
	private Integer goodsnum;
	private double price;
	private Date ordertime;
	private String state;
	private double consume;
	private double league;
	private String share;
	private Integer goodsid;
	private Integer sllerid;
	private Integer version;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(Users usersByPayid, Users usersByUserid, Integer goodsnum,
			double price, Date ordertime, String state, double consume,
			double league, String share, Integer goodsid, Integer sllerid,
			Integer version) {
		this.usersByPayid = usersByPayid;
		this.usersByUserid = usersByUserid;
		this.goodsnum = goodsnum;
		this.price = price;
		this.ordertime = ordertime;
		this.state = state;
		this.consume = consume;
		this.league = league;
		this.share = share;
		this.goodsid = goodsid;
		this.sllerid = sllerid;
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
	@JoinColumn(name = "payid", nullable = false)
	public Users getUsersByPayid() {
		return this.usersByPayid;
	}

	public void setUsersByPayid(Users usersByPayid) {
		this.usersByPayid = usersByPayid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	public Users getUsersByUserid() {
		return this.usersByUserid;
	}

	public void setUsersByUserid(Users usersByUserid) {
		this.usersByUserid = usersByUserid;
	}

	@Column(name = "goodsnum", nullable = false)
	public Integer getGoodsnum() {
		return this.goodsnum;
	}

	public void setGoodsnum(Integer goodsnum) {
		this.goodsnum = goodsnum;
	}

	@Column(name = "price", nullable = false, precision = 10, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "ordertime", nullable = false, length = 0)
	public Date getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	@Column(name = "state", nullable = false, length = 10)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "consume", nullable = false, precision = 10, scale = 0)
	public double getConsume() {
		return this.consume;
	}

	public void setConsume(double consume) {
		this.consume = consume;
	}

	@Column(name = "league", nullable = false, precision = 10, scale = 0)
	public double getLeague() {
		return this.league;
	}

	public void setLeague(double league) {
		this.league = league;
	}

	@Column(name = "share", nullable = false, length = 10)
	public String getShare() {
		return this.share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	@Column(name = "goodsid", nullable = false)
	public Integer getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "sllerid", nullable = false)
	public Integer getSllerid() {
		return this.sllerid;
	}

	public void setSllerid(Integer sllerid) {
		this.sllerid = sllerid;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}