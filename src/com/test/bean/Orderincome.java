package com.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Orderincome entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderincome", catalog = "worktest")
public class Orderincome implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer soid;
	private double soincome;
	private Integer boid;
	private double boincome;
	private Integer sharerid;
	private double shareincome;
	private Integer inviterid;
	private double inviterincome;

	// Constructors

	/** default constructor */
	public Orderincome() {
	}

	/** minimal constructor */
	public Orderincome(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Orderincome(Integer id, Integer soid, double soincome, Integer boid,
			double boincome, Integer sharerid, double shareincome,
			Integer inviterid, double inviterincome) {
		this.id = id;
		this.soid = soid;
		this.soincome = soincome;
		this.boid = boid;
		this.boincome = boincome;
		this.sharerid = sharerid;
		this.shareincome = shareincome;
		this.inviterid = inviterid;
		this.inviterincome = inviterincome;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "soid")
	public Integer getSoid() {
		return this.soid;
	}

	public void setSoid(Integer soid) {
		this.soid = soid;
	}

	@Column(name = "soincome", precision = 10)
	public double getSoincome() {
		return this.soincome;
	}

	public void setSoincome(double soincome) {
		this.soincome = soincome;
	}

	@Column(name = "boid")
	public Integer getBoid() {
		return this.boid;
	}

	public void setBoid(Integer boid) {
		this.boid = boid;
	}

	@Column(name = "boincome", precision = 10)
	public double getBoincome() {
		return this.boincome;
	}

	public void setBoincome(double boincome) {
		this.boincome = boincome;
	}

	@Column(name = "sharerid")
	public Integer getSharerid() {
		return this.sharerid;
	}

	public void setSharerid(Integer sharerid) {
		this.sharerid = sharerid;
	}

	@Column(name = "shareincome", precision = 10)
	public double getShareincome() {
		return this.shareincome;
	}

	public void setShareincome(double shareincome) {
		this.shareincome = shareincome;
	}

	@Column(name = "inviterid")
	public Integer getInviterid() {
		return this.inviterid;
	}

	public void setInviterid(Integer inviterid) {
		this.inviterid = inviterid;
	}

	@Column(name = "inviterincome", precision = 10)
	public double getInviterincome() {
		return this.inviterincome;
	}

	public void setInviterincome(double inviterincome) {
		this.inviterincome = inviterincome;
	}

}