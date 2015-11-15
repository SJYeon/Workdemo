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
	private Set<Orders> ordersesForUserid = new HashSet<Orders>(0);
	private Set<Orders> ordersesForPayid = new HashSet<Orders>(0);
	private Set<Ads> adses = new HashSet<Ads>(0);
	private Set<Users> userses = new HashSet<Users>(0);
	private Set<Proxyperson> proxypersons = new HashSet<Proxyperson>(0);
	private Set<Share> shares = new HashSet<Share>(0);
	private Set<Collections> collectionses = new HashSet<Collections>(0);
	private Set<Consigneeinfo> consigneeinfos = new HashSet<Consigneeinfo>(0);
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
			String local, Set<Orders> ordersesForUserid,
			Set<Orders> ordersesForPayid, Set<Ads> adses, Set<Users> userses,
			Set<Proxyperson> proxypersons, Set<Share> shares,
			Set<Collections> collectionses, Set<Consigneeinfo> consigneeinfos,
			Set<Goods> goodses, Set<Proxys> proxyses,
			Set<Shoppingcart> shoppingcartsForSellerid,
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
		this.ordersesForUserid = ordersesForUserid;
		this.ordersesForPayid = ordersesForPayid;
		this.adses = adses;
		this.userses = userses;
		this.proxypersons = proxypersons;
		this.shares = shares;
		this.collectionses = collectionses;
		this.consigneeinfos = consigneeinfos;
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

	@Column(name = "integral", nullable = false, insertable = false, updatable = false )
	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	@Column(name = "userclass", nullable = false, length = 10, insertable = false, updatable = false )
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

	@Column(name = "version", nullable = false, insertable = false, updatable = false )
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usersByUserid")
	public Set<Orders> getOrdersesForUserid() {
		return this.ordersesForUserid;
	}

	public void setOrdersesForUserid(Set<Orders> ordersesForUserid) {
		this.ordersesForUserid = ordersesForUserid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usersByPayid")
	public Set<Orders> getOrdersesForPayid() {
		return this.ordersesForPayid;
	}

	public void setOrdersesForPayid(Set<Orders> ordersesForPayid) {
		this.ordersesForPayid = ordersesForPayid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Ads> getAdses() {
		return this.adses;
	}

	public void setAdses(Set<Ads> adses) {
		this.adses = adses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Proxyperson> getProxypersons() {
		return this.proxypersons;
	}

	public void setProxypersons(Set<Proxyperson> proxypersons) {
		this.proxypersons = proxypersons;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Share> getShares() {
		return this.shares;
	}

	public void setShares(Set<Share> shares) {
		this.shares = shares;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Collections> getCollectionses() {
		return this.collectionses;
	}

	public void setCollectionses(Set<Collections> collectionses) {
		this.collectionses = collectionses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Consigneeinfo> getConsigneeinfos() {
		return this.consigneeinfos;
	}

	public void setConsigneeinfos(Set<Consigneeinfo> consigneeinfos) {
		this.consigneeinfos = consigneeinfos;
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