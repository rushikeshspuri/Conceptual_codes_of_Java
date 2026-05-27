 import javax.swing.*;
 import java.awt.event.*;
 
 class GUIButtonListner
{
    public static void main(String A[]) 
    {
        JFrame fobj = new JFrame("Marvellous PPA"); // taat
        JButton bobj = new JButton("OK");       // vati/ button
        
        bobj.setBounds(100,100,150,50); // vati chi size
        
        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj) // ActionListener sangnar machar chavla
            {
                System.out.println("Button Clicked");
            }
        });

        fobj.add(bobj); // tatat vati
        
        fobj.setSize(400,300);  // tatachi size

        fobj.setLayout(null);

        fobj.setVisible(true); 
        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
