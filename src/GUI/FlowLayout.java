package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayout implements ActionListener {
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");

    int click1 = 0;
    int click2 = 0;
    int click3 = 0;
    int click4 = 0;
    int click5 = 0;

    public static void main(String[] args) {
        FlowLayout gui = new FlowLayout();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();

        b1 = new JButton("Not In Word");b2 = new JButton("Not In Word");b3 = new JButton("Not In Word");b4 = new JButton("Not In Word");b5 = new JButton("Not In Word");

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);

        frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);

        frame.setLayout(new java.awt.FlowLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,300);
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
    }

    public static void change(JButton button , int click) {
        if (click == 1) {
            button.setText("in word but not this spot");
        } else if (click == 2) {
            button.setText("in word and in this spot");
        } else {
            button.setText("not in word");
        }
    }
}
