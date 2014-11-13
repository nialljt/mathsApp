package FileIO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class FileSaveFrame extends JFrame implements ActionListener {
	String choosertitle;
	static String path = "";
	String function;
	String plotPoints;
	String linePoints;
	
	//the file chooser
	JFileChooser fileChooser;
	
	//ensures a valid file name is entered
	private static String regex = "[a-zA-Z0-9]+";
	JPanel panel = new JPanel();
	JLabel m_saveLabel = new JLabel("Enter File Name");
	JTextField m_fileNameField = new JTextField(20),
			m_pathField = new JTextField(20);
	JButton m_cancelButton = new JButton("Cancel"), m_saveButton = new JButton(
			"Save"), m_pathButton = new JButton("Path");
	Border compound1;

	//constructor for pop out save frame
	public FileSaveFrame(String function, String plotPoints, String linePoints) {
		//values to be written to file
		this.function = function;
		this.plotPoints = plotPoints;
		this.linePoints = linePoints;
		
		//custom border
		compound1 = BorderFactory.createCompoundBorder(
				BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK),
				new EmptyBorder(0, 0, 0, 0));
		
		m_pathField.setText(path);
		//disable editing of path textfield
		m_pathField.setEditable(false);
		
		//gridbag layout used for panel layout
		panel.setLayout(new GridBagLayout());
		panel.add(
				m_pathField,
				getConstraints(0, 0, 2, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		panel.add(
				m_pathButton,
				getConstraints(2, 0, 1, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		panel.add(
				m_saveLabel,
				getConstraints(2, 1, 1, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		panel.add(
				m_fileNameField,
				getConstraints(0, 1, 2, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		panel.add(
				m_cancelButton,
				getConstraints(0, 2, 1, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		panel.add(
				m_saveButton,
				getConstraints(2, 2, 1, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		
		//set the border as the custon border
		panel.setBorder(compound1);
		
		//add the action listeners
		m_cancelButton.addActionListener(this);
		m_saveButton.addActionListener(this);
		m_pathButton.addActionListener(this);
		
		//add the panel to the frame
		add("Center", panel);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		//get the screen size
		Dimension d = tk.getScreenSize();
		//set the location of the frame
		setBounds((d.width - 350) / 2, (d.height - 150) / 2, 350, 150);
		
		//remove the red x and stuff from around it
		setUndecorated(true);

		//make the frame visible
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == m_cancelButton) {
			//if cancel button is pressed close the frame
			this.dispose();
		} else if (e.getSource() == m_saveButton) {
			String fileName = m_fileNameField.getText();
			if (path != "") {
				//check the file name using regular expressions
				if (fileName.matches(regex)) {
					//send the path + file name + .graph extension to the FileWrite class
					FileWrite write = new FileWrite(path+"\\"+fileName+".graph");
					try {
						//write values to file
						write.writeToFile(function, plotPoints, linePoints);
					} catch (IOException e1) {
						//show dialogue box
						showWarning("Unable to save file");
					}
					//close frame
					this.dispose();
				} else {
					showWarning("Invalid File Name");
				}
			} else {
				showWarning("Invalid Path");
			}
		} else if (e.getSource() == m_pathButton) {
			fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new java.io.File(""));
			fileChooser.setDialogTitle(choosertitle);
			//disable selection of files
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				m_pathField.setText(fileChooser.getSelectedFile().toString());
				path = m_pathField.getText();
			} else {
				showWarning("No Path Was Selected");
			}
		}
	}

	//displays a dialogue box with warning properties
	public void showWarning(String description) {
		JFrame frame = new JFrame("Show Message Dialog");
		JOptionPane.showMessageDialog(frame, description, "Warning",
				JOptionPane.WARNING_MESSAGE);
	}

	
	//set up the grid bag constraints
	private GridBagConstraints getConstraints(int gridx, int gridy,
			int gridwidth, int gridheight, int anchor, int inset1, int inset2,
			int inset3, int inset4) {
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(inset1, inset2, inset3, inset4);
		c.ipadx = 0;
		c.ipady = 0;
		c.gridx = gridx;
		c.gridy = gridy;
		c.gridwidth = gridwidth;
		c.gridheight = gridheight;
		c.anchor = anchor;
		return c;
	}
}
