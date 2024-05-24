package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI extends JFrame {
    public LoginUI(){
        JFrame frame = new JFrame("Stroke Investigation System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 3));

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        ButtonGroup roleGroup = new ButtonGroup();
        JRadioButton adminRadioButton = new JRadioButton("Admin");
        JRadioButton studentRadioButton = new JRadioButton("Doc");

        roleGroup.add(adminRadioButton);
        roleGroup.add(studentRadioButton);

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        frame.add(new JLabel("       User Name:"));
        frame.add(usernameField);
        frame.add(new JLabel("       Password:"));
        frame.add(passwordField);
        frame.add(adminRadioButton);
        frame.add(studentRadioButton);
        frame.add(loginButton);
        frame.add(registerButton);
//        JLabel textlabel = new JLabel("<html>Password and Username of Administrator and Doctor<br>are all Admin and Doc</html>");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                boolean isAdmin = adminRadioButton.isSelected();
                boolean isDoc = studentRadioButton.isSelected();

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter your username and password", "Hint", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (!isAdmin && !isDoc) {
                    JOptionPane.showMessageDialog(frame, "Please select a role", "Hint", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (isAdmin && username.equals("Admin") && password.equals("Admin")) {
                    JOptionPane.showMessageDialog(frame, "Admin Login");
                    dispose();
                    AdminUI adminui = new AdminUI();
                    return;
                }
                else if (isDoc && username.equals("Doc") && password.equals("Doc")) {
                    JOptionPane.showMessageDialog(frame, "Doc Login");
                    dispose();
                    DocUI docui = new DocUI();
                    return;
                };



            }


        });

        frame.setVisible(true);

    }
}
