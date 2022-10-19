package our_fields;

import gui_codebehind.GUI_Center;
import gui_codebehind.SwingComponentFactory;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;

import javax.swing.*;
import java.awt.*;

public class GUI_Custom extends GUI_Field {
    private static final int TITLEHEIGHT = 47;
    private static final int SUBTEXTHEIGHT = 14;
    private SwingComponentFactory factory;

    public GUI_Custom(Color bgColor, Color fgColor, String title, String subText, String description) {
        super(bgColor, fgColor, title, subText, description);
        this.factory = new SwingComponentFactory();
        this.titleLabel = this.makeTitleLabel(this.title);
        this.subTextLabel = this.makeSubTextLabel(this.subText);
        this.layered.add(this.titleLabel, this.factory.createGridBagConstraints(0, 0));
        this.layered.add(this.subTextLabel, this.factory.createGridBagConstraints(0, 1));
    }
    private JLabel makeTitleLabel(String titleStart) {
        JLabel l = this.makeLabel(47);
        l.setText(titleStart);
        l.setFont(new Font(l.getFont().getName(), 1, 10));
        return l;
    }

    private JLabel makeSubTextLabel(String subTextStart) {
        JLabel l = this.makeLabel(14);
        l.setText(subTextStart);
        return l;
    }

    protected void displayOnCenter(GUI_Player[] playerList) {
        super.displayOnCenter(playerList);
        GUI_Center.label[1].setText(this.title.replace("<html><center>", ""));
        GUI_Center.label[2].setText("__________________________");
        GUI_Center.label[3].setText(this.description);
        super.displayCarOnCenter(playerList);
    }

    public String toString() {
        return "GUI_Start [bgColor=" + this.bgColor + ", fgColor=" + this.fgColor + ", title=" + this.title + ", subText=" + this.subText + ", description=" + this.description + "]";
    }
}


