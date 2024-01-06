
package MainForm;

import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.Statement;
import javax.swing.JTextField;
import yan.connection.DatabaseConnection;

public class Table_Create extends javax.swing.JFrame {
public int count;   //column count
private int primary;
private int foreign=0;
private String tableName;
private JTextField[] textFields;
private JComboBox[] combobox;
private JComboBox[] combobox1;
private ResultSet rs;
private String refcolumn_name;
JLabel label[];

        public Table_Create() throws SQLException 
            {
            initComponents();
            DatabaseConnection.getInstance().connectToDatabase();  
            jPanel1.setVisible(false);
        }
    
    public JTextField[] auto_create_TextField(int count){
        textFields=new JTextField[count];
        label=new JLabel[count];
        for(int i=0;i<count;i++){
            textFields[i]=new JTextField();    
            label[i]=new JLabel("Column "+(i+1)+" name=>>");
        }       
        return textFields;
    }
    
    public JComboBox[] auto_create_combobox(int count){
        combobox=new JComboBox[count];
        for(int i=0;i<count;i++){
            combobox[i]=new JComboBox();
            combobox[i].addItem("int");
            combobox[i].addItem("varchar(50)");
            combobox[i].addItem("Date");
            combobox[i].addItem("Time");
            combobox[i].addItem("float");
            combobox[i].addItem("double");
            combobox[i].addItem("varchar(20)");
        }       
    return combobox;      
    }
    
    public JComboBox[] auto_create_NULL(int count){
        combobox1=new JComboBox[count];
        for(int i=0;i<count;i++){
            combobox1[i]=new JComboBox();
            combobox1[i].addItem("NULL");
            combobox1[i].addItem("NOT NULL");
        }
        return combobox1;
    }
    @SuppressWarnings("unchecked")
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        reftable = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fkcombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        pkcombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbocolumn_name = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        textfieldpanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        btncreate = new javax.swing.JButton();
        txtcount = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttablename = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setText("From Table");

        reftable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reftableMouseClicked(evt);
            }
        });
        reftable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reftableActionPerformed(evt);
            }
        });

        jLabel3.setText("Primary Key ");

        fkcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fkcomboItemStateChanged(evt);
            }
        });
        fkcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fkcomboMouseClicked(evt);
            }
        });
        fkcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fkcomboActionPerformed(evt);
            }
        });

        jLabel4.setText("Foreign Key");

        pkcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pkcomboItemStateChanged(evt);
            }
        });
        pkcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkcomboActionPerformed(evt);
            }
        });

        jLabel6.setText("Which column");

        cbocolumn_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocolumn_nameActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pkcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fkcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reftable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(cbocolumn_name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pkcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fkcombo)
                    .addComponent(jButton1))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(reftable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocolumn_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout textfieldpanelLayout = new javax.swing.GroupLayout(textfieldpanel);
        textfieldpanel.setLayout(textfieldpanelLayout);
        textfieldpanelLayout.setHorizontalGroup(
            textfieldpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        textfieldpanelLayout.setVerticalGroup(
            textfieldpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(15, 33, 45));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create Table");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(58, 111, 218));
        label5.setText("BUC Pc Repair Company Ltd;");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setText("Tabel Name ");

        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jLabel1.setText("Column Count (max 10)");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txttablename, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btncreate)
                .addGap(41, 41, 41))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttablename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnok)
                    .addComponent(btncreate))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(textfieldpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfieldpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
      //count=Integer.parseInt(numbox.)
      count=Integer.parseInt(txtcount.getText());
      if (count >= 2 && count <= 10){
      jPanel1.setVisible(true);
      textfieldpanel.setVisible(true);
      textFields=auto_create_TextField(count);
      combobox=auto_create_combobox(count);    
      combobox1=auto_create_NULL(count);
      textfieldpanel.removeAll();
      textfieldpanel.setLayout(new GridLayout(0,4,10,10)); 
      pkcombo.removeAllItems();  
      fkcombo.addItem("");
              

      for(int i=0;i<count;i++){
          //label
          textfieldpanel.add(label[i]);
          label[i].setPreferredSize(new Dimension(100,25));
          //textfield
          textfieldpanel.add(textFields[i]);
          textFields[i].setPreferredSize(new Dimension(120, 25));    
          //frimarykey and foreign key
          pkcombo.addItem("Column "+(i+1));
          fkcombo.addItem("Column "+(i+1));  
          //combobox
          combobox[i].setPreferredSize(new Dimension(100,25));
          textfieldpanel.add(combobox[i]);       
          //null and not null
          combobox1[i].setPreferredSize(new Dimension(100,25));
          textfieldpanel.add(combobox1[i]);
      }      
      textfieldpanel.revalidate();
      textfieldpanel.repaint(); 
      jPanel1.repaint();
      jPanel1.revalidate();
      }else{
          JOptionPane.showMessageDialog(this, "Please choose 2 to 10");
      }
    }//GEN-LAST:event_btnokActionPerformed
    
    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
       
        String tablename=txttablename.getText();
        if(!tablename.equals(""))
        {
        try{
            Statement stmt=DatabaseConnection.getInstance().getConnection().createStatement();
            count=Integer.parseInt(txtcount.getText());
        
            StringBuilder createTableSQL = new StringBuilder("CREATE TABLE "+tablename+" (");
        
        for (int i = 0; i < count; i++) {
        String column_name = textFields[i].getText();
        String datatype = (String) combobox[i].getSelectedItem();
        String type = (String) combobox1[i].getSelectedItem();

            if (i == primary) {
                createTableSQL.append(column_name).append(" ").append(datatype).append(" PRIMARY KEY ").append(type);
            } else if ((i + 1) == foreign) {
                createTableSQL.append(column_name).append(" ").append(datatype).append(type);
                createTableSQL.append(", FOREIGN KEY (").append(column_name).append(") REFERENCES ").append(tableName).append("(").append(refcolumn_name).append(")");
            } else {
                createTableSQL.append(column_name).append(" ").append(datatype).append(" ").append(type);
            }

            if (i < count - 1) {
                createTableSQL.append(", ");
            }
        }
        createTableSQL.append(")");

        //JOptionPane.showMessageDialog(this,createTableSQL.toString());
        stmt.executeUpdate(createTableSQL.toString());
        JOptionPane.showMessageDialog(this, "Success");
        textfieldpanel.setVisible(false);
        jPanel1.setVisible(false);
        txttablename.setText("");txtcount.setText("");
        }catch(HeadlessException | NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Please fill the table name and column");
        }
    }//GEN-LAST:event_btncreateActionPerformed

    private void cbocolumn_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocolumn_nameActionPerformed
        // TODO add your handling code here:
        refcolumn_name=cbocolumn_name.getSelectedItem().toString();
    }//GEN-LAST:event_cbocolumn_nameActionPerformed

    private void pkcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkcomboActionPerformed
        // TODO add your handling code here:
        primary=pkcombo.getSelectedIndex();

    }//GEN-LAST:event_pkcomboActionPerformed

    private void pkcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pkcomboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pkcomboItemStateChanged

    private void fkcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fkcomboActionPerformed
        /*fkcombo.removeAllItems();
        fkcombo.addItem("");
        for(int i=0;i<count;i++){
            fkcombo.addItem("Column "+(i+1));
        }*/
        foreign=fkcombo.getSelectedIndex();
        reftable.removeAllItems();
        try {
            DatabaseMetaData metadata = DatabaseConnection.getInstance().getConnection().getMetaData();
            String dbname=DatabaseConnection.getInstance().getConnection().getCatalog();
            String[] tableTypes = { "TABLE" };

            try (ResultSet resultSet = metadata.getTables(dbname, null, null, tableTypes)) {
                while (resultSet.next()) {
                    String tablename = resultSet.getString("TABLE_NAME");
                    reftable.addItem(tablename);
                }   }
            } catch (SQLException ex) {
            }

    }//GEN-LAST:event_fkcomboActionPerformed

    private void fkcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fkcomboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fkcomboMouseClicked

    private void fkcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fkcomboItemStateChanged
        // TODO add your handling code here:dfsdfdsfsd
    }//GEN-LAST:event_fkcomboItemStateChanged

    private void reftableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reftableActionPerformed
        cbocolumn_name.removeAllItems();
        //tableName=reftable.getSelectedItem();
        try {
            Statement stmt=DatabaseConnection.getInstance().getConnection().createStatement();
            tableName=reftable.getSelectedItem().toString();
            rs=stmt.executeQuery("Select * from "+tableName);
            ResultSetMetaData metadata=rs.getMetaData();
            //int columncount=metadata.getColumnCount();

           // for(int i=1;i<=columncount;i++){
                String columnName=metadata.getColumnName(1);
                cbocolumn_name.addItem(columnName);
            //}

        } catch (SQLException ex) {
            Logger.getLogger(Table_Create.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reftableActionPerformed

    private void reftableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reftableMouseClicked

    }//GEN-LAST:event_reftableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fkcombo.removeAllItems();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    try {
        Main m = new Main();
        m.setVisible(true);
        this.setVisible(false);
        } catch (SQLException ex) {
        Logger.getLogger(Table_Create.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Table_Create().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Table_Create.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox<String> cbocolumn_name;
    private javax.swing.JComboBox<String> fkcombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    private javax.swing.JComboBox<String> pkcombo;
    private javax.swing.JComboBox<String> reftable;
    private javax.swing.JPanel textfieldpanel;
    private javax.swing.JTextField txtcount;
    private javax.swing.JTextField txttablename;
    // End of variables declaration//GEN-END:variables
}

