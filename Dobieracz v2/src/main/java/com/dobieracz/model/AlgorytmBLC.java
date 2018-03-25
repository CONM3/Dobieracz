package com.dobieracz.model;

/**
 *
 *
 * @since Mar 24, 2018, 11:18:53 AM
 * @author Grzegorz Brodowski
 */
public class AlgorytmBLC {
    private double AI = 0;
    private double BI = 0;
    private double AO = 0;
    private double BO = 0;

    private int vBLC = 0;
    private int vDFM400 = 0;

    private double nAI = 0;
    private double nBIBO = 0;
    private double nAO = 0;

    private double rezerwa = 0;

    public AlgorytmBLC(double AI, double BI, double AO, double BO) {
        this.AI = AI;
        this.AO=AO;
        this.BI = BI;
        this.BO = BO;
        wyliczBLC();
        wyliczRezerwe();
    }

    public void wyliczBLC() {
        if (AO < 1 && AI < 5) {
            vBLC = (int) Math.ceil((BI + BO) / 24);
            if (AI > 1)
                vDFM400 = 1;
            else
                vDFM400 = 0;
        } else {
            vBLC = 0;
            vDFM400 = 0;
            nAI = 0;
            nBIBO = 0;
            nAO = 0;
            rezerwa = 0;
        }

    }

    public void wyliczRezerwe() {
        if ((vBLC + vDFM400) > 0) {
            rezerwa = (AI + BI + BO) / (vBLC * 24 + vDFM400 * 4);
            if (vBLC > 0)
                nBIBO = vBLC * 24 - (BI + BO);
            else
                nBIBO = 0;
            if (vDFM400 > 0)
                nAI = 4 - AI;  
            else
                nAI = 0;
        } else {
            rezerwa = 0;
            nBIBO = 0;
            nAI = 0;
        }
    }

    public double wyliczCene(double cenaBLC, double cenaDFM400) {
        double cena = vBLC * cenaBLC + vDFM400 * cenaDFM400;
        return cena;
    }

    public int getvBLC() {
        return vBLC;
    }

    public int getvDFM400() {
        return vDFM400;
    }

    public double getnAI() {
        return nAI;
    }

    public double getnBIBO() {
        return nBIBO;
    }

    public double getRezerwa() {
        return rezerwa;
    }

    @Override
    public String toString() {
        return "AlgorytmBLC{" + "AI=" + AI + ", BI=" + BI + ", AO=" + AO + ", BO=" + BO + ", vBLC=" + vBLC + ", vDFM400=" + vDFM400 + ", nAI=" + nAI + ", nBIBO=" + nBIBO + ", nAO=" + nAO + ", rezerwa=" + rezerwa + '}';
    }
    

}
