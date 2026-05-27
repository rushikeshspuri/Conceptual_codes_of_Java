 import javax.swing.*;
 
 class GUIButtonX
{
    public static void main(String A[]) 
    {
        JFrame fobj = new JFrame("Marvellous PPA"); // taat
        JButton bobj = new JButton("OK");       // vati/ button
        
        bobj.setBounds(100,100,150,50);
        
        fobj.add(bobj); // tatat vati
        
        fobj.setSize(400,300);  // tatachi size

        fobj.setLayout(null);

        fobj.setVisible(true); 
        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
