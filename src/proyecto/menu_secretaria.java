/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author estudiante
 */
public class menu_secretaria extends javax.swing.JFrame {

    /**
     * Creates new form secretaria
     */
    public menu_secretaria() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_cliente = new javax.swing.JButton();
        jb_producto = new javax.swing.JButton();
        jb_prveedor = new javax.swing.JButton();
        jb_venta = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jb_consultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_cliente.setBackground(new java.awt.Color(255, 255, 255));
        jb_cliente.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jb_cliente.setText("DATOS DE EL CLIENTE");
        jb_cliente.setToolTipText("datos de el cliente");
        jb_cliente.setEnabled(false);
        jb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, 65));

        jb_producto.setBackground(new java.awt.Color(255, 255, 255));
        jb_producto.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jb_producto.setText("DATOS DE EL PRODUCTO");
        jb_producto.setToolTipText("datos de el producto");
        jb_producto.setEnabled(false);
        jb_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 280, 65));

        jb_prveedor.setBackground(new java.awt.Color(255, 255, 255));
        jb_prveedor.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jb_prveedor.setText("DATOS DEL PROVEEDOR");
        jb_prveedor.setToolTipText("datos de el proveedor");
        jb_prveedor.setEnabled(false);
        jb_prveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_prveedorActionPerformed(evt);
            }
        });
        getContentPane().add(jb_prveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 270, 65));

        jb_venta.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jb_venta.setText("DATOS DE VENTA");
        jb_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(jb_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 280, 65));

        jb_salir.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jb_salir.setText("SALIR");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 280, 60));

        jb_consultar.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jb_consultar.setText("CONSULTAR Y ACTUALIZAR");
        jb_consultar.setEnabled(false);
        getContentPane().add(jb_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 270, 60));

        jLabel3.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMPRESA WICHITROCO S.A.");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/12.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 573));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clienteActionPerformed

        Cliente clientico = new Cliente();
        clientico.setVisible(true);

         menu_secretaria.this.dispose();
    }//GEN-LAST:event_jb_clienteActionPerformed

    private void jb_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_productoActionPerformed

        Datos_producto datico = new Datos_producto();
        datico.setVisible(true);

         menu_secretaria.this.dispose();
    }//GEN-LAST:event_jb_productoActionPerformed

    private void jb_prveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_prveedorActionPerformed

        Datos_Proveedor proveedor = new Datos_Proveedor();
        proveedor.setVisible(true);

        menu_secretaria.this.dispose();
    }//GEN-LAST:event_jb_prveedorActionPerformed

    private void jb_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ventaActionPerformed
        Datos_ventas ventica = new Datos_ventas();
        ventica.setVisible(true);

        menu_secretaria.this.dispose();
    }//GEN-LAST:event_jb_ventaActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jb_salirActionPerformed

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
            java.util.logging.Logger.getLogger(menu_secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_secretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_cliente;
    private javax.swing.JButton jb_consultar;
    private javax.swing.JButton jb_producto;
    private javax.swing.JButton jb_prveedor;
    private javax.swing.JButton jb_salir;
    private javax.swing.JButton jb_venta;
    // End of variables declaration//GEN-END:variables
}
