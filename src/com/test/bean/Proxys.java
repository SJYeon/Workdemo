package com.test.bean;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Proxys entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proxys", catalog = "worktest")
public class Proxys implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private String proxytype;
	private String proxyregion;
	private Integer roxylv;
	private String teamname;
	private Date registertime;
	private String repersonqq;
	private Integer pnum;
	private String introduction;
	private Integer version;
	private Set<Proxyperson> proxypersons = new HashSet<Proxyperson>(0);
	private Set<Goods> goodses = new HashSet<Goods>(0);

	// Constructors

	/** default constructor */
	public Proxys() {
	}

	/** minimal constructor */
	public Proxys(Users users, String proxytype, String proxyregion,
			Integer roxylv, String teamname, String repersonqq, Integer pnum,
			Integer version) {
		this.users = users;
		this.proxytype = proxytype;
		this.proxyregion = proxyregion;
		this.roxylv = roxylv;
		this.teamname = teamname;
		this.repersonqq = repersonqq;
		this.pnum = pnum;
		this.version = version;
	}

	/** full constructor */
	public Proxys(Users users, String proxytype, String proxyregion,
			Integer roxylv, String teamname, Date registertime,
			String repersonqq, Integer pnum, String introduction,
			Integer version, Set<Proxyperson> proxypersons, Set<Goods> goodses) {
		this.users = users;
		this.proxytype = proxytype;
		this.proxyregion = proxyregion;
		this.roxylv = roxylv;
		this.teamname = teamname;
		this.registertime = registertime;
		this.repersonqq = repersonqq;
		this.pnum = pnum;
		this.introduction = introduction;
		this.version = version;
		this.proxypersons = proxypersons;
		this.goodses = goodses;
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
	@JoinColumn(name = "repersonid", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "proxytype", nullable = false, length = 30)
	public String getProxytype() {
		return this.proxytype;
	}

	public void setProxytype(String proxytype) {
		this.proxytype = proxytype;
	}

	@Column(name = "proxyregion", nullable = false, length = 50)
	public String getProxyregion() {
		return this.proxyregion;
	}

	public void setProxyregion(String proxyregion) {
		this.proxyregion = proxyregion;
	}

	@Column(name = "roxylv", nullable = false)
	public Integer getRoxylv() {
		return this.roxylv;
	}

	public void setRoxylv(Integer roxylv) {
		this.roxylv = roxylv;
	}

	@Column(name = "teamname", nullable = false, length = 20)
	public String getTeamname() {
		return this.teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "registertime", length = 0)
	public Date getRegistertime() {
		return this.registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	@Column(name = "repersonqq", nullable = false, length = 15)
	public String getRepersonqq() {
		return this.repersonqq;
	}

	public void setRepersonqq(String repersonqq) {
		this.repersonqq = repersonqq;
	}

	@Column(name = "pnum", nullable = false)
	public Integer getPnum() {
		return this.pnum;
	}

	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}

	@Column(name = "introduction", length = 100)
	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proxys")
	public Set<Proxyperson> getProxypersons() {
		return this.proxypersons;
	}

	public void setProxypersons(Set<Proxyperson> proxypersons) {
		this.proxypersons = proxypersons;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proxys")
	public Set<Goods> getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set<Goods> goodses) {
		this.goodses = goodses;
	}

}