package com.ecommerce;

import java.math.BigDecimal;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "eproduct")
public class EProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long ID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ADDED")
    private Date dateAdded;

    @OneToMany(mappedBy = "eproduct", cascade = CascadeType.ALL)
    private List<Color> colors;

    @OneToMany(mappedBy = "eproduct", cascade = CascadeType.ALL)
    private Collection<ScreenSizes> screenSizes;

    @OneToMany(mappedBy = "eproduct", cascade = CascadeType.ALL)
    private Set<OS> os;

    @OneToMany(mappedBy = "eproduct", cascade = CascadeType.ALL)
    @MapKeyColumn(name = "ftype")
    private Map<String, Finance> finance;

    public EProduct() {
    }

    public long getID() {return this.ID; }
    public String getName() { return this.name;}
    public BigDecimal getPrice() { return this.price;}
    public Date getDateAdded() { return this.dateAdded;}
    public List<Color> getColors() { return this.colors;}
    public Collection<ScreenSizes> getScreensizes() { return this.screenSizes;}
    public Set<OS> getOs() { return this.os;}
    public Map<String, Finance> getFinance() {return finance;}
    
    public void setID(long id) { this.ID = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(BigDecimal price) { this.price = price;}
    public void setDateAdded(Date date) { this.dateAdded = date;}
    public void setColors(List<Color> colors) { this.colors = colors;}
    public void setScreensizes(Collection<ScreenSizes> sizes) { this.screenSizes = sizes;}
    public void setOs(Set<OS> os) { this.os = os;}
    public void setFinance(Map<String,Finance> finance) { this.finance = finance;}
       
}
