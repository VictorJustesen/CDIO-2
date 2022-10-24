package spil;
import java.io.*;

import org.junit.Test;
import our_fields.GUI_Custom;

import java.util.Random;

import static org.junit.Assert.*;
import static spil.Terninger.slaEnTerning;

public class TerningerTest {
// test af om terningerul med 1 terning giver øjensum 1-6
    @Test
    public void TestSlaEnTerning () {
for(int i=0;i<200;i++){
        Terninger tester = new Terninger();
if((slaEnTerning()<1)||(slaEnTerning()>6)){
fail("fail");    }}


//rul med to terninger 1000 gange, for at tjekke om øjensummen er normalfordelt
        Terninger tester = new Terninger();
    int samme = 0;
    int[] antal = new int[6];
    int[] sum = new int[12];
    for (int i= 0; i < 1000; i++)
    //bruger samme rulle metode som fra spillet
    {
        int t1 = slaEnTerning();
        int t2 = slaEnTerning();

        antal[t1-1] +=1;
        antal[t2-1] +=1;
        sum[t1+t2-1] +=1;
        if (t1 == t2)
        {
            samme+=1 ;
        }
    }
    for (int i= 0; i< 6;i++)
    {
        System.out.print("Antal "+(i+1)+ ": "+antal[i]+" Fejlmargen er ") ;
        System.out.format("%.2f",(((2000.0/6)-antal[i])/(2000.0))*100.0);
        System.out.print(" %\n");

    }
    System.out.println( "\nDer var "+samme+ " gange hvor terning 1 og 2 var det samme\n");
    System.out.println("Summen af de to terninger der slås");
    for (int i= 0; i< 12;i++)
    {

        System.out.println("Sum "+(i+1)+ ": "+sum[i]) ;

    }

        }
}

