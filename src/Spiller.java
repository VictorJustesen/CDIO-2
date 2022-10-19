import gui_fields.GUI_Player;
import gui_main.GUI;

public class Spiller {
    private int pos=0;
    private int balance=0;

    private String name;
    public Spiller(String name, int bal, int postiotion)
    {
        Konto konto = new Konto(bal);
        pos = postiotion;
        balance= bal;
        this.name = name;

    }
    //Getter
    public int Spillerbalance()
    {
        return balance;
    }
    public void tilføjspillerGui(GUI gui)
    {
        GUI_Player player = new GUI_Player(name,balance);
        gui.addPlayer(player);
    }

    }

