package com.test.bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Orderaddress entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderaddress", catalog = "worktest")
public class Orderaddress implements java.io.Serializable {

	// Fields

	private Integer id;
	private Consigneeinfo consigneeinfo;
	private String address;
	private Set<Orders> orderses = new HashSet<Orders>(0);

	// Constructors

	/** default constructor */
	public Orderaddress() {
	}

	/** full constructor */
	public Orderaddress(Consigneeinfo consigneeinfo, String address,
			Set<Orders> orderses) {
		this.consigneeinfo = consigneeinfo;
		this.address = address;
		this.orderses = orderses;
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
	@JoinColumn(name = "cgid")
	public Consigneeinfo getConsigneeinfo() {
		return this.consigneeinfo;
	}

	public void setConsigneeinfo(Consigneeinfo consigneeinfo) {
		this.consigneeinfo = consigneeinfo;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderaddress")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}