package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class ConfirmTerminationDialog extends JDialog implements ActionListener
{
	private JLabel text;
	public JButton jb1, jb2, jb3;
	
	private MainMenuFrame mmf;
	
	public ConfirmTerminationDialog()
	{		
		setTitle("Server beenden?");
		setSize(500, 150);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setModal(true);
		setLayout(new FlowLayout());
		
		text = new JLabel("Möchten Sie auch den Server beenden oder nur die Eingabemaske schließen?");
		jb1 = new JButton("Auch den Server beenden");
		jb2 = new JButton("Nur Eingabemaske schließen");
		jb3 = new JButton("Abbrechen");
		jb1.addActionListener(this);
		jb3.addActionListener(this);
		add(text);
		add(jb1);
		add(jb2);
		add(jb3);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
	}
	
	public void addListenerOnjb2(ActionListener al)
	{
		jb2.addActionListener(al);
	}
	
	public void setVisible()
	{
		setVisible(true);
	}
	
	public void disposeFrame()
	{
		dispose();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == jb1)
		{
			System.exit(0);
		}
		if(e.getSource() == jb3)
		{
			dispose();
		}
	}
	
	
}
