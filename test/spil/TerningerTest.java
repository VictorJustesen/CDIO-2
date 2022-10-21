package spil;

public class TerningerTest {

    public static void main(String[] args) {

        int samme = 0;
        int[] antal = new int[6];
        int[] sum = new int[12];
        for (int i= 0; i < 1000; i++)
        //bruger samme rulle metode som fra spillet
        {
           int t1 =Terninger.slaEnTerning();
            int t2 = Terninger.slaEnTerning();

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
            System.out.println("Antal "+(i+1)+ ": "+antal[i]+" Fejlmargen er "+ (((2000.0/6)-antal[i])/(2000.0))*100.0) ;

        }
        System.out.println( "\nDer var "+samme+ " gange hvor terning 1 og 2 var det samme\n");
        System.out.println("Summen af de to terninger der slås");
        for (int i= 0; i< 12;i++)
        {

            System.out.println("Sum "+(i+1)+ ": "+sum[i]) ;

        }
    }
}

