package com.boydti.dndhelper.gui;

import javax.swing.JFrame;

public class SimpleGui extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = -3940775487531219851L;

    public SimpleGui() {
        this.initUI();
    }

    private void initUI() {
        
        this.setTitle("Simple gui example");
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}