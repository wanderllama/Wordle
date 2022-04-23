package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.GUIRun.words;

public class Official implements ActionListener {
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton submit = new JButton("Submit");

    int click1 = 0;
    int click2 = 0;
    int click3 = 0;
    int click4 = 0;
    int click5 = 0;

    JTextArea text;
    JTextField field;

    public static void main(String[] args) {
        Official gui = new Official();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        b1 = new JButton("*       not in word       *");b2 = new JButton("*       not in word       *");b3 = new JButton("*       not in word       *");b4 = new JButton("*       not in word       *");b5 = new JButton("*       not in word       *");
        submit = new JButton("Submit");
        text = new JTextArea(10 , 20);
        field = new JTextField();
        text.setLineWrap(true);

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);field.addActionListener(this);submit.addActionListener(this);

        frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);frame.add(submit);
        frame.setLayout(new java.awt.FlowLayout());

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.NORTH , field);
        frame.getContentPane().add(BorderLayout.CENTER , panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,250);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            click1++;
            change(b1 , click1);
            if (click1 == 2) {
                click1 = -1;
            }
        }
        if (event.getSource() == b2) {
            click2++;
            change(b2 , click2);
            if (click2 == 2) {
                click2 = -1;
            }
        }
        if (event.getSource() == b3) {
            click3++;
            change(b3 , click3);
            if (click3 == 2) {
                click3 = -1;
            }
        }
        if (event.getSource() == b4) {
            click4++;
            change(b4 , click4);
            if (click4 == 2) {
                click4 = -1;
            }
        }
        if (event.getSource() == b5) {
            click5++;
            change(b5 , click5);
            if (click5 == 2) {
                click5 = -1;
            }
        }
        if (event.getSource() == submit) {
            String str = field.getText();
            words(str , click1 , click2 , click3 , click4 , click5);
        }
    }

    public static void change(JButton button , int click) {
        if (click == 1) {
            button.setText("*in word but not this spot*");
        } else if (click == 2) {
            button.setText("*in word and in this spot*");
        } else {
            button.setText("*       not in word       *");
        }
    }
}