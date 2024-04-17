package com.ecommerce;

import javax.persistence.*;

@Entity
@Table(name = "screensizes")
public class ScreenSizes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long SCREENID;

    @Column(name = "SIZE")
    private String size;

    public ScreenSizes() {
    }

    public ScreenSizes(String size) {
        this.SCREENID = 0;
        this.size = size;
    }

    public long getSCREENID() {
        return this.SCREENID;
    }

    public String getSize() {
        return this.size;
    }

    public void setSCREENID(long id) {
        this.SCREENID = id;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
