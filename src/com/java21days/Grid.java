package com.java21days;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    Dimension dim = new Dimension(500, 500);

    Grid(String title, String[] buttons, int rows, int columns){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(rows, columns);
        panel.setLayout(gridLayout);
        JButton[] jButtons = createButtons(buttons);
        addButtons(panel, jButtons);
        add(panel);
        setVisible(true);
        pack();
    }

    JButton[] createButtons(String[] buttons){
        JButton[] jButtons = new JButton[buttons.length];
        int i = 0;
        for( String text : buttons ){
            JButton btn = new JButton(text);
            jButtons[i] = btn;
            i++;
        }
        return jButtons;
    }

    void addButtons(JPanel panel, JButton[] jButtons){
        for( JButton jButton : jButtons ){
            panel.add(jButton);
        }
    }
}
