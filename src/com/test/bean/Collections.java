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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Collections entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "collections", catalog = "worktest")
public class Collections implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Users users;
	private String url;
	private Date collecttime;
	private Integer version;

	// Constructors

	/** default constructor */
	public Collections() {
	}

	/** full constructor */
	public Collections(Goods goods, Users users, String url, Date collecttime,
			Integer version) {
		this.goods = goods;
		this.users = users;
		this.url = url;
		this.collecttime = collecttime;
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
	@JoinColumn(name = "collectorid", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "url", nullable = false, length = 50)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "collecttime", nullable = false, length = 0)
	public Date getCollecttime() {
		return this.collecttime;
	}

	public void setCollecttime(Date collecttime) {
		this.collecttime = collecttime;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}