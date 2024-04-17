package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    
    public EProduct() {
        
    }
    
    public EProduct(long id, String name, BigDecimal price, Date dateAdded) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.dateAdded = dateAdded;
    }
    
    public long getID() {
        return this.ID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public Date getDateAdded() {
        return this.dateAdded;
    }
    
    public void setID(long id) {
        this.ID = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public void setDateAdded(Date date) {
        this.dateAdded = date;
    }
}
