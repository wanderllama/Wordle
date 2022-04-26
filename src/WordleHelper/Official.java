package WordleHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static WordleHelper.GUIRun.words;

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
        JPanel fieldPanel = new JPanel();
        b1 = new JButton("*       not in word       *");b2 = new JButton("*       not in word       *");b3 = new JButton("*       not in word       *");b4 = new JButton("*       not in word       *");b5 = new JButton("*       not in word       *");
        submit = new JButton("Submit");
        text = new JTextArea(10 , 20);
        field = new JTextField(5);
        text.setLineWrap(true);
        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);field.addActionListener(this);submit.addActionListener(this);
        frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);frame.add(submit);
        frame.setLayout(new java.awt.FlowLayout());
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);
        fieldPanel.add(field);
        frame.add(fieldPanel);
        frame.getContentPane().add(BorderLayout.CENTER , panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300,250);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b1) {
            click1++;
            if (click1 == 3) {
                click1 = 0;
            }
            change(b1 , click1);
        }
        if (event.getSource() == b2) {
            click2++;
            if (click2 == 3) {
                click2 = 0;
            }
            change(b2 , click2);
        }
        if (event.getSource() == b3) {
            click3++;
            if (click3 == 3) {
                click3 = 0;
            }
            change(b3 , click3);
        }
        if (event.getSource() == b4) {
            click4++;
            if (click4 == 3) {
                click4 = 0;
            }
            change(b4 , click4);
        }
        if (event.getSource() == b5) {
            click5++;
            if (click5 == 3) {
                click5 = 0;
            }
            change(b5 , click5);
        }
        String str = field.getText();
        text.append(str + "\n");
        if (event.getSource() == submit) {
            text.append(str+ "\n");
            ArrayList<String> list = new ArrayList<>(words(str, click1, click2, click3, click4, click5));
            for (String element : list) {
                text.append(element + "\n");
            }
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