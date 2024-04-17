package com.ecommerce;

import javax.persistence.*;

@Entity
@Table(name = "finance")
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long FINANCEID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FTYPE")
    private String ftype;

    public Finance() {
    }

    public Finance(String name, String ftype) {
        this.name = name;
        this.ftype = ftype;
    }

    public long getFINANCEID() {
        return this.FINANCEID;
    }

    public void setFINANCEID(long id) {
        this.FINANCEID = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFtype() {
        return this.ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }
}
