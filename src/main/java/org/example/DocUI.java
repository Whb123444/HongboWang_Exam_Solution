package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class DocUI extends JPanel{
    static GraphicsConfiguration gc;
    private JLabel label[] = new JLabel[8];
    private JPanel panel[] = new JPanel[8];
    private GridLayout gl = new GridLayout(2,8);
    private JFrame frame = new JFrame(gc);
    private URL imageURL = null;
    private URL imageURL2 = null;
    private URL imageURL3 = null;
    private URL imageURL4 = null;
    private Patient1 p1 = new Patient1();
    private Patient2 p2 = new Patient2();
    private JPanel jp1 = new JPanel();
    private JPanel jp2 = new JPanel();
    public DocUI(){
        frame.setSize(1600,900);
        for(int i = 0; i <= 7; i++){
            label[i] = new JLabel();

        }


        try{
            imageURL = new URL(p1.get_patientPic());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);


        try{
            imageURL2 = new URL(p2.get_patientPic());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon2 = new ImageIcon(imageURL2);

        try{
            imageURL3 = new URL(p1.get_image());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon3 = new ImageIcon(imageURL3);

        try{
            imageURL4 = new URL(p2.get_image());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon4 = new ImageIcon(imageURL4);


        label[0].setIcon(thisImageIcon);
        label[1].setIcon(thisImageIcon2);
        label[2].setText("<html>"+"Name: "+p1.get_name()+"<br>"+"Age: "+p1.get_age()+"</html>");
        label[3].setText("<html>"+"Name: "+p2.get_name()+"<br>"+"Age: "+p2.get_age()+"</html>");
        label[4].setIcon(thisImageIcon3);
        label[5].setIcon(thisImageIcon4);
        label[6].setText("<html>"+"Blood pressure: <br>"+p1.get_Sys()+" over "+p1.get_Dia()+"</html>");
        label[7].setText("<html>"+"Blood pressure: <br>"+p2.get_Sys()+" over "+p2.get_Dia()+"</html>");


        frame.add(label[0]);
        frame.add(label[2]);
        frame.add(label[4]);
        frame.add(label[6]);
        frame.add(label[1]);
        frame.add(label[3]);
        frame.add(label[5]);
        frame.add(label[7]);


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
