package com.dobieracz;

import com.dobieracz.model.BazaSterownikow;
import com.dobieracz.model.Sterownik;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * 
 *
 * @since Mar 24, 2018, 11:39:38 AM
 * @author Grzegorz Brodowski
 */
public class AddSterownikTest {
    
    @Test
    public void stworzObiekt(){
        Sterownik s=new Sterownik("dac1146");
        BazaSterownikow baza=new BazaSterownikow();
        baza.addSterownik(s);
        assertFalse(baza.getSterowniki().isEmpty());
        baza.pokazSterowniki();
        baza.removeSterownik(s);
        baza.pokazSterowniki();
        assertTrue(baza.getSterowniki().isEmpty());
    }

}