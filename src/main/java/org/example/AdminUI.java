package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminUI {
    static GraphicsConfiguration gc;
    private JLabel label[] = new JLabel[2];
    private GridLayout gl = new GridLayout(2,1);
    private JFrame frame = new JFrame(gc);
    private Patient1 p1 = new Patient1();
    private Patient2 p2 = new Patient2();
    public AdminUI(){
        frame.setSize(800,200);
        label[0] = new JLabel();
        label[1] = new JLabel();

        label[0].setText("Patient: "+p1.get_name()+": MRI: "+p1.get_fs()+", "+p1.get_date().toString()+": BP"+p1.get_Dur()+", "+p1.get_MD().toString());
        label[1].setText("Patient: "+p2.get_name()+": MRI: "+p2.get_fs()+", "+p2.get_date().toString()+": BP"+p2.get_Dur()+", "+p2.get_MD().toString());

        frame.add(label[0]);
        frame.add(label[1]);
        frame.setLayout(gl);
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
