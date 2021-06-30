
package proyecto;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Datos_Proveedor extends javax.swing.JFrame {

    
    public Datos_Proveedor() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_rut = new javax.swing.JTextField();
        jtxt_paginawed = new javax.swing.JTextField();
        jtxt_direccion = new javax.swing.JTextField();
        jtxt_telefono = new javax.swing.JTextField();
        jtxt_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 120, 40));

        jButton1.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 120, 40));

        jtxt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        jtxt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 240, 40));

        jtxt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_rutKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 240, 40));
        getContentPane().add(jtxt_paginawed, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 240, 40));
        getContentPane().add(jtxt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 240, 40));

        jtxt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 240, 40));

        jtxt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idActionPerformed(evt);
            }
        });
        jtxt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_idKeyTyped(evt);
            }
        });
        getContentPane().add(jtxt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 240, 40));

        jLabel8.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("RUT del proveedor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 240, 40));

        jLabel7.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Pagina web del proveedor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 240, 40));

        jLabel6.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Direccion del proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 40));

        jLabel5.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Telefono del proveedor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 40));

        jLabel4.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Identificacion del proveedor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 40));

        jLabel3.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Nombre del proveedor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 230, 40));

        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Datos del proveedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 270, 50));

        jButton4.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 110, 40));

        jButton3.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/4-min.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
         String nombre="", direccion="", telefono="", rut="", identificacion="", paginaweb="";
         
         
        if(jtxt_nombre.getText().length()==0
                ||jtxt_id.getText().length()==0
                ||jtxt_direccion.getText().length()==0
                ||jtxt_telefono.getText().length()==0
                ||jtxt_rut.getText().length()==0
                ||jtxt_paginawed.getText().length()==0){
            
                JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS ","ALERTA ",1);
        
               jtxt_nombre.requestFocus();
                
        }else {
        

             try {
                 nombre=jtxt_nombre.getText();
                 identificacion=jtxt_id.getText();
                 direccion=jtxt_direccion.getText();
                 telefono=jtxt_telefono.getText();
                 rut=jtxt_rut.getText();
                 paginaweb=jtxt_paginawed.getText();
                 
                 conexion con;
                 
                 con = new conexion();
                 String insert;
                 insert = "insert into proveedor values ('"+identificacion+"','"+nombre+"','"+telefono+"','"+direccion+"','"+rut+"','"+paginaweb+"')";
                 
                 
                 con.dml(insert);
                 
       
             } catch (Exception ex) {
                 
             }
         
                 jtxt_nombre.setText("");
                 jtxt_id.setText("");
                 jtxt_direccion.setText("");
                 jtxt_telefono.setText("");
                 jtxt_rut.setText("");
                 jtxt_paginawed.setText("");
        
                  jtxt_id.requestFocus();
                 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        submenu sub_menu = new submenu();
        sub_menu.setVisible(true);
        
        Datos_Proveedor.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtxt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_nombreKeyTyped

        char c= evt.getKeyChar();
        
        if (Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar letras ");
        
    }    }//GEN-LAST:event_jtxt_nombreKeyTyped

    private void jtxt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_idKeyTyped
       
        
        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar numeros ");
        
    }
    }//GEN-LAST:event_jtxt_idKeyTyped

    private void jtxt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_telefonoKeyTyped


        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar numeros ");
        
    }
    }//GEN-LAST:event_jtxt_telefonoKeyTyped

    private void jtxt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_rutKeyTyped
        
        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "Solo puede digitar numeros ");
        
    }
    }//GEN-LAST:event_jtxt_rutKeyTyped

    private void jtxt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            conexion con = new conexion ();
            ResultSet res;
            String id=jtxt_id.getText();
            String Sql="select * from proveedor where id='"+id+"';";
            res=con.GetConsultar(Sql);
            if(res.next()==true){
                jtxt_nombre.setText(res.getString("nombre"));
                jtxt_telefono.setText(res.getString("Telefono"));
                jtxt_direccion.setText(res.getString("Direccion"));
                jtxt_rut.setText(res.getString("Rut"));
                jtxt_paginawed.setText(res.getString("PaginaWeb"));
                
                con.Setcerrar();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Datos erroneos");

            }

        } catch (Exception ex) {
            Logger.getLogger(consultar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

            conexion con = new conexion();
           String id=jtxt_id.getText();
           String nombre=jtxt_nombre.getText();
           String telefono=jtxt_telefono.getText();
           String direccion=jtxt_direccion.getText();
           String paginaweb=jtxt_paginawed.getText();
           String rut=jtxt_rut.getText();
           String Sql="update proveedor set nombre='"+nombre+"', telefono='"+telefono+"',direccion='"+direccion+"',Rut='"+rut+"',PaginaWeb='"+paginaweb+"' where ID="+id+";";
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
            java.util.logging.Logger.getLogger(Datos_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Proveedor().setVisible(true);
            }
        });
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_id;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_paginawed;
    private javax.swing.JTextField jtxt_rut;
    private javax.swing.JTextField jtxt_telefono;
    // End of variables declaration//GEN-END:variables
}
