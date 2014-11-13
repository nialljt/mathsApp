package polynomial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import FileIO.FileSaveFrame;

import main.MainFrame;

import functionUtility.FunctionUtility;
import graph.graph;

public class PolynomialPanelUI extends javax.swing.JPanel {
	private MainFrame registration;
	// Use a DefaultTableModel instead of the jTable
	// This will allow adding rows to table dynamically
	Vector vecXpoints = new Vector();
	Vector vecYpoints = new Vector();
	Vector vecXline = new Vector();
	Vector vecYline = new Vector();
	private JScrollPane scrollPane;
	public static DefaultTableModel model = new DefaultTableModel();
	JTable table = new JTable(model);

	// above constructor
	public PolynomialPanelUI() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		
		

		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		m_PolyTextA = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		m_PolyTextB = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		m_PolyTextC = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		m_PolyTextSteps = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		m_PolyTextMin = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		m_PolyTextMax = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Polynomial Function -   f(x) = ax^3 + bx^2 + c",
				javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

		jLabel1.setText("A:");

		model.addColumn("f(x)");
		model.addColumn("ax^3 + bx^2 + c");
		

		m_PolyTextA.setText("4");
		m_PolyTextA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				m_PolyTextAActionPerformed(evt);
			}
		});

		jLabel2.setText("B:");

		m_PolyTextB.setText("3");
		m_PolyTextB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				m_PolyTextBActionPerformed(evt);
			}
		});

		jLabel3.setText("C:");

		m_PolyTextC.setText("2");
		m_PolyTextC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				m_PolyTextCActionPerformed(evt);
			}
		});

		jLabel4.setText("Steps:");

		m_PolyTextSteps.setText("1");
		m_PolyTextSteps.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				m_PolyTextStepsActionPerformed(evt);
			}
		});

		jLabel5.setText("Min:");

		m_PolyTextMin.setText("-3");
		m_PolyTextMin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				m_PolyTextMinActionPerformed(evt);
			}
		});

		jLabel6.setText("Max:");

		m_PolyTextMax.setText("3");

		jButton1.setText("Create Points");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		scrollPane = new JScrollPane(table);

		jButton2.setText("Draw Graph");

		jButton3.setText("Back");

		jButton4.setText("Save Points");

		
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.Alignment.TRAILING))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																m_PolyTextA,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																m_PolyTextB,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																m_PolyTextC,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																m_PolyTextSteps,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																m_PolyTextMin,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																m_PolyTextMax,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																123,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																123,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(66, 66, 66)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																scrollPane,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																225,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(50,
																				50,
																				50)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								123,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))))
										.addGap(63, 63, 63)));

		jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { jButton1, jButton2, jButton3,
						jButton4 });

		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(13, 13, 13)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																scrollPane,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																0,
																Short.MAX_VALUE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								m_PolyTextA,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								m_PolyTextB,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								m_PolyTextC,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								m_PolyTextSteps,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel5)
																						.addComponent(
																								m_PolyTextMin,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								m_PolyTextMax,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton4))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { jLabel1, jLabel2, jLabel3, jLabel4,
						jLabel5, jLabel6 });

		jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { m_PolyTextA, m_PolyTextB,
						m_PolyTextC, m_PolyTextMax, m_PolyTextMin,
						m_PolyTextSteps });

		jTabbedPane1.addTab("Values", jPanel2);

		

		

		
		

		jTabbedPane1.addTab("Graph", jPanel3);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		table.setEnabled(false);
		jButton2.setEnabled(false);
		jButton4.setEnabled(false);
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registration != null) {
					jButton2.setEnabled(false);
					jButton4.setEnabled(false);
					clearTable();
					registration.swapView("menu");
				}
			}
		});

		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						String plotPoints = "";
						String function = m_PolyTextA.getText() + "x^3 + "+m_PolyTextB.getText()+"x^2 + "+m_PolyTextC.getText();
						String linePoints = "";
						for(int i = 0; i < model.getRowCount(); i++){
							plotPoints +=model.getValueAt(i, 0).toString()+";"+model.getValueAt(i, 1).toString()+";";
						}
						for(int i = 0; i < vecXline.size(); i++){
							linePoints +=vecXline.get(i).toString()+";"+vecYline.get(i).toString()+";";
						}
						new FileSaveFrame(function,plotPoints, linePoints);
						
					}
				});
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jPanel3.removeAll();
				String function = m_PolyTextA.getText() + "x^3 + "+m_PolyTextB.getText()+"x^2 + "+m_PolyTextC.getText();
				graph graph = new graph(vecXpoints, vecYpoints, vecXline, vecYline, function);
				jTabbedPane1.setSelectedIndex(1);
				jPanel3.setOpaque(true);
				jPanel3.add(graph);

				jPanel3.repaint();

				jPanel3.setVisible(true);
				
			}
		});
	}// </editor-fold>//GEN-END:initComponents

	public void setRegistration(MainFrame registration) {
		this.registration = registration;

	}

	public void clearTable() {
		for (int i = model.getRowCount() - 1; i > -1; i--) {
			model.removeRow(i);
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// NEEDED:
		// Validation (doubles and ints only)

		if(!vecXpoints.isEmpty()){	
			vecXpoints.removeAllElements();
			vecYpoints.removeAllElements();
			vecXline.removeAllElements();
			vecYline.removeAllElements();	
		}
		// Variables
		float t_min, t_max, a, b, c, steppoints, stepline;
		float fX;

		clearTable();
		// Vectors store the results for graphing
		

		// Get values for variables
		t_min = Float.parseFloat(m_PolyTextMin.getText());
		t_max = Float.parseFloat(m_PolyTextMax.getText());
		a = Float.parseFloat(m_PolyTextA.getText());
		b = Float.parseFloat(m_PolyTextB.getText());
		c = Float.parseFloat(m_PolyTextC.getText());
		steppoints = Float.parseFloat(m_PolyTextSteps.getText());
		stepline = (t_max - t_min)/1000;
		
		// Variable for correct looping (takes step into account)
		float high = (t_max - (t_min)) / steppoints;
		// Loop through and calculate values
		for (float i = t_min; i <= t_max; i = (i + steppoints)) {
			// for poly function
			fX = i;
			// call poly function
			float newY = FunctionUtility.PolyFunction(a, b, c, fX);
			// Add f(x) and function values to table
			model.addRow(new Object[] { i, newY });
			// copy into x array
			vecXpoints.add(i);
			// copy into y array
			vecYpoints.add(newY);
		}
		for (float i = t_min; i <= t_max; i = (i + stepline)) {
			// for poly function
			fX = i;
			// call poly function
			float newY = FunctionUtility.PolyFunction(a, b, c, fX);
			// copy into x array
			vecXline.add(i);
			// copy into y array
			vecYline.add(newY);
		}
		jButton2.setEnabled(true);
		jButton4.setEnabled(true);
	}// GEN-LAST:event_jButton1ActionPerformed

	private void m_PolyTextMinActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_m_PolyTextMinActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_m_PolyTextMinActionPerformed

	private void m_PolyTextStepsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_m_PolyTextStepsActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_m_PolyTextStepsActionPerformed

	private void m_PolyTextBActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_m_PolyTextBActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_m_PolyTextBActionPerformed

	private void m_PolyTextAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_m_PolyTextAActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_m_PolyTextAActionPerformed

	private void m_PolyTextCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_m_PolyTextCActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_m_PolyTextCActionPerformed
		// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField m_PolyTextA;
	private javax.swing.JTextField m_PolyTextB;
	private javax.swing.JTextField m_PolyTextC;
	private javax.swing.JTextField m_PolyTextMax;
	private javax.swing.JTextField m_PolyTextMin;
	private javax.swing.JTextField m_PolyTextSteps;
	// End of variables declaration//GEN-END:variables
}
