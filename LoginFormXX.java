 import javax.swing.*;
 import java.awt.event.*;
 
 class MarvellousLogin //implements ActionListener
{
    public JFrame fobj; // taat , frame
    public JButton bobj; // button , vatti
    public JTextField tobj; // username
    public JPasswordField pobj; // password
    public JLabel UserLabel , PassLabel , ResultLabel;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(); // taat

        UserLabel = new JLabel("Username"); 
        UserLabel.setBounds(50,50,100,30);

        tobj = new JTextField();    //username
        tobj.setBounds(150,50,150,30);

        PassLabel = new JLabel("password"); 
        PassLabel.setBounds(50,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("SUBMIT");
        bobj.setBounds(150,150,100,30);

        ResultLabel = new JLabel("");
        ResultLabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(UserLabel);
        fobj.add(PassLabel);
        fobj.add(ResultLabel);

        fobj.setTitle(title);
        fobj.setSize(width,height);
        fobj.setVisible(true);

    }   
}

class LoginFormXX
{
    public static void main(String A[]) 
    {
       MarvellousLogin mobj = new MarvellousLogin("Marvellous Login",400,300);
    }
}