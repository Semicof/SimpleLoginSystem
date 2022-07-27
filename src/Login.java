import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login implements ActionListener {
    HashMap<String,String> h;
    JFrame frame=new JFrame();
    JButton loginBtn=new JButton("Login");
    JButton resetBtn=new JButton("Reset");
    JTextField idIn=new JTextField();
    JTextField passIn=new JTextField();
    JLabel idLabel=new JLabel("User Id: ");
    JLabel passLabel=new JLabel("User Password: ");
    JLabel messageLabel=new JLabel();
    Login(HashMap<String,String> h)
    {
        this.h=h;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,280);
        frame.setTitle("Login Page");
        frame.setResizable(false);
        frame.setLayout(null);

        idLabel.setBounds(30,30,100,30);
        passLabel.setBounds(30,90,100,30);

        idIn.setBounds(140,30,325,30);
        passIn.setBounds(140,90,325,30);

        loginBtn.setBounds(230,160,100,30);
        resetBtn.setBounds(350,160,100,30);
        loginBtn.setFocusable(false);
        resetBtn.setFocusable(false);
        loginBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        messageLabel.setBounds(180,180,200,70);

        frame.add(idLabel);
        frame.add(passLabel);
        frame.add(idIn);
        frame.add(passIn);
        frame.add(loginBtn);
        frame.add(resetBtn);
        frame.add(messageLabel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetBtn)
        {
            idIn.setText("");
            passIn.setText("");
        }
        if(e.getSource()==loginBtn)
        {
            String id=idIn.getText();
            String pass=passIn.getText();

            if(h.containsKey(id))
            {
                if(h.get(id).equals(pass))
                {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    Welcome welcome=new Welcome(id,h);
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Your password is incorrect!");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Your id is invalid!");
            }
        }
    }
}
