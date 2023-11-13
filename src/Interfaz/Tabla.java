package Interfaz;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {
    public DefaultTableModel tableModel;
    
    public void resetearCasillas(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText(""); 
    }
    
    public Tabla() {
        initComponents();
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/formdb","root","12345678");
                java.sql.Statement statement= con.createStatement();
                tableModel.setRowCount(0);
                ResultSet resultset= statement.executeQuery("select id,persona,actividad,fecha from calendar");

                while(resultset.next()){
                    Object[] filas= {resultset.getInt("id"),resultset.getString("persona"),resultset.getString("actividad"),resultset.getString("fecha")};
                    tableModel.addRow(filas);
                }
                
                con.close();
            } 
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            catch(SQLException e){}
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GuardarBoton = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mostrarLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 200, -1));

        jLabel1.setText("ACTIVIDAD A AGREGAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("NOMBRE DEL USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("FECHA A TERMINARLA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        GuardarBoton.setText("Guardar");
        GuardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPanel1.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 80, -1));

        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 90, 130, -1));

        mostrarLista.setText("Mostrar Lista");
        mostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarListaActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Persona", "Actividad", "Fecha a terminar"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void GuardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBotonActionPerformed
        // TODO add your handling code here:
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/formdb","root","12345678");
            java.sql.Statement statement= con.createStatement();
            String actividad= jTextField1.getText();
            String nombre= jTextField2.getText();
            String fecha= jTextField3.getText();
   
            statement.executeUpdate("insert into calendar (actividad, persona, fecha) values ('" + actividad + "','" + nombre + "','" + fecha + "')");
            
            tableModel.setRowCount(0);
            ResultSet resultset= statement.executeQuery("select id,persona,actividad,fecha from calendar");

                while(resultset.next()){
                    Object[] filas= {resultset.getInt("id"),resultset.getString("persona"),resultset.getString("actividad"),resultset.getString("fecha")};
                    tableModel.addRow(filas);
                }
            con.close();
        } 
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){}
            
    }//GEN-LAST:event_GuardarBotonActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        if(jTextField4.getText().length() <= 0){
            jLabel5.setText("Ingrese un numero");
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/formdb","root","12345678");
                java.sql.Statement statement= con.createStatement();
                
                tableModel.setRowCount(0);
                String idString= jTextField4.getText();
                int id= Integer.parseInt(idString);
                ResultSet resultset= statement.executeQuery("select * from calendar where id='"+id+"' ");

                if(resultset.next()){
                     Object[] filas= {resultset.getInt("id"),resultset.getString("persona"),resultset.getString("actividad"),resultset.getString("fecha")};
                    tableModel.addRow(filas);
                }
                
                con.close();
            } 
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            catch(SQLException e){}
            jLabel5.setText("");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        if(jTextField4.getText().length() <= 0){
            jLabel5.setText("Ingrese un numero");
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/formdb","root","12345678");
                java.sql.Statement statement= con.createStatement();
                String actividad= jTextField1.getText();
                String nombre= jTextField2.getText();
                String fecha= jTextField3.getText();
                String idString= jTextField4.getText();
                int id= Integer.parseInt(idString);
                
                tableModel.setRowCount(0);
                statement.executeUpdate("update calendar set actividad= '" + actividad + "', persona='" + nombre + "', fecha='" + fecha + "' where id='"+id+"' ");
                ResultSet resultset= statement.executeQuery("select * from calendar where id='"+id+"' ");

                if(resultset.next()){
                     Object[] filas= {resultset.getInt("id"),resultset.getString("persona"),resultset.getString("actividad"),resultset.getString("fecha")};
                    tableModel.addRow(filas);
                }
                con.close();
            } 
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            catch(SQLException e){}
        
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
        
        if(jTextField4.getText().length() <= 0){
            jLabel5.setText("Ingrese un numero");
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/formdb","root","12345678");
                java.sql.Statement statement= con.createStatement();
                String idString= jTextField4.getText();
                int id= Integer.parseInt(idString);

                int filas=statement.executeUpdate("delete from calendar where id=" + id);
//                con.commit();
                con.close();
                
                  if (filas > 0) {
                System.out.println("Fila eliminada exitosamente");
                } else {
                System.out.println("No se encontró ninguna fila para eliminar con el ID proporcionado.");
                }
            } 
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            catch(SQLException e){}
        
        }
        
    }//GEN-LAST:event_BorrarActionPerformed

    private void mostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarListaActionPerformed
        // TODO add your handling code here:
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/formdb","root","12345678");
                java.sql.Statement statement= con.createStatement();
                
                tableModel.setRowCount(0);
                ResultSet resultset= statement.executeQuery("select id,persona,actividad,fecha from calendar");

                while(resultset.next()){
                    Object[] filas= {resultset.getInt("id"),resultset.getString("persona"),resultset.getString("actividad"),resultset.getString("fecha")};
                    tableModel.addRow(filas);
                }
                
                con.close();
            } 
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            catch(SQLException e){}
        
            resetearCasillas();
    }//GEN-LAST:event_mostrarListaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton GuardarBoton;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton mostrarLista;
    // End of variables declaration//GEN-END:variables
}
