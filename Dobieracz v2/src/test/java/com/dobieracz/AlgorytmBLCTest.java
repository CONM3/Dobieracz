package com.dobieracz;

import com.dobieracz.model.AlgorytmBLC;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 
 *
 * @since Mar 25, 2018, 12:20:04 PM
 * @author Grzegorz Brodowski
 */
public class AlgorytmBLCTest {
    AlgorytmBLC blc;
    
    @Test
    public void wyliczBLCTest(){
        //(AI,BI,AO,BO)
        blc=new AlgorytmBLC(2, 10, 0, 0);
        assertEquals(blc.getvBLC(),1);
        assertEquals(blc.getvDFM400(),1);
        assertEquals((int)blc.getnAI(),2);
        assertEquals((int)blc.getnBIBO(),14);
        
        blc=new AlgorytmBLC(10, 10, 0, 0);
        assertEquals(blc.getvBLC(),0);
        assertEquals(blc.getvDFM400(),0);
        assertEquals((int)blc.getnAI(),0);
        assertEquals((int)blc.getnBIBO(),0);
        
        blc=new AlgorytmBLC(0, 53, 0, 0);
        assertEquals(blc.getvBLC(),3);
        assertEquals(blc.getvDFM400(),0);
        assertEquals((int)blc.getnAI(),0);
        assertEquals((int)blc.getnBIBO(),19);
        
        blc=new AlgorytmBLC(2, 10, 0, 10);
        assertEquals(blc.getvBLC(),1);
        assertEquals(blc.getvDFM400(),1);
        assertEquals((int)blc.getnAI(),2);
        assertEquals((int)blc.getnBIBO(),4);
        
        blc=new AlgorytmBLC(2, 10, 10, 0);
        assertEquals(blc.getvBLC(),0);
        assertEquals(blc.getvDFM400(),0);
        assertEquals((int)blc.getnAI(),0);
        assertEquals((int)blc.getnBIBO(),0);
        assertEquals((int)blc.wyliczCene(10, 20),0);
        
        blc=new AlgorytmBLC(2, 10, 0, 0);
        assertEquals(blc.getvBLC(),1);
        assertEquals(blc.getvDFM400(),1);
        assertEquals((int)blc.getnAI(),2);
        assertEquals((int)blc.getnBIBO(),14);
        assertEquals((int)blc.wyliczCene(10, 20),30);
        
    }

}