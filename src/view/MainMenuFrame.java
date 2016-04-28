package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainMenuFrame extends JFrame
{
	private ConfirmTerminationDialog ctd;
	
	public MainMenuFrame()
	{
		setTitle("Abiquiz Server - Hauptmenü");
		setSize(800, 900);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) 
		    {
		    	ctd = new ConfirmTerminationDialog();
		    	ctd.addListenerOnjb2(new OnClickListener());
		    	ctd.setVisible();
		    }
		});
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		setVisible(true);
	}

	
	class OnClickListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ctd.disposeFrame();
			dispose();
		}
	}
}
