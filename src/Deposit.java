import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Deposit implements ActionListener {
    JFrame frame = new JFrame();
    JLabel b = new JLabel(String.valueOf(BankAccount.getBalance()));
    JTextField input = new JTextField();
    JButton back = new JButton("Back");
    JButton depo = new JButton("Deposit");

    Deposit() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,2,1,1));
        input.setBounds(0,0,15,20);
        back.addActionListener(this);
        back.setActionCommand("b");
        depo.addActionListener(this);
        depo.setActionCommand("d");
        frame.add(b);
        frame.add(input);
        frame.add(depo);
        frame.add(back);
        frame.pack();
        frame.setSize(1000,1000);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("b")) {
            frame.dispose();
            new Customer();
        }
        if(e.getActionCommand().equals("d")) {
            if(input.getText() != null) {
                BankAccount.setBalance(Double.valueOf(input.getText()));
            }
            frame.remove(b);
            frame.remove(input);
            frame.add(b,0);
            frame.add(input,1);
            frame.pack();
            frame.setSize(1000,1000);
        }
    }
}
