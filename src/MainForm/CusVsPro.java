
package MainForm;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import yan.connection.DatabaseConnection;


public class CusVsPro extends javax.swing.JFrame {
int row,column;
    public CusVsPro() throws SQLException {
        initComponents();
        DatabaseConnection.getInstance().connectToDatabase();
        gettablename();
        getcolumn_name();
        jButton1.setVisible(false);
    }
    
    private void getcolumn_name(){
        try {
            cbocolumn_name.removeAllItems();
            String tableName=cbotable.getSelectedItem().toString();
            Statement stmt=DatabaseConnection.getInstance().getConnection().createStatement();
            ResultSet rs=stmt.executeQuery("Select * from "+tableName);
            ResultSetMetaData metadata=rs.getMetaData();
            int columncount=metadata.getColumnCount();
        
                for(int i=1;i<=columncount;i++){
                    String columnName=metadata.getColumnName(i);
                    cbocolumn_name.addItem(columnName);
                }
        
                }catch (SQLException ex) {
                     JOptionPane.showMessageDialog(this, ex);
                }
    }

    public void gettablename(){
        try{
            cbotable.removeAllItems();
            DatabaseMetaData meta=DatabaseConnection.getInstance().getConnection().getMetaData();
            String[] type={"TABLE"};
            ResultSet rs=meta.getTables("cos106", null, null, type);
            while(rs.next()){
                String tablename=rs.getString("TABLE_NAME");
                cbotable.addItem(tablename);
            }
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        cbotable = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        btn_new_column = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtsearch = new yan.swing.TextField();
        jButton2 = new javax.swing.JButton();
        cbocolumn_name = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 183, 41));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(124, 196, 196));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Customer,Products and etc..");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(58, 111, 218));
        label5.setText("BUC Pc Repair Company Ltd;");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Select Table Here");
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });

        cbotable.setBackground(new java.awt.Color(204, 204, 204));
        cbotable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbotableItemStateChanged(evt);
            }
        });

        t1.setBackground(new java.awt.Color(204, 204, 204));
        t1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(t1);

        btn_new_column.setText("Add New Row");
        btn_new_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_columnActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtsearch.setBackground(new java.awt.Color(255, 255, 204));
        txtsearch.setLabelText("Search Here");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbotable, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbocolumn_name, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_new_column)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbocolumn_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_new_column, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btndelete)
                    .addComponent(btnupdate))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked

    }//GEN-LAST:event_label1MouseClicked

    private void cbotableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbotableItemStateChanged
        display();
        getcolumn_name();
    }//GEN-LAST:event_cbotableItemStateChanged

    private void btn_new_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_columnActionPerformed
        //create new form
        jButton1.setVisible(true);
        int columncount=t1.getColumnCount();
        DefaultTableModel model=(DefaultTableModel)t1.getModel();
        model.addRow(new Object[columncount]);
    }//GEN-LAST:event_btn_new_columnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //insert into the database:
        row=t1.getSelectedRow();
        column=t1.getColumnCount();
        if(row!=-1){
            Object[] rowData=new Object[column];
            for(int i=0;i<column;i++){
                rowData[i]=t1.getValueAt(row, i);
            }
        try {
            StringBuilder sqlBuilder = new StringBuilder("insert into ").append(cbotable.getSelectedItem()).append(" values (");
            for (int i = 0; i < column; i++) {
                sqlBuilder.append("?");
                if (i < column - 1) {
                    sqlBuilder.append(", ");
                }
            }
            sqlBuilder.append(")");

            String sql = sqlBuilder.toString();
            PreparedStatement stmt = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            for (int i = 0; i < column; i++) {
                stmt.setObject(i + 1, rowData[i]);
            }
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insert Successful");
            refreshTable();
            jButton1.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }else {
            JOptionPane.showMessageDialog(this, "No row selected.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       row=t1.getSelectedRow();
       column=t1.getColumnCount();
       if(row!=-1){
           Object[] rowData=new Object[column];
           for(int i=0;i<column;i++){
               rowData[i]=t1.getValueAt(row, i);
           }
           try{
               StringBuilder sqlBuilder=new StringBuilder("Update ").append(cbotable.getSelectedItem()).append(" SET ");
               for(int i=0;i<column;i++){
                   sqlBuilder.append(t1.getColumnName(i)).append(" =?");
                   if(i<column-1){
                       sqlBuilder.append(" ,");
                   }
               }
               sqlBuilder.append(" where ").append(t1.getColumnName(0)).append(" =?");
               String sql=sqlBuilder.toString();
               PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
               for(int i=0;i<column;i++){
                   stmt.setObject(i+1, rowData[i]);
               }
               stmt.setObject(column+1, rowData[0]);
               stmt.executeUpdate();
               JOptionPane.showMessageDialog(this, "Update Successful");
               refreshTable();
           }catch(Exception ex){
               JOptionPane.showMessageDialog(this, ex);
           }
       }else{
           JOptionPane.showMessageDialog(this, "No row selected");
       }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void refreshTable() {
    try {
        column=t1.getColumnCount();
        DefaultTableModel model = (DefaultTableModel)t1.getModel();
        model.setRowCount(0);
        String tableName = cbotable.getSelectedItem().toString();
        String sql = "SELECT * FROM " + tableName;
        PreparedStatement stmt = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Object[] rowData = new Object[column];
            for (int i = 0; i < column; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
    }
}

    
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       
        int row=t1.getSelectedRow();
        if(row!=-1){
           int dialog=JOptionPane.showConfirmDialog(this, "Are you sure want to delete?","Warning",JOptionPane.YES_NO_OPTION);
        if(dialog==JOptionPane.YES_OPTION){
            String rowData=t1.getValueAt(row, 0).toString();
            String columnname=t1.getColumnName(0);
            String tablename=cbotable.getSelectedItem().toString();
            String sql="Delete from "+tablename+" where "+columnname+" = '"+rowData+"'";
            try {
                PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Delete successful");
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(CusVsPro.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        }else if(dialog==JOptionPane.NO_OPTION){
            return;
        }
        
        }else{
            JOptionPane.showMessageDialog(this, "No row selected");
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String search=txtsearch.getText();
        String column=cbocolumn_name.getSelectedItem().toString();
        String table=cbotable.getSelectedItem().toString();
        String sql = "SELECT * FROM " + table + " WHERE " + column + " LIKE '" + search + "%'";
    try {
                ResultSet rs = null;
                PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
                rs=stmt.executeQuery();
                
                if(rs != null){
                    t1.setModel(DbUtils.resultSetToTableModel(rs));
                     txtsearch.setText("");
                }else{
                    JOptionPane.showMessageDialog(this, "No data found");
                    txtsearch.setText("");
                }
        } catch (SQLException ex) {
        Logger.getLogger(CusVsPro.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    try {
        Main m = new Main();
        m.setVisible(true);
        this.setVisible(false);
        } catch (SQLException ex) {
        Logger.getLogger(CusVsPro.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void display(){
        try{            
            String sql="select * from cos106. "+cbotable.getSelectedItem()+"";
            PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CusVsPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusVsPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusVsPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusVsPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CusVsPro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CusVsPro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new_column;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbocolumn_name;
    private javax.swing.JComboBox<String> cbotable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label5;
    private javax.swing.JTable t1;
    private yan.swing.TextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
