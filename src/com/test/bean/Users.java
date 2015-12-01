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
 * Users entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "users", catalog = "worktest")
public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private String phone;
	private String email;
	private String password;
	private Date registratetime;
	private Integer integral;
	private String userclass;
	private String province;
	private String city;
	private String area;
	private Integer version;
	private String local;
	private Set<Users> userses = new HashSet<Users>(0);
	private Set<Goods> goodses = new HashSet<Goods>(0);
	private Set<Proxys> proxyses = new HashSet<Proxys>(0);
	private Set<Shoppingcart> shoppingcartsForSellerid = new HashSet<Shoppingcart>(
			0);
	private Set<Shoppingcart> shoppingcartsForUserid = new HashSet<Shoppingcart>(
			0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String phone, String email, String password,
			Date registratetime, Integer integral, String userclass,
			String province, String city, String area, Integer version,
			String local) {
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.registratetime = registratetime;
		this.integral = integral;
		this.userclass = userclass;
		this.province = province;
		this.city = city;
		this.area = area;
		this.version = version;
		this.local = local;
	}

	/** full constructor */
	public Users(Users users, String phone, String email, String password,
			Date registratetime, Integer integral, String userclass,
			String province, String city, String area, Integer version,
			String local, Set<Users> userses, Set<Goods> goodses,
			Set<Proxys> proxyses, Set<Shoppingcart> shoppingcartsForSellerid,
			Set<Shoppingcart> shoppingcartsForUserid) {
		this.users = users;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.registratetime = registratetime;
		this.integral = integral;
		this.userclass = userclass;
		this.province = province;
		this.city = city;
		this.area = area;
		this.version = version;
		this.local = local;
		this.userses = userses;
		this.goodses = goodses;
		this.proxyses = proxyses;
		this.shoppingcartsForSellerid = shoppingcartsForSellerid;
		this.shoppingcartsForUserid = shoppingcartsForUserid;
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
	@JoinColumn(name = "inviter")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "phone", nullable = false, length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", nullable = false, length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "registratetime", nullable = false, length = 0)
	public Date getRegistratetime() {
		return this.registratetime;
	}

	public void setRegistratetime(Date registratetime) {
		this.registratetime = registratetime;
	}

	@Column(name = "integral", nullable = false)
	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	@Column(name = "userclass", nullable = false, length = 10)
	public String getUserclass() {
		return this.userclass;
	}

	public void setUserclass(String userclass) {
		this.userclass = userclass;
	}

	@Column(name = "province", nullable = false, length = 8)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "city", nullable = false, length = 5)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "area", nullable = false, length = 5)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "local", nullable = false, length = 15)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Goods> getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set<Goods> goodses) {
		this.goodses = goodses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Proxys> getProxyses() {
		return this.proxyses;
	}

	public void setProxyses(Set<Proxys> proxyses) {
		this.proxyses = proxyses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usersBySellerid")
	public Set<Shoppingcart> getShoppingcartsForSellerid() {
		return this.shoppingcartsForSellerid;
	}

	public void setShoppingcartsForSellerid(
			Set<Shoppingcart> shoppingcartsForSellerid) {
		this.shoppingcartsForSellerid = shoppingcartsForSellerid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usersByUserid")
	public Set<Shoppingcart> getShoppingcartsForUserid() {
		return this.shoppingcartsForUserid;
	}

	public void setShoppingcartsForUserid(
			Set<Shoppingcart> shoppingcartsForUserid) {
		this.shoppingcartsForUserid = shoppingcartsForUserid;
	}

}