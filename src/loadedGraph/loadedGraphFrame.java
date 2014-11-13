package loadedGraph;

import graph.graph;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class loadedGraphFrame extends JFrame implements ActionListener {

	JButton closeButton = new JButton("Close");
	JPanel graphPanel = new JPanel();

	String xypoints[];
	String xyline[];

	Vector vecXpoints = new Vector();
	Vector vecYpoints = new Vector();
	Vector vecXline = new Vector();
	Vector vecYline = new Vector();
	
	public loadedGraphFrame(String function, String plotpoints,
			String linepoints) {

		//split the valuse which have been read in from a file
		xypoints = plotpoints.split(";");
		xyline = linepoints.split(";");
		
		
		int countp = 2;
		for(String s : xypoints){
			float f = Float.parseFloat(s);
			//decide if its an x or y
			if(countp%2 ==0){
				vecXpoints.addElement(f);
			}else{
				vecYpoints.addElement(f);
			}
			countp++;
		}
		int countl = 2;
		for(String s : xyline){
			float f = Float.parseFloat(s);
			if(countl%2 ==0){
				vecXline.addElement(f);
			}else{
				vecYline.addElement(f);
			}
			countl++;
		}
		
		graph graph = new graph(vecXpoints, vecYpoints, vecXline, vecYline, function);
		graphPanel.add(graph);
		
		graphPanel.add("South",closeButton);
		closeButton.addActionListener(this);
		
		this.setUndecorated(true);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setBounds((d.width - 570) / 2, (d.height - 370) / 2, 570, 370);
		add(graphPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == closeButton){
			this.dispose();
		}

	}

}
