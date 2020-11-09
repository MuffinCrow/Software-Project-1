import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Customer implements ActionListener {
    JFrame frame = new JFrame();
    JButton d = new JButton("Deposit");
    JButton w = new JButton("Withdraw");
    JButton logout = new JButton("Logout");

    Customer() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(1,3,1,1));
        d.addActionListener(this);
        d.setActionCommand("d");
        w.addActionListener(this);
        w.setActionCommand("w");
        logout.addActionListener(this);
        logout.setActionCommand("l");
        frame.add(d); frame.add(w); frame.add(logout);
        frame.pack();
        frame.setSize(750,200);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("d")) {
            frame.dispose();
            new Deposit();
        }
        if(e.getActionCommand().equals("w")) {
            frame.dispose();
            new Withdraw();
        }
        if(e.getActionCommand().equals("l")) {
            frame.dispose();
            new Login();
        }
    }
}
