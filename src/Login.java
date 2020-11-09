import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login implements ActionListener {
    JFrame frame = new JFrame();
    JTextField userName, passWord;
    JButton loginButton = new JButton("Login");
    JLabel label1 = new JLabel("Username: ");
    JLabel label2 = new JLabel("Password: ");
    JLabel incorrectInput = new JLabel("Incorrect Username/Password");
    boolean adminPrivC = false;

    Login() {
        setLayouts();
        createTextFields();
        createLoginButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,200);
        frame.setVisible(true);
    }

    public void setLayouts() {
        frame.setLayout(new GridLayout(3,2, 1, 1));
    }

    public void createTextFields() {
        frame.add(label1);
        userName = new JTextField();
        userName.setBounds(0,0,15,20);
        frame.add(userName);
        frame.add(label2);
        passWord = new JTextField();
        passWord.setBounds(0,0,15,20);
        frame.add(passWord);
    }

    public void createLoginButton() {
        loginButton.setSize(50, 50);
        frame.add(loginButton);
        loginButton.addActionListener(this);
    }

    public void clearLogin() {
        frame.remove(userName);
        frame.remove(passWord);
        frame.remove(incorrectInput);
        frame.remove(label1);
        frame.remove(label2);
        frame.remove(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Data.findUsername(userName.getText()) == true) {
            if (Data.checkPassword(userName.getText(), passWord.getText()) == true) {
                if (Data.checkPriv(userName.getText(), passWord.getText()) == true) {
                    clearLogin();
                    frame.setVisible(false);
                    frame.pack();
                    new Admin();
                } else {
                    clearLogin();
                    frame.setVisible(false);
                    frame.pack();
                    new Customer();
                }
            }
        } else {
            frame.add(incorrectInput);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setSize(500,200);
            frame.setVisible(true);
        }
    }
}
