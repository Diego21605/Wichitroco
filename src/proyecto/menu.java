
package proyecto;

public class menu extends javax.swing.JFrame {

    
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        menu = new javax.swing.JPanel();
        jtxt_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Datos_producto = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        menu.setBackground(new java.awt.Color(204, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxt_salir.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jtxt_salir.setText("SALIR");
        jtxt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_salirActionPerformed(evt);
            }
        });
        menu.add(jtxt_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 250, 60));

        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPRESA WICHITROCO S.A.");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 400, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton2.setText("DATOS DEL PROVEEDOR");
        jButton2.setToolTipText("datos de el proveedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 270, 65));

        Datos_producto.setBackground(new java.awt.Color(255, 255, 255));
        Datos_producto.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        Datos_producto.setText("DATOS DE EL PRODUCTO");
        Datos_producto.setToolTipText("datos de el producto");
        Datos_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Datos_productoActionPerformed(evt);
            }
        });
        menu.add(Datos_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 280, 65));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton4.setText("DATOS DE EL CLIENTE");
        jButton4.setToolTipText("datos de el cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, 65));

        jButton3.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton3.setText("DATOS DE VENTA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 270, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/12.jpg"))); // NOI18N
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Datos_ventas ventica = new Datos_ventas();
        ventica.setVisible(true);

        menu.this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Cliente clientico = new Cliente();
        clientico.setVisible(true);

        menu.this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void Datos_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Datos_productoActionPerformed

        Datos_producto datico = new Datos_producto();
        datico.setVisible(true);

        menu.this.dispose();

    }//GEN-LAST:event_Datos_productoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Datos_Proveedor proveedor = new Datos_Proveedor();
        proveedor.setVisible(true);
        
        menu.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtxt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_salirActionPerformed
        
        
        System.exit(0);
        
    }//GEN-LAST:event_jtxt_salirActionPerformed

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Datos_producto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jtxt_salir;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
