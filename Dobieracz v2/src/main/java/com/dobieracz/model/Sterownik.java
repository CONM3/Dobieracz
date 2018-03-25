package com.dobieracz.model;

import java.util.Objects;

/**
 * 
 *
 * @since Mar 24, 2018, 11:20:34 AM
 * @author Grzegorz Brodowski
 */
public class Sterownik {
    private String nazwa;
    private double vBO;
    private double vAO;
    private double vBI;
    private double vAI;
    
    private String type;
    private String subtype;

    public Sterownik(String nazwa, double vBO, double vAO, double vBI, double vAI, String type, String subtype) {
        this.nazwa = nazwa;
        this.vBO = vBO;
        this.vAO = vAO;
        this.vBI = vBI;
        this.vAI = vAI;
        this.type = type;
        this.subtype = subtype;
    }

    @Override
    public String toString() {
        return "Sterownik{" + "nazwa=" + nazwa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nazwa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Sterownik other = (Sterownik) obj;
        if (!Objects.equals(this.nazwa, other.nazwa))
            return false;
        return true;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getvBO() {
        return vBO;
    }

    public void setvBO(double vBO) {
        this.vBO = vBO;
    }

    public double getvAO() {
        return vAO;
    }

    public void setvAO(double vAO) {
        this.vAO = vAO;
    }

    public double getvBI() {
        return vBI;
    }

    public void setvBI(double vBI) {
        this.vBI = vBI;
    }

    public double getvAI() {
        return vAI;
    }

    public void setvAI(double vAI) {
        this.vAI = vAI;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

}