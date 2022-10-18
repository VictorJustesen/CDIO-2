import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Start;
import gui_main.GUI;

import java.awt.*;

public class Spil {
    public static void main(String[] args) {
       GUI_Player player1 = new GUI_Player("zohan",1000);
     //  GUI_Field[] fields = new GUI_Field[13];

       player1.setBalance(1500);
        // Laver ét af hvert felt
        GUI_Field[] fields = {new GUI_Start(),new GUI_Tower(Color.black, Color.blue, "title", "Test 123", "Førstefelt")};
        GUI gui = new GUI(fields);
        gui.addPlayer(player1);
    }


}
