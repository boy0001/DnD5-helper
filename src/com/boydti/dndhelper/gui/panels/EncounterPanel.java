package com.boydti.dndhelper.gui.panels;

import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EncounterPanel implements IPanel
{
    @Override
    public JComponent getPanel()
    {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel("Some text");
        filler.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    @Override
    public String getName()
    {
        return "Encounter";
    }
}
