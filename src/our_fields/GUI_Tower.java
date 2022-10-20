package our_fields;

import gui_codebehind.GUI_Center;
import gui_codebehind.SwingComponentFactory;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import spil.Konto;

import javax.swing.*;
import java.awt.*;

public class GUI_Tower extends GUI_Custom {
    public GUI_Tower(Color bgColor, Color fgColor, String title, String subText, String description) {
        super(bgColor, fgColor, title, subText, description);
    }

    @Override
    public Konto hit(Konto konto) {
        konto.update(+250);
        return konto;

    }
}
