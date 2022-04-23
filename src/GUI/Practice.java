package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice implements ActionListener {

    JTextArea text;
    JTextField field;

    public static void main(String[] args) {
        Practice gui = new Practice();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me");

        text = new JTextArea(10 , 20);
        field = new JTextField();
        text.setLineWrap(true);

        field.addActionListener(this);
        button.addActionListener(this);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER , panel);
        frame.getContentPane().add(BorderLayout.SOUTH , button);
        frame.getContentPane().add(BorderLayout.NORTH , field);

        frame.setSize(350 , 350);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        String str = field.getText();
        text.append(work(str) + "\n");
    }

    public String work(String str) {
        return str + str;
    }
}