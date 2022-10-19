import java.util.Random;

public class Terninger {
    public Terninger()
    {

    }
    public int slaEnTerning()
    {
        Random rand = new Random();
        return rand.nextInt(1,7);


    }
    public int slaMedBagret()
    {
      int t = 0;
      t=slaEnTerning()+slaEnTerning();
        return t;
    }
}
