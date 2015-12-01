package com.test.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
 * Goods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "goods", catalog = "worktest")
public class Goods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Proxys proxys;
	private Users users;
	private String goodsname;
	private double marketvalue;
	private double mallvalue;
	private double pv;
	private String desc;
	private Date releasetime;
	private Integer totalnum;
	private Integer salenum;
	private String property;
	private String smallproperty;
	private String bigproperty;
	private String goodsurl;
	private String paymode;
	private Integer craze;
	private String source;
	private Integer niceinfo;
	private Integer pvscore;
	private double costvalue;
	private Integer version;
	private String province;
	private String city;
	private String area;
	private String local;
	private Set<Cartgoods> cartgoodses = new HashSet<Cartgoods>(0);
	private Set<Ordergoods> ordergoodses = new HashSet<Ordergoods>(0);
	private Set<Share> shares = new HashSet<Share>(0);
	private Set<Collections> collectionses = new HashSet<Collections>(0);
	private List<Goodspics> goodspicses = new ArrayList<Goodspics>(0);
	private Set<Shoppingcart> shoppingcarts = new HashSet<Shoppingcart>(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Proxys proxys, Users users, String goodsname,
			double marketvalue, double mallvalue, double pv, Date releasetime,
			Integer totalnum, Integer salenum, String smallproperty,
			String bigproperty, String goodsurl, String paymode, Integer craze,
			Integer niceinfo, Integer pvscore, double costvalue,
			Integer version, String province, String city, String area,
			String local) {
		this.proxys = proxys;
		this.users = users;
		this.goodsname = goodsname;
		this.marketvalue = marketvalue;
		this.mallvalue = mallvalue;
		this.pv = pv;
		this.releasetime = releasetime;
		this.totalnum = totalnum;
		this.salenum = salenum;
		this.smallproperty = smallproperty;
		this.bigproperty = bigproperty;
		this.goodsurl = goodsurl;
		this.paymode = paymode;
		this.craze = craze;
		this.niceinfo = niceinfo;
		this.pvscore = pvscore;
		this.costvalue = costvalue;
		this.version = version;
		this.province = province;
		this.city = city;
		this.area = area;
		this.local = local;
	}

	/** full constructor */
	public Goods(Proxys proxys, Users users, String goodsname,
			double marketvalue, double mallvalue, double pv, String desc,
			Date releasetime, Integer totalnum, Integer salenum,
			String property, String smallproperty, String bigproperty,
			String goodsurl, String paymode, Integer craze, String source,
			Integer niceinfo, Integer pvscore, double costvalue,
			Integer version, String province, String city, String area,
			String local, Set<Cartgoods> cartgoodses,
			Set<Ordergoods> ordergoodses, Set<Share> shares,
			Set<Collections> collectionses, List<Goodspics> goodspicses,
			Set<Shoppingcart> shoppingcarts) {
		this.proxys = proxys;
		this.users = users;
		this.goodsname = goodsname;
		this.marketvalue = marketvalue;
		this.mallvalue = mallvalue;
		this.pv = pv;
		this.desc = desc;
		this.releasetime = releasetime;
		this.totalnum = totalnum;
		this.salenum = salenum;
		this.property = property;
		this.smallproperty = smallproperty;
		this.bigproperty = bigproperty;
		this.goodsurl = goodsurl;
		this.paymode = paymode;
		this.craze = craze;
		this.source = source;
		this.niceinfo = niceinfo;
		this.pvscore = pvscore;
		this.costvalue = costvalue;
		this.version = version;
		this.province = province;
		this.city = city;
		this.area = area;
		this.local = local;
		this.cartgoodses = cartgoodses;
		this.ordergoodses = ordergoodses;
		this.shares = shares;
		this.collectionses = collectionses;
		this.goodspicses = goodspicses;
		this.shoppingcarts = shoppingcarts;
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
	@JoinColumn(name = "markeid", nullable = false)
	public Proxys getProxys() {
		return this.proxys;
	}

	public void setProxys(Proxys proxys) {
		this.proxys = proxys;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releaseuser", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "goodsname", nullable = false, length = 30)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "marketvalue", nullable = false, precision = 20)
	public double getMarketvalue() {
		return this.marketvalue;
	}

	public void setMarketvalue(double marketvalue) {
		this.marketvalue = marketvalue;
	}

	@Column(name = "mallvalue", nullable = false, precision = 20)
	public double getMallvalue() {
		return this.mallvalue;
	}

	public void setMallvalue(double mallvalue) {
		this.mallvalue = mallvalue;
	}

	@Column(name = "pv", nullable = false, precision = 10, scale = 0)
	public double getPv() {
		return this.pv;
	}

	public void setPv(double pv) {
		this.pv = pv;
	}

	@Column(name = "desc", length = 80)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "releasetime", nullable = false, length = 0)
	public Date getReleasetime() {
		return this.releasetime;
	}

	public void setReleasetime(Date releasetime) {
		this.releasetime = releasetime;
	}

	@Column(name = "totalnum", nullable = false)
	public Integer getTotalnum() {
		return this.totalnum;
	}

	public void setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
	}

	@Column(name = "salenum", nullable = false)
	public Integer getSalenum() {
		return this.salenum;
	}

	public void setSalenum(Integer salenum) {
		this.salenum = salenum;
	}

	@Column(name = "property", length = 50)
	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	@Column(name = "smallproperty", nullable = false, length = 10)
	public String getSmallproperty() {
		return this.smallproperty;
	}

	public void setSmallproperty(String smallproperty) {
		this.smallproperty = smallproperty;
	}

	@Column(name = "bigproperty", nullable = false, length = 10)
	public String getBigproperty() {
		return this.bigproperty;
	}

	public void setBigproperty(String bigproperty) {
		this.bigproperty = bigproperty;
	}

	@Column(name = "goodsurl", nullable = false, length = 50)
	public String getGoodsurl() {
		return this.goodsurl;
	}

	public void setGoodsurl(String goodsurl) {
		this.goodsurl = goodsurl;
	}

	@Column(name = "paymode", nullable = false, length = 10)
	public String getPaymode() {
		return this.paymode;
	}

	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}

	@Column(name = "craze", nullable = false)
	public Integer getCraze() {
		return this.craze;
	}

	public void setCraze(Integer craze) {
		this.craze = craze;
	}

	@Column(name = "source", length = 20)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "niceinfo", nullable = false)
	public Integer getNiceinfo() {
		return this.niceinfo;
	}

	public void setNiceinfo(Integer niceinfo) {
		this.niceinfo = niceinfo;
	}

	@Column(name = "pvscore", nullable = false)
	public Integer getPvscore() {
		return this.pvscore;
	}

	public void setPvscore(Integer pvscore) {
		this.pvscore = pvscore;
	}

	@Column(name = "costvalue", nullable = false, precision = 10, scale = 0)
	public double getCostvalue() {
		return this.costvalue;
	}

	public void setCostvalue(double costvalue) {
		this.costvalue = costvalue;
	}

	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	@Column(name = "local", nullable = false, length = 15)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "goods")
	public Set<Cartgoods> getCartgoodses() {
		return this.cartgoodses;
	}

	public void setCartgoodses(Set<Cartgoods> cartgoodses) {
		this.cartgoodses = cartgoodses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "goods")
	public Set<Ordergoods> getOrdergoodses() {
		return this.ordergoodses;
	}

	public void setOrdergoodses(Set<Ordergoods> ordergoodses) {
		this.ordergoodses = ordergoodses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "goods")
	public Set<Share> getShares() {
		return this.shares;
	}

	public void setShares(Set<Share> shares) {
		this.shares = shares;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "goods")
	public Set<Collections> getCollectionses() {
		return this.collectionses;
	}

	public void setCollectionses(Set<Collections> collectionses) {
		this.collectionses = collectionses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "goods")
	public List<Goodspics> getGoodspicses() {
		return this.goodspicses;
	}

	public void setGoodspicses(List<Goodspics> goodspicses) {
		this.goodspicses = goodspicses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "goods")
	public Set<Shoppingcart> getShoppingcarts() {
		return this.shoppingcarts;
	}

	public void setShoppingcarts(Set<Shoppingcart> shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}

}