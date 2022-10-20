package our_fields;

import spil.Konto;

import java.awt.*;

public class GUI_ColdDessert extends GUI_Custom{
    public GUI_ColdDessert(Color bgColor, Color fgColor, String title, String subText, String description) {
        super(bgColor, fgColor, title, subText, description);
    }

    @Override
    public Konto hit(Konto konto) {
        konto.update(-20);
        return konto;

    }
}
