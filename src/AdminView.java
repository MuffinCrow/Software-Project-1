import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AdminView implements ActionListener{
    JFrame frame = new JFrame();
    JButton back = new JButton("Back");
    JButton next = new JButton("Next");
    JButton prev = new JButton("Prev");
    JLabel first = new JLabel("First Name");
    JLabel last = new JLabel("Last Name");
    JLabel mail = new JLabel("Email");
    JLabel phone = new JLabel("Phone Number");
    JLabel balance = new JLabel("Balance");
    JLabel admin = new JLabel("Admin");
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JLabel f,l,m,ph,b,a,u,pa;
    boolean check = true;
    int accNum = -1;
    int dataInt = 0;

    AdminView() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(0,8,1,1));
        back.addActionListener(this);
        back.setActionCommand("b");
        frame.add(first);frame.add(last);frame.add(mail);frame.add(phone);
        frame.add(balance);frame.add(admin);frame.add(user);frame.add(pass);
        do {
            accNum++;
            change();
            if (Data.accountCheck(accNum + 1) == false) {
                accNum = -1;
            }
        } while (accNum > -1);
     //   next.addActionListener(this);
     //   next.setActionCommand("n");
     //   prev.addActionListener(this);
     //   prev.setActionCommand("p");
        frame.add(back);
       // frame.add(prev);
       // frame.add(next);
        frame.pack();
        frame.setSize(2000,500);
    }

    public void change() {
        f = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt++;
        l = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt++;
        m = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt++;
        ph = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt++;
        b = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt++;
        a = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt++;
        u = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt++;
        pa = new JLabel(Data.dataInsert(accNum, dataInt)); dataInt = 0;
        frame.add(f); frame.add(l);frame.add(m);frame.add(ph);
        frame.add(b);frame.add(a);frame.add(u);frame.add(pa);
    }

    public void remove() {
        frame.remove(f); frame.remove(l); frame.remove(m); frame.remove(ph);
        frame.remove(b); frame.remove(a); frame.remove(u); frame.remove(pa);
        frame.remove(first); frame.remove(last); frame.remove(mail); frame.remove(phone);
        frame.remove(balance); frame.remove(admin); frame.remove(user); frame.remove(pass);
        frame.remove(back); frame.remove(prev); frame.remove(next);
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "n":
                if (Data.accountCheck(accNum + 1) == true) {
                    accNum++;
                }
                frame.dispose();
                remove();
                change();
                break;
            case "p":
                if (accNum > 0) {
                    accNum -= 1;
                }
                frame.dispose();
                change();
                break;
            case "b":
                frame.dispose();
                frame.pack();
                new Admin();
                System.out.print("Press");
                break;
        }
    }
}
