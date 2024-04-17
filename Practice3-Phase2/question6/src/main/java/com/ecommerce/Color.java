package com.ecommerce;

import javax.persistence.*;

@Entity
@Table(name = "colors")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long COLORID;

    @Column(name = "COLOR_NAME")
    private String name;

    public Color() {
    }

    public Color(String name) {
        this.COLORID = 0;
        this.name = name;
    }

    public long getCOLORID() {
        return this.COLORID;
    }

    public String getName() {
        return this.name;
    }

    public void setCOLORID(long id) {
        this.COLORID = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
