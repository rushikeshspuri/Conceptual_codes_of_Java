 import javax.swing.*;
 
 class GUIButton
{
    public static void main(String A[]) 
    {
        JFrame fobj = new JFrame("Marvellous PPA"); // taat
        fobj.setSize(400,300);  // tatachi size

        JButton bobj = new JButton("OK");       // vati/ button
        fobj.add(bobj); // tatat vati
        
        fobj.setLayout(null);

        fobj.setVisible(true); 
        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
