package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coder {
    @Id
    private int cid;
    private String cname;
    private String tech;
    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
