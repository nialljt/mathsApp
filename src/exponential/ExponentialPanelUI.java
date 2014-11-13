
package exponential;

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

public class ExponentialPanelUI extends javax.swing.JPanel {
	//for the card layout
	private MainFrame registration;
	//vectors for the points to be displayed
	Vector vecXpoints = new Vector();
	Vector vecYpoints = new Vector();
	//vectors for the points of the line
	Vector vecXline = new Vector();
	Vector vecYline = new Vector();
    //Use a DefaultTableModel instead of the jTable
    //This will allow adding rows to table dynamically
    private JScrollPane scrollPane;
    public static DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);
    
    public ExponentialPanelUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        m_ExponTextA = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        m_ExponTextStep = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exponential Function - f(x)= A^x", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jButton5.setText("Draw Graph");

        m_ExponTextA.setText("5");

        jButton6.setText("Back");

        jButton7.setText("Create Points");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        m_ExponTextStep.setText("1");

        jButton8.setText("Save Points");

        jLabel5.setText("A:");

        jLabel6.setText("Step:");
		
		model.addColumn("x");
        model.addColumn("f(x)");

        
        scrollPane = new JScrollPane(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_ExponTextA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_ExponTextStep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8)
                            .addComponent(jButton5))))
                .addGap(10, 10, 10))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton5, jButton6, jButton7, jButton8, m_ExponTextA, m_ExponTextStep});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(m_ExponTextA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(m_ExponTextStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Values", jPanel3);

        
        jTabbedPane1.addTab("Graph", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        //disable selction of the table and draw graph, save points buttons 
        table.setEnabled(false);
        jButton5.setEnabled(false);
		jButton8.setEnabled(false);
        jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (registration != null) {
					//disable draw graph, save points buttons  on exiting this panel
					jButton5.setEnabled(false);
					jButton8.setEnabled(false);
					//clear the table out
					clearTable();
					//swap card
					registration.swapView("menu");
				}
			}
		});

        //save points button
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						String plotPoints = "";
						String function = m_ExponTextA.getText() + "^x";
						String linePoints = "";
						//loop through and append values in the table to plotpoints string
						for(int i = 0; i < model.getRowCount(); i++){
							plotPoints +=model.getValueAt(i, 0).toString()+";"+model.getValueAt(i, 1).toString()+";";
						}
						//loop through and append generated values to linepoints
						for(int i = 0; i < vecXline.size(); i++){
							linePoints +=vecXline.get(i).toString()+";"+vecYline.get(i).toString()+";";
						}
						//pass values into filesaveframe
						new FileSaveFrame(function,plotPoints, linePoints);
					}
				});
			}
		});
		
		//draw graph button
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//remove any previous graphs
				jPanel2.removeAll();
				String function = m_ExponTextA.getText() + "^x";
				//create a new graph with generate values
				graph graph = new graph(vecXpoints, vecYpoints, vecXline, vecYline, function);
				//switch to the graph tab
				jTabbedPane1.setSelectedIndex(1);
				jPanel2.setOpaque(true);
				jPanel2.add(graph);

				jPanel2.repaint();

				jPanel2.setVisible(true);
				
			}
		});
    }

    //generate points button
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         //Variables
        float t_min, t_max, step, stepline;
        float x = 0;
        float a = 0;
        
        //remove any previous values from vectors
		if(!vecXpoints.isEmpty()){	
			vecXpoints.removeAllElements();
			vecYpoints.removeAllElements();
			vecXline.removeAllElements();
			vecYline.removeAllElements();	
		}
		//clear any previous values from the table
        clearTable();
        
        //retrive user values
        a = Float.parseFloat(m_ExponTextA.getText());
        step = Float.parseFloat(m_ExponTextStep.getText());
        t_min = 0;
        t_max = a;
        //needed to generate 1000 points for the line
        stepline = (t_max - t_min)/1000;
        
        //Loop through and calculate values
        for (float i = t_min; i <= t_max; i = (i + step)) {
            
            x = i;
           
            float newY = FunctionUtility.ExponFunction(a, x);
            //Add f(x) and function values to table
            model.addRow(new Object[]{i, newY});
            //copy into x array
           
            vecXpoints.add(i);
            //copy into y array
            vecYpoints.add(newY);
        }
        for (float i = t_min; i <= t_max; i = (i + stepline)) {
        	x = i;
			float newY = FunctionUtility.ExponFunction(a, x);
			// copy into x array
			vecXline.add(i);
			// copy into y array
			
			vecYline.add(newY);
		}
        jButton5.setEnabled(true);
		jButton8.setEnabled(true);
    }//GEN-LAST:event_jButton7ActionPerformed
    public void setRegistration(MainFrame registration) {
		this.registration = registration;

	}
    public void clearTable() {
    	//loop through and remove all entries in table
		for (int i = model.getRowCount() - 1; i > -1; i--) {
			model.removeRow(i);
		}
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField m_ExponTextA;
    private javax.swing.JTextField m_ExponTextStep;
    // End of variables declaration//GEN-END:variables
}
