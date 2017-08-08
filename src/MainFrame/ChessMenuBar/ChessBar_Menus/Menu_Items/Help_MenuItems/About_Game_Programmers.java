

package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Help_MenuItems;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class About_Game_Programmers extends JMenuItem
{
    
    /** Creates a new instance of About_Game_Programmers */
    public About_Game_Programmers()
    {
        setText("About us");
        addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		createAboutUsDisplay();
            
        	}
        });
    }
    
    //creates information pop up
    public void createAboutUsDisplay()
    {
    	Frame frame = new JFrame();
    	JOptionPane.showMessageDialog(frame, "Developers are: \nSara Achten\nDavid Arnold\nRobert Buss\n\nCreated: 2017", 
    			"About us", JOptionPane.PLAIN_MESSAGE);
    }
    
}
