package com.boydti.dndhelper.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
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
        this.setupLayout(tabs, rolls.getPanel(), this);
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
    
    private void setupLayout(JComponent splitLeft, JComponent splitRight, JFrame parent) {
        JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,splitLeft, splitRight);

        
//        pane.setLayout(new GridLayout());
        pane.setOneTouchExpandable(true);
        pane.setDividerLocation(600);
        splitLeft.setMinimumSize(new Dimension(600, 0));
        splitRight.setMinimumSize(new Dimension(100, 0));
//        double totalWidth = this.getSize().getWidth();
//        double totalHeight = this.getSize().getHeight();
//        double width = (totalWidth / 2);
        parent.add(pane);
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