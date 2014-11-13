package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import FileIO.FileDelete;
import FileIO.FileRead;
import FileIO.Filter;

import loadedGraph.loadedGraphFrame;
import main.MainFrame;

import welcomeFrame.BackgroundPanel;

public class MenuPanel extends JPanel implements ActionListener {
	private MainFrame registration;
	
	
	private JFileChooser fileChooser;
	JPanel graphOptions = new JPanel(), buttonsPanel = new JPanel(),
			fileOptions = new JPanel(), fileButtonsPanel = new JPanel(),
			filePanel = new JPanel();

	JLabel m_newGraphLabel = new JLabel("Create New Graph"),
			m_previousGraphsLabel = new JLabel("Previous Graphs");

	JButton m_polynomialButton = new RoundButton("Polynomial", 120, 40),
			m_trigonometricButton = new RoundButton("Trigonometric", 120, 40),
			m_parametricButton = new RoundButton("Parametric", 120, 40),
			m_expoentialButton = new RoundButton("Exponential", 120, 40);

	//new round button 
	JButton m_Path = new RoundButton("Path", 70, 30), m_Load = new RoundButton(
			"Load", 70, 30), m_Delete = new RoundButton("Delete", 70, 30);

	JTextField pathTextField = new JTextField(25);

	DefaultListModel model = new DefaultListModel();

	JList list = new JList(model);
	JScrollPane listScroller = new JScrollPane(list);

	Border compound;
	Border compound1;

	String choosertitle;
	static String path = "";

	static File[] foundFiles;

	public MenuPanel() {
		//custom font
		Font f = new Font("Serif", Font.BOLD, 14);
		m_newGraphLabel.setFont(f);
		m_previousGraphsLabel.setFont(f);
		m_newGraphLabel.setForeground(Color.BLACK);
		m_previousGraphsLabel.setForeground(Color.BLACK);
		pathTextField.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,
				Color.BLACK));
		listScroller.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,
				Color.BLACK));

		m_polynomialButton.setBackground(new Color(246, 246, 255));
		m_parametricButton.setBackground(new Color(246, 246, 255));
		m_trigonometricButton.setBackground(new Color(246, 246, 255));
		m_expoentialButton.setBackground(new Color(246, 246, 255));
		m_Path.setBackground(new Color(246, 246, 255));
		m_Load.setBackground(new Color(246, 246, 255));
		m_Delete.setBackground(new Color(246, 246, 255));

		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		listScroller.setPreferredSize(new Dimension(280, 60));
		compound = BorderFactory.createCompoundBorder(
				BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK),
				new EmptyBorder(25, 25, 25, 25));
		compound = BorderFactory.createCompoundBorder(new EmptyBorder(0, 0, 0,
				0), compound);

		compound1 = BorderFactory.createCompoundBorder(
				BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK),
				new EmptyBorder(0, 0, 0, 0));

		buttonsPanel.setLayout(new GridLayout(2, 2, 40, 40));

		buttonsPanel.add(m_polynomialButton);
		buttonsPanel.add(m_trigonometricButton);
		buttonsPanel.add(m_parametricButton);
		buttonsPanel.add(m_expoentialButton);

		buttonsPanel.setBorder(compound);
		buttonsPanel.setBackground(new Color(255, 255, 255));
		buttonsPanel.setOpaque(true);

		graphOptions.setLayout(new GridBagLayout());
		graphOptions.add(
				m_newGraphLabel,
				getConstraints(1, 0, 2, 1, GridBagConstraints.CENTER, 0, 0, 0,
						0));
		graphOptions.add(
				buttonsPanel,
				getConstraints(1, 1, 2, 2, GridBagConstraints.CENTER, 0, 0, 0,
						0));

		fileButtonsPanel.setLayout(new GridLayout(3, 1, 20, 20));
		fileButtonsPanel.add(m_Path);
		fileButtonsPanel.add(m_Load);
		fileButtonsPanel.add(m_Delete);
		fileButtonsPanel.setBackground(new Color(255, 255, 255));
		fileOptions.setLayout(new GridBagLayout());

		fileOptions.add(
				pathTextField,
				getConstraints(0, 0, 2, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		fileOptions.add(
				listScroller,
				getConstraints(0, 1, 2, 2, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		fileOptions.add(
				m_Path,
				getConstraints(2, 0, 1, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		fileOptions.add(
				m_Load,
				getConstraints(2, 1, 1, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		fileOptions.add(
				m_Delete,
				getConstraints(2, 2, 1, 1, GridBagConstraints.CENTER, 5, 5, 5,
						5));
		fileOptions.setBackground(new Color(255, 255, 255));

		filePanel.setLayout(new GridBagLayout());
		filePanel.add(
				m_previousGraphsLabel,
				getConstraints(1, 0, 2, 1, GridBagConstraints.CENTER, 0, 0, 0,
						0));
		filePanel.add(
				fileOptions,
				getConstraints(1, 1, 2, 3, GridBagConstraints.CENTER, 0, 0, 0,
						0));

		fileOptions.setBorder(compound1);

		setBackground(new Color(255, 228, 225));

		graphOptions.setOpaque(false);
		filePanel.setOpaque(false);
		m_Path.addActionListener(this);
		m_Load.addActionListener(this);
		m_Delete.addActionListener(this);

		m_polynomialButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registration != null) {
					registration.swapView("polynomial");
				}
			}
		});
		m_trigonometricButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registration != null) {
					registration.swapView("trigonometric");
				}
			}
		});
		m_parametricButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registration != null) {
					registration.swapView("parametric");
				}
			}
		});
		m_expoentialButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registration != null) {
					registration.swapView("exponential");
				}
			}
		});
		
		add("North", graphOptions);
		add("Center", filePanel);
		
	}

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

	public void updateList() {
		model.removeAllElements();
		foundFiles = Filter.finder(path);
		for (File file : foundFiles) {
			model.addElement(file.getName());
		}
	}

	public void showWarning(String description) {
		
		
		JFrame frame = new JFrame("Show Message Dialog");
		JOptionPane.showMessageDialog(frame, description, "Warning",
				JOptionPane.WARNING_MESSAGE);

	}

	public void setRegistration(MainFrame registration) {
		this.registration = registration;

	}

	public String getPath() {
		return path;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == m_Path) {
			fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new java.io.File(""));
			fileChooser.setDialogTitle(choosertitle);
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				pathTextField.setText(fileChooser.getSelectedFile().toString());
				path = pathTextField.getText();
				updateList();
			} else {
				showWarning("No Path Was Selected");
			}
		} else if (e.getSource() == m_Load) {
			if (!model.isEmpty()) {
				try {
					String item = pathTextField.getText()+"\\"+list.getSelectedValue().toString();
					FileRead read = new FileRead(item);
					try {
						read.processLineByLine();
					} catch (FileNotFoundException e1) {
						System.out.println("error with file");
					}
					new loadedGraphFrame(read.getFunction(),read.getplotpoints(),read.getlinepoints());
				} catch (Exception exc) {
					showWarning("Nothing Selected");
				}
			} else {
				showWarning("List is empty");
			}
		} else if (e.getSource() == m_Delete) {
			if (!model.isEmpty()) {
				try {
					String item = list.getSelectedValue().toString();
					FileDelete.DeleteFile(path+"\\"+item);
					updateList();
				} catch (Exception exc) {
					showWarning("Nothing Selected");
				}
			} else {
				showWarning("List is empty");
			}
		}

	}
}
