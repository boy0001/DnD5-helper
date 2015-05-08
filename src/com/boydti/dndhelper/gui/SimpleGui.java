package com.boydti.dndhelper.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.boydti.dndhelper.gui.panels.EncounterPanel;
import com.boydti.dndhelper.gui.panels.PlayersPanel;
import com.boydti.dndhelper.gui.panels.RollsPanel;

public class SimpleGui extends JFrame {
    public SimpleGui()
    {
        this.initUI();
    }
    private void initUI()
    {
        this.setupWindow();
        
        JTabbedPane tabs = this.setupTabs();
        RollsPanel rolls = new RollsPanel();
        this.setupLayout(tabs, rolls.getPanel());
    }
    
    private void setupWindow() {
        this.setTitle("Simple gui example");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
        UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", true);
    }
    
    private JTabbedPane setupTabs() {
        JTabbedPane tabs = new JTabbedPane();
        PlayersPanel players = new PlayersPanel();
        EncounterPanel encounter = new EncounterPanel();
        tabs.addTab(players.getName(), players.getPanel());
        tabs.addTab(encounter.getName(), encounter.getPanel());
        return tabs;
    }
    
    private void setupLayout(JComponent... args) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, args.length));
        double totalWidth = this.getSize().getWidth();
        double totalHeight = this.getSize().getHeight();
        double width = (totalWidth / 2);
        JPanel group = new JPanel(new BorderLayout());
        for (JComponent arg : args) {
            panel.add(arg);
        }
        
        
        this.add(panel);
    }
    
    private static JComponent newTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
}