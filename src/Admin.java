import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Admin implements ActionListener {
    JFrame frame = new JFrame();
    JButton logout = new JButton("Logout");
    JButton accounts = new JButton("Accounts");

    Admin() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(1,2,1,1));
        accounts.addActionListener(this);
        accounts.setActionCommand("a");
        frame.add(accounts);
        logout.addActionListener(this);
        logout.setActionCommand("l");
        frame.add(logout);
        frame.pack();
        frame.setSize(500,200);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("a")) {
            frame.remove(logout);
            frame.remove(accounts);
            frame.setVisible(false);
            frame.pack();
            new AdminView();
        }
        if(e.getActionCommand().equals("l")) {
            frame.remove(logout);
            frame.remove(accounts);
            frame.setVisible(false);
            frame.pack();
            new Login();
        }
    }
}
