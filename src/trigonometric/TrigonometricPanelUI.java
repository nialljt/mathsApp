
package trigonometric;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import FileIO.FileSaveFrame;

import main.MainFrame;

import functionUtility.FunctionUtility;
import graph.graph;

public class TrigonometricPanelUI extends javax.swing.JPanel {
	private MainFrame registration;
	Vector vecXpoints = new Vector();
	Vector vecYpoints = new Vector();
	Vector vecXline = new Vector();
	Vector vecYline = new Vector();
    //Use a DefaultTableModel instead of the jTable
    //This will allow adding rows to table dynamically
    private JScrollPane scrollPane;
    public static DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);

    public TrigonometricPanelUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")

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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trigonometric Function -   f(x) = A sin Bx + C", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel1.setText("A(Y Position):");

        m_PolyTextA.setText("4");
        m_PolyTextA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_PolyTextAActionPerformed(evt);
            }
        });

        jLabel2.setText("B(1 = 360 DEG):");

        m_PolyTextB.setText("3");
        m_PolyTextB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_PolyTextBActionPerformed(evt);
            }
        });

        jLabel3.setText("C(Degrees):");

        m_PolyTextC.setText("90");
        m_PolyTextC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_PolyTextCActionPerformed(evt);
            }
        });

        jLabel4.setText("Steps:");

        m_PolyTextSteps.setText("45");
        m_PolyTextSteps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_PolyTextStepsActionPerformed(evt);
            }
        });

        jButton1.setText("Generate Points");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        
        scrollPane = new JScrollPane(table);

        jButton2.setText("Draw Graph");

        jButton3.setText("Back");

        jButton4.setText("Save Points");

		model.addColumn("f(x)");
        model.addColumn("A sin Bx + C");
		
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_PolyTextA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m_PolyTextB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m_PolyTextC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m_PolyTextSteps, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(m_PolyTextA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(m_PolyTextB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(m_PolyTextC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(m_PolyTextSteps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Values", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Graph"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        
        jTabbedPane1.addTab("Graph", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        table.setEnabled(false);
		jButton2.setEnabled(false);
		jButton4.setEnabled(false);
        jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registration != null) {
					clearTable();
					jButton2.setEnabled(false);
					jButton4.setEnabled(false);
					registration.swapView("menu");
				}
			}
		});

		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						String plotPoints = "";
						String function = m_PolyTextA.getText() + " sin "+m_PolyTextB.getText()+"x + "+m_PolyTextC.getText();
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
				String function = m_PolyTextA.getText() + " sin "+m_PolyTextB.getText()+"x + "+m_PolyTextC.getText();
				graph graph = new graph(vecXpoints, vecYpoints, vecXline, vecYline, function);
				
				jTabbedPane1.setSelectedIndex(1);
				jPanel3.setOpaque(true);
				jPanel3.add(graph);

				jPanel3.repaint();

				jPanel3.setVisible(true);
				
			}
		});
		
		
		
		
		
		
    }
    private void m_PolyTextAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_PolyTextAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_PolyTextAActionPerformed

    private void m_PolyTextBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_PolyTextBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_PolyTextBActionPerformed

    private void m_PolyTextCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_PolyTextCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_PolyTextCActionPerformed

    private void m_PolyTextStepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_PolyTextStepsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_PolyTextStepsActionPerformed

    
	
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //NEEDED:
        // Validation (doubles and ints only) 

        //Variables
        float t_min, t_max, a, b, c, step, stepline;
        float fX;

        if(!vecXpoints.isEmpty()){	
			vecXpoints.removeAllElements();
			vecYpoints.removeAllElements();
			vecXline.removeAllElements();
			vecYline.removeAllElements();	
		}
       
        clearTable();
        //Get values for variables
        
        a = Float.parseFloat(m_PolyTextA.getText());
        b = Float.parseFloat(m_PolyTextB.getText());
        c = Float.parseFloat(m_PolyTextC.getText());
        step = Float.parseFloat(m_PolyTextSteps.getText());
        t_min = 0;
        t_max = b*360;
        stepline = (t_max - t_min)/1000;
        
        //Loop through and calculate values
        for (float i = t_min; i <= t_max; i = (i + step)) {
            //for poly function
            fX = i;
            //call poly function
            float newY = FunctionUtility.TrigFunction(a, b, c, fX);
            //Add f(x) and function values to table
            model.addRow(new Object[]{i, newY});
            //copy into x array
            vecXpoints.add(i);
            //copy into y array
            vecYpoints.add(newY);
        }
        for (float i = t_min; i <= t_max; i = (i + stepline)) {
            //for poly function
            fX = i;
            //call poly function
            float newY = FunctionUtility.TrigFunction(a, b, c, fX);
            //copy into x array
            vecXline.add(i);
            //copy into y array
            vecYline.add(newY);
        }
        jButton2.setEnabled(true);
		jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void setRegistration(MainFrame registration) {
		this.registration = registration;

	}
    public void clearTable() {
		for (int i = model.getRowCount() - 1; i > -1; i--) {
			model.removeRow(i);
		}
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField m_PolyTextSteps;
    // End of variables declaration//GEN-END:variables
}
