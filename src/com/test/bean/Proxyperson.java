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
 * Proxyperson entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = " proxyperson", catalog = "worktest")
public class Proxyperson implements java.io.Serializable {

	// Fields

	private Integer id;
	private Proxys proxys;
	private Users users;
	private Integer proxylv;
	private double earings;
	private String proxytype;
	private Integer version;

	// Constructors

	/** default constructor */
	public Proxyperson() {
	}

	/** full constructor */
	public Proxyperson(Proxys proxys, Users users, Integer proxylv,
			double earings, String proxytype, Integer version) {
		this.proxys = proxys;
		this.users = users;
		this.proxylv = proxylv;
		this.earings = earings;
		this.proxytype = proxytype;
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
	@JoinColumn(name = "teamid", nullable = false)
	public Proxys getProxys() {
		return this.proxys;
	}

	public void setProxys(Proxys proxys) {
		this.proxys = proxys;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "proxylv", nullable = false)
	public Integer getProxylv() {
		return this.proxylv;
	}

	public void setProxylv(Integer proxylv) {
		this.proxylv = proxylv;
	}

	@Column(name = "earings", nullable = false, precision = 10, scale = 0)
	public double getEarings() {
		return this.earings;
	}

	public void setEarings(double earings) {
		this.earings = earings;
	}

	@Column(name = "proxytype", nullable = false, length = 10)
	public String getProxytype() {
		return this.proxytype;
	}

	public void setProxytype(String proxytype) {
		this.proxytype = proxytype;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}