package net.crazywolfy23.autotranslate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MainFrame {
	Auto auto;
	JFrame mainFrame;
	SpringLayout layout = new SpringLayout();
	JTextField input = new JTextField(85);
	JButton enter = new JButton("Translate!");
	JTextField output = new JTextField(85);
	
	public MainFrame(Auto auto){
		enter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Translator t = new Translator(auto,input.getText());
			}});
		this.auto = auto;
		setupJFrame();
		input.setSize(mainFrame.getWidth(), 20);
		mainFrame.setLayout(layout);
		mainFrame.add(input);
		mainFrame.add(enter);
		mainFrame.add(output);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, input, mainFrame.getWidth()/2, SpringLayout.HORIZONTAL_CENTER, mainFrame);
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, enter, 20, SpringLayout.VERTICAL_CENTER, mainFrame);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, enter, mainFrame.getWidth()/2, SpringLayout.HORIZONTAL_CENTER, mainFrame);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, output, mainFrame.getWidth()/2, SpringLayout.HORIZONTAL_CENTER, mainFrame);
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, output, 50, SpringLayout.VERTICAL_CENTER, mainFrame);
	}
	
	public void setupJFrame(){
		mainFrame = new JFrame();
		mainFrame.setSize(1000,150); //Weirdly positioned because i'm to lazy to move to look at the console.
		mainFrame.setTitle(Variables.name+" v"+Variables.version);
		mainFrame.setVisible(true);
	}
}
