package com.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderincome entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderincome", catalog = "worktest")
public class Orderincome implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users usersBySharerid;
	private Operator operatorByBoid;
	private Users usersByInviterid;
	private Operator operatorBySoid;
	private double soincome;
	private double boincome;
	private double shareincome;
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
	public Orderincome(Integer id, Users usersBySharerid,
			Operator operatorByBoid, Users usersByInviterid,
			Operator operatorBySoid, double soincome, double boincome,
			double shareincome, double inviterincome) {
		this.id = id;
		this.usersBySharerid = usersBySharerid;
		this.operatorByBoid = operatorByBoid;
		this.usersByInviterid = usersByInviterid;
		this.operatorBySoid = operatorBySoid;
		this.soincome = soincome;
		this.boincome = boincome;
		this.shareincome = shareincome;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sharerid")
	public Users getUsersBySharerid() {
		return this.usersBySharerid;
	}

	public void setUsersBySharerid(Users usersBySharerid) {
		this.usersBySharerid = usersBySharerid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boid")
	public Operator getOperatorByBoid() {
		return this.operatorByBoid;
	}

	public void setOperatorByBoid(Operator operatorByBoid) {
		this.operatorByBoid = operatorByBoid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inviterid")
	public Users getUsersByInviterid() {
		return this.usersByInviterid;
	}

	public void setUsersByInviterid(Users usersByInviterid) {
		this.usersByInviterid = usersByInviterid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soid")
	public Operator getOperatorBySoid() {
		return this.operatorBySoid;
	}

	public void setOperatorBySoid(Operator operatorBySoid) {
		this.operatorBySoid = operatorBySoid;
	}

	@Column(name = "soincome", precision = 10)
	public double getSoincome() {
		return this.soincome;
	}

	public void setSoincome(double soincome) {
		this.soincome = soincome;
	}

	@Column(name = "boincome", precision = 10)
	public double getBoincome() {
		return this.boincome;
	}

	public void setBoincome(double boincome) {
		this.boincome = boincome;
	}

	@Column(name = "shareincome", precision = 10)
	public double getShareincome() {
		return this.shareincome;
	}

	public void setShareincome(double shareincome) {
		this.shareincome = shareincome;
	}

	@Column(name = "inviterincome", precision = 10)
	public double getInviterincome() {
		return this.inviterincome;
	}

	public void setInviterincome(double inviterincome) {
		this.inviterincome = inviterincome;
	}

}