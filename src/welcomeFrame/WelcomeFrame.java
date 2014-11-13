package welcomeFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import main.MainFrame;

public class WelcomeFrame extends JFrame implements ActionListener {

	BackgroundPanel bgd = new BackgroundPanel("images/welcome.jpg");
	JButton aButton = new FadingButton(
			"<html><font color=RED>START</font></html>");
	JPanel panel = new JPanel();
	int clicks = 0;

	public WelcomeFrame() {
		aButton.addActionListener(this);
		panel.add(aButton);
		panel.setOpaque(false);
		setUndecorated(true);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		bgd.setLayout(new BorderLayout());
		// aButton.setSize(80, 25);

		bgd.add("South", panel);
		//panel.setBounds(250, 250, 300, 300);
		// bgd.repaint();
		setBounds((d.width - 550) / 2, (d.height - 410) / 2, 550, 400);
		add(bgd);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == aButton){
			clicks++;
			if(clicks >= 1){
				dispose();
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						new MainFrame();
					}
				});
			}
		}
		
	}
}
