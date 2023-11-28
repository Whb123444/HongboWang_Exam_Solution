package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class AdminUI extends JPanel{
    static GraphicsConfiguration gc;
    private JLabel label[] = new JLabel[8];
    private GridLayout gl = new GridLayout(2,8);
    private JFrame frame = new JFrame(gc);
    private URL imageURL = null;
    private Patient1 p1;
    private Patient2 p2;
    public AdminUI(){
        frame.setSize(1600,900);
        for(int i = 0; i <= 7; i++){
            label[i] = new JLabel();
            add(label[i]);

        }

        try{
            imageURL = new URL(p1.get_patientPic());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label[0].setIcon(thisImageIcon);


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
