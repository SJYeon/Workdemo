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
 * Ads entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ads", catalog = "worktest")
public class Ads implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private String url;
	private Integer advertlv;
	private Integer version;

	// Constructors

	/** default constructor */
	public Ads() {
	}

	/** full constructor */
	public Ads(Users users, String url, Integer advertlv, Integer version) {
		this.users = users;
		this.url = url;
		this.advertlv = advertlv;
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
	@JoinColumn(name = "releaseuserid", nullable = false)
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

	@Column(name = "advertlv", nullable = false)
	public Integer getAdvertlv() {
		return this.advertlv;
	}

	public void setAdvertlv(Integer advertlv) {
		this.advertlv = advertlv;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}