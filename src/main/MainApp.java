package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import welcomeFrame.WelcomeFrame;

public class MainApp {

	public static void main(String[] args) {
		//run the welcome screen
		Runnable CreateAndShowGUI = new Runnable() {
			public void run() {
				new WelcomeFrame();
			}
		};
		SwingUtilities.invokeLater(CreateAndShowGUI);
			
	}
}
