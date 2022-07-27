import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Welcome implements ActionListener {
    String s="";
    HashMap<String,String> h;
    JFrame frame=new JFrame();
    JLabel label=new JLabel();
    JButton button=new JButton("Back To Login Page");
    Welcome(String s,HashMap<String,String> h)
    {
        this.s=s;
        this.h=h;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("Welcome Page");

        label.setBounds(180,200,200,50);
        label.setText("Welcome "+s);

        button.setBounds(130,260,200,30);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            frame.dispose();
            Login login = new Login(h);
        }
    }
}
