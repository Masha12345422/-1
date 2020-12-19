package Lab9;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class Program extends JFrame
{
    private JLabel prev;
    private JLabel resultX;
    private JLabel resultY;
    private JLabel resultN;
    private JTextField mnozhX;
    private JTextField mnozhY;
    private JTextField mnozhN;
    private JButton btnOK;
    Obr obr = new Obr();
    public Program()
    {
        final JFrame jfrm = new JFrame ( "Lazareva, OOP" );
        jfrm.setSize ( 310, 100 );
        jfrm.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        jfrm.setLayout ( new FlowLayout ( FlowLayout.LEFT ) );
        jfrm.setLocationRelativeTo(null);

        prev = new JLabel ( "Enter N: " );
        jfrm.add ( prev );
        mnozhX = new JTextField ( 8 );
        jfrm.add ( mnozhX );
        resultX = new JLabel (); 
        jfrm.add ( resultX );
        
        prev = new JLabel ( "Enter K: " );
        jfrm.add ( prev );
        mnozhY = new JTextField ( 8 );
        jfrm.add ( mnozhY );
        resultY = new JLabel (); 
        jfrm.add ( resultY );
        
        prev = new JLabel ( "Enter : " );
        jfrm.add ( prev );
        mnozhN = new JTextField ( 8 );
        jfrm.add ( mnozhN );
        resultN = new JLabel (); 
        jfrm.add ( resultN );
        
        getContentPane().setLayout(new FlowLayout());
		btnOK= new JButton("Calculate");
		getContentPane().add(btnOK);
		
		mnozhX.addActionListener(obr);
		mnozhY.addActionListener(obr);
		mnozhN.addActionListener(obr);

		
		btnOK.addActionListener(new ButtonOKListener());
		setVisible(true); 
 
		
        btnOK.addActionListener ( new ActionListener()
        {
            public void actionPerformed ( ActionEvent e )
            {
                String numberX = mnozhX.getText ();
                String numberY = mnozhY.getText ();
                String numberN = mnozhN.getText ();
                try
                {
                    int numberx = Integer.parseInt ( numberX );
                    int numbery = Integer.parseInt ( numberY );
                    int numbern = Integer.parseInt ( numberN );
                    
                    Decision d = new Decision();
                    d.FirstDecision(numberx, numbery, numbern);

                }
                catch ( NumberFormatException ex )
                {
                    JOptionPane.showMessageDialog ( jfrm, "Error", "Incorrect input",
                            JOptionPane.ERROR_MESSAGE );
                }
            }
        } );
        jfrm.add ( btnOK );
        jfrm.setVisible ( true );
    }
	class ButtonOKListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("\nTask solved.\n");
		}
		
	}
	
	private class Obr implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String s ="";
			
			if(event.getSource()==mnozhX) {
				s = String.format("Number of operation N = : %s", event.getActionCommand());
			}
			else if(event.getSource()==mnozhY) {
				s = String.format("Number of operation K = : %s", event.getActionCommand());	
			}
			else if(event.getSource()==mnozhN) {
				s = String.format("Coefficient of the calculation = : %s", event.getActionCommand());	
			}
		
			JOptionPane.showMessageDialog (null,s);
		}
	}

    public static void main ( String[] args )
    {
        SwingUtilities.invokeLater ( new Runnable()
        {
            public void run ()
            {
                new Program();
            }
        } );
       
        
    }
}
