import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Main {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Action Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final Action printAction = new PrintHelloAction();

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        menu.add(new JMenuItem(printAction));

        JToolBar toolbar = new JToolBar();
        toolbar.add(new JButton(printAction));

        JButton enableButton = new JButton("Enable");
        ActionListener enableActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                printAction.setEnable(true);
            }
        };
        enableButton.addActionListener(enableAtionListener);

        JButton disableButton = new JButton("Disable");
        ActionListener disableActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                printAction.setEnable(false);
            }
        };
        disableButton.addActionListener(disableActionListener);

        JButton relableButton = new JButton("Relable");
        ActionListener relabelActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                printAction.putValue(Action.NAME, "Hello, World");
            }
        };
        relableButton.addActionListener(relabelActionListener);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(enableButton);
        buttonPanel.add(disableButton);
        buttonPanel.add(relableButton);

        frame.setJMenuBar(menuBar);

        frame.add(toolbar. BorderLayout.SOUTH);
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}

class PrintHelloAction extends AbstractAction {

    PrintHelloAction() {
        super("Print");
        putValue(Action.SHORT_DESCRIPTION, "Hello, world");
    }

    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Hello, World!!!");
    }
}