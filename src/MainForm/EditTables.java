package MainForm;
import java.sql.DatabaseMetaData;
import yan.connection.DatabaseConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class EditTables extends javax.swing.JFrame {

    public EditTables() throws SQLException {
        initComponents();
        DatabaseConnection.getInstance().connectToDatabase();
        gettablename();
        chk2.setEnabled(false);
        chk3.setEnabled(false);
    }

    public void gettablename(){
        try{
            DatabaseMetaData meta=DatabaseConnection.getInstance().getConnection().getMetaData();
            String[] type={"TABLE"};
            ResultSet rs=meta.getTables("cos106", null, null, type);
            while(rs.next()){
                String tablename=rs.getString("TABLE_NAME");
                if(!tablename.equals("customer")&& !tablename.equals("pc_product")){
                cbotable.addItem(tablename);
                }
            }
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void display(){
        try{
            String sql="describe "+cbotable.getSelectedItem()+"";
            PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        imageAvator2 = new yan.swing.ImageAvator();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        cbotable = new javax.swing.JComboBox<>();
        txtcolumn = new yan.swing.TextField();
        cbodatatype = new javax.swing.JComboBox<>();
        chk2 = new javax.swing.JCheckBox();
        chk1 = new javax.swing.JCheckBox();
        button1 = new com.raven.swing.Button();
        button2 = new com.raven.swing.Button();
        button3 = new com.raven.swing.Button();
        button4 = new com.raven.swing.Button();
        jButton1 = new javax.swing.JButton();
        chk3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 213, 125));

        jPanel2.setBackground(new java.awt.Color(241, 190, 139));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Edit Tables");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(58, 111, 218));
        label5.setText("BUC Pc Repair Company Ltd;");

        imageAvator2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yan/icons/build(1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageAvator2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(imageAvator2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Select Table Here");

        cbotable.setBackground(new java.awt.Color(204, 204, 204));
        cbotable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbotableItemStateChanged(evt);
            }
        });

        txtcolumn.setBackground(new java.awt.Color(184, 213, 125));
        txtcolumn.setLabelText("Column Name");
        txtcolumn.setLineColor(new java.awt.Color(51, 51, 51));
        txtcolumn.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        cbodatatype.setBackground(new java.awt.Color(204, 204, 204));
        cbodatatype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "varchar(50)", "varchar(20)", "date", "time", "float", "double" }));

        chk2.setForeground(new java.awt.Color(0, 0, 0));
        chk2.setText("Primary Key");

        chk1.setForeground(new java.awt.Color(0, 0, 0));
        chk1.setText("NULL");

        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setText("Add new Column");
        button1.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setText("Update Column");
        button2.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setText("Delete Column");
        button3.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setForeground(new java.awt.Color(0, 0, 0));
        button4.setText("Delete Table");
        button4.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chk3.setForeground(new java.awt.Color(0, 0, 0));
        chk3.setText("Foreign Key");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbotable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbodatatype, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(chk1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addComponent(chk2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbodatatype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk1))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbotableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbotableItemStateChanged
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_cbotableItemStateChanged

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)t1.getModel();
        int index=t1.getSelectedRow();
        txtcolumn.setText(model.getValueAt(index, 0).toString());
        cbodatatype.setSelectedItem(model.getValueAt(index, 1).toString());
        if(model.getValueAt(index, 2).toString().endsWith("YES")){
            chk1.setSelected(true);
        }else {
            chk1.setSelected(false);
        }
        if(model.getValueAt(index, 3).toString().endsWith("PRI")){
            chk2.setSelected(true);
        }else chk2.setSelected(false);
        if(model.getValueAt(index, 3).toString().endsWith("MUL")){
            chk3.setSelected(true);
        }else chk3.setSelected(false);
    }//GEN-LAST:event_t1MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        String name=txtcolumn.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter information");
        }else{
        String type=cbodatatype.getSelectedItem().toString();
        String st;
        String key;
        if(chk1.isSelected()==true){
            st="NULL";
        }else{
            st="NOT NULL";
        }
        
        if(chk2.isSelected()==true){
            key="primery key";
        }else{
            key="";
        }
        
        try{
            String sql="alter table cos106. "+cbotable.getSelectedItem()+" add "+name+" "+type+" "+st+" "+key+"";
            PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);  
            stmt.execute();
            JOptionPane.showMessageDialog(this, "Insert Successful");
            clear();
            display();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        int row=t1.getSelectedRow();
        if(row!=-1){
        String oldName=t1.getValueAt(row, 0).toString();
        String newName=txtcolumn.getText();
        String type=cbodatatype.getSelectedItem().toString();
        String st,pKey;
        
        if(chk1.isSelected()==true){
            st="NULL";
        }else{
            st="NOT NULL";
        }
        
        if(chk2.isSelected()==true){
            pKey="primery key";
        }else{
            pKey="";
        }
        
         try{
     
                String sql = "ALTER TABLE cos106." + cbotable.getSelectedItem() + " CHANGE " + oldName + " " + newName + " " + type + " " + st + " " + pKey;
            PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(this, "Update successful");
            clear();
            display();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(this, "No row selected to update.");
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        int row=t1.getSelectedRow();
        if(row!=-1){
            int dialog=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Warning", JOptionPane.YES_NO_OPTION);
            if(dialog==JOptionPane.YES_OPTION){
        try{String column_name=t1.getValueAt(row, 0).toString();
            String table_name=cbotable.getSelectedItem().toString();
            String sql = "alter table " + table_name + " drop column " + column_name;
            PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(this, "Delete successfully");
            clear();
            display();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }}
            else if (dialog == JOptionPane.NO_OPTION) {
        return;
    }
        }else{
            JOptionPane.showMessageDialog(this, "No row Selected to delete");
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed

        int dialog=JOptionPane.showConfirmDialog(this, "Are you sure want to delete?","Warning",JOptionPane.YES_NO_OPTION);
        if(dialog==JOptionPane.YES_OPTION){
        try{
            String table_name=cbotable.getSelectedItem().toString();
            String sql="drop table cos106. "+table_name;
            PreparedStatement stmt=DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete Successfully");
            clear();
            cbotable.removeItem(table_name);
            display();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }}
        if(dialog==JOptionPane.NO_OPTION){
            return;
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Main m=new Main();
            m.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(EditTables.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clear(){
        txtcolumn.setText("");
        chk1.setSelected(false);
        chk2.setSelected(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditTables().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditTables.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button button1;
    private com.raven.swing.Button button2;
    private com.raven.swing.Button button3;
    private com.raven.swing.Button button4;
    private javax.swing.JComboBox<String> cbodatatype;
    private javax.swing.JComboBox<String> cbotable;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private yan.swing.ImageAvator imageAvator2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label5;
    private javax.swing.JTable t1;
    private yan.swing.TextField txtcolumn;
    // End of variables declaration//GEN-END:variables
}
