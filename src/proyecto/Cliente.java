
package proyecto;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {

    
    public Cliente() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxt_nombre = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jtxt_id = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jtxt_telefono = new javax.swing.JTextField();
        jtxt_rut = new javax.swing.JTextField();
        jtxt_direccion = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jb_registrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 340, 31));

        jLabel33.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 240, 240));
        jLabel33.setText("Identificacion del cliente");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 28));

        jLabel32.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(240, 240, 240));
        jLabel32.setText("Nombre del cliente");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 26));

        jLabel31.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(240, 240, 240));
        jLabel31.setText("Datos del cliente");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 33));

        jLabel35.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(240, 240, 240));
        jLabel35.setText("Numero de telefono");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 31));

        jLabel34.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setText("Direccion de residencia");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 29));

        jtxt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_idKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 340, 28));

        jLabel36.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(240, 240, 240));
        jLabel36.setText("RUT del cliente");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, 31));

        jtxt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 340, 31));

        jtxt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutActionPerformed(evt);
            }
        });
        jtxt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_rutKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 340, 31));

        jtxt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(jtxt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 340, 29));

        jButton7.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jButton7.setText("CANCELAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 130, 40));

        jb_registrar.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jb_registrar.setText("GUARDAR");
        jb_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 41));

        jButton1.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 130, 40));

        jButton3.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 433, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/13.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarActionPerformed
            
        String nombre="", direccion="", telefono="", rut="", identificacion="";
        
         if(jtxt_nombre.getText().length()==0
                ||jtxt_id.getText().length()==0
                ||jtxt_direccion.getText().length()==0
                ||jtxt_telefono.getText().length()==0
                ||jtxt_rut.getText().length()==0
                )
         
         {  
             JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS ","ALERTA ",1);
               
        }else {
                nombre=jtxt_nombre.getText();
                identificacion=jtxt_id.getText();
                direccion=jtxt_direccion.getText();
                telefono=jtxt_telefono.getText();
                rut=jtxt_rut.getText();

                 conexion con;
                try {
                    con = new conexion();
                    String insert;
                    insert = "insert into cliente values ('"+identificacion+"','"+nombre+"','"+direccion+"','"+telefono+"','"+rut+"')";
            
                    con.dml(insert);
                } catch (Exception ex) {
                    
                }
               
        jtxt_nombre.setText("");
        jtxt_id.setText("");
        jtxt_direccion.setText("");
        jtxt_telefono.setText("");
        jtxt_rut.setText("");
        
        jtxt_id.requestFocus();
        
         }
       
        
    }//GEN-LAST:event_jb_registrarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        submenu sub_menu = new submenu();
        sub_menu.setVisible(true);

        Cliente.this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jtxt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_nombreKeyTyped
        
        char c= evt.getKeyChar();
        
        if (Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar letras ");
        
    }
        
       
        
    }//GEN-LAST:event_jtxt_nombreKeyTyped

    private void jtxt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_idKeyTyped

        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar numeros ");
        
    
        }    }//GEN-LAST:event_jtxt_idKeyTyped

    private void jtxt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_direccionActionPerformed

    private void jtxt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_telefonoKeyTyped

        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar numeros ");
        
    }    }//GEN-LAST:event_jtxt_telefonoKeyTyped

    private void jtxt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_rutKeyTyped

        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar numeros ");
        
    }    }//GEN-LAST:event_jtxt_rutKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
            conexion con = new conexion ();
            ResultSet res;
            String id=jtxt_id.getText();
            String Sql="select * from cliente where id='"+id+"';";
            res=con.GetConsultar(Sql);
            if(res.next()==true){
                 jtxt_nombre.setText(res.getString("Nombre"));
                 jtxt_direccion.setText(res.getString("Direccion"));
                 jtxt_telefono.setText(res.getString("Telefono"));
                 jtxt_rut.setText(res.getString("RUT"));
                 
                     con.Setcerrar();
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "Datos erroneos");
                 }
            
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_rutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

           conexion con = new conexion();
           String id=jtxt_id.getText();
           String nombre=jtxt_nombre.getText();
           String direccion=jtxt_direccion.getText();
           String telefono=jtxt_telefono.getText();
           String rut=jtxt_rut.getText();
           String Sql="update cliente set Nombre='"+nombre+"',Direccion='"+direccion+"',Telefono='"+telefono+"',RUT='"+rut+"' where ID='"+id+"';";
           System.out.print(Sql);
           con.dml(Sql);
           JOptionPane.showMessageDialog(null, "Actualizacion con exito " , "FELICIDADES " , JOptionPane.OK_OPTION);
           con.Setcerrar();

        } catch (Exception ex) {
            Logger.getLogger(consultar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JButton jb_registrar;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_id;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_rut;
    private javax.swing.JTextField jtxt_telefono;
    // End of variables declaration//GEN-END:variables
}
