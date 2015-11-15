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
 * Goodspics entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "goodspics", catalog = "worktest")
public class Goodspics implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private String src;
	private String desc;
	private Integer version;

	// Constructors

	/** default constructor */
	public Goodspics() {
	}

	/** minimal constructor */
	public Goodspics(Goods goods, String src, Integer version) {
		this.goods = goods;
		this.src = src;
		this.version = version;
	}

	/** full constructor */
	public Goodspics(Goods goods, String src, String desc, Integer version) {
		this.goods = goods;
		this.src = src;
		this.desc = desc;
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

	@Column(name = "src", nullable = false, length = 50)
	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	@Column(name = "desc", length = 50)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}