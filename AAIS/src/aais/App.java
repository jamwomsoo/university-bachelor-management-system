package aais;

import javax.swing.JFrame;

public class App 
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame(":::Academic Affairs Information System v1.1:::");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close normal
        frame.setResizable(false); // can't control frame size
        
        PrimaryPanel primary = new PrimaryPanel();
		frame.getContentPane().add(primary);
		
		frame.pack();
		frame.setVisible(true);
		
    }//main()
}//App class
