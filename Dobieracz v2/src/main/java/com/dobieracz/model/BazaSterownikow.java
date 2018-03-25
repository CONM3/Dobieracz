package com.dobieracz.model;

import java.util.ArrayList;

/**
 * 
 *
 * @since Mar 24, 2018, 11:20:04 AM
 * @author Grzegorz Brodowski
 */
public class BazaSterownikow {
    private ArrayList<Sterownik> sterowniki=new ArrayList<>();
    
    public void addSterownik(Sterownik sterownik){
        if(!sterowniki.contains(sterownik)){
            sterowniki.add(sterownik);
        }
    }
    
    public void pokazSterowniki(){
        for(Sterownik s:sterowniki){
            s.toString();
        }
    }
    
    public void removeSterownik(Sterownik sterownik){
        if(sterowniki.contains(sterownik)){
            sterowniki.remove(sterownik);
        }
    }

    public ArrayList<Sterownik> getSterowniki() {
        return sterowniki;
    }
    
}