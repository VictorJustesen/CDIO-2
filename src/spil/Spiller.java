package spil;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import our_fields.GUI_Custom;
import spil.Konto;

public class Spiller {
    private int pos=0;
    Konto konto = new Konto(0);
    Terninger terninger = new Terninger();
    GUI_Player pl;
    GUI_Field fpos;
    private String name;
    public Spiller(String name, int bal, int postiotion)
    {
        konto.update(bal);
        pos = postiotion;

        this.name = name;

    }
    //Getter
    public void tilføjspillerGui(GUI gui)
    {
        GUI_Player player = new GUI_Player(name,konto.getBalance());
        gui.addPlayer(player);
        GUI_Field field = gui.getFields()[pos];
        field.setCar(player,true);
        fpos = field;
        pl=player;
    }
    public Konto getKonto(){

        return konto;
    }
    public void spil(GUI gui, GUI_Custom[] fields)
    {
        if (gui.getUserButtonPressed(name+" Press button to roll dice","Roll Dice")=="Roll Dice")
        {
            int t1 = terninger.slaEnTerning();
            int t2 = terninger.slaEnTerning();
            int tsum = t1+t2;
            gui.setDice(t1,t2);
            setCar(tsum,gui);
            konto = fields[tsum].hit(konto);
            pl.setBalance(konto.getBalance());
            if (konto.getBalance()>=3000)
            {
                if (gui.getUserButtonPressed(name+" Vandt spillet tryk ok for at afslutte","ok")=="ok")
                {
                  System.exit(0);
                }

            }
        }
    }
    public void setCar(int tsum,GUI gui)
    {
        fpos.setCar(pl,false);
        GUI_Field felt = gui.getFields()[tsum];
        felt.setCar(pl,true);
        fpos = gui.getFields()[tsum];
    }

    }

