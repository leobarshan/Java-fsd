package com.ecommerce;

import javax.persistence.*;

@Entity
@Table(name = "os")
public class OS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long OSID;

    @Column(name = "NAME")
    private String name;

    public OS() {
    }

    public OS(String name) {
        this.OSID = 0;
        this.name = name;
    }

    public long getOSID() {
        return this.OSID;
    }

    public String getName() {
        return this.name;
    }

    public void setOSID(long id) {
        this.OSID = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
