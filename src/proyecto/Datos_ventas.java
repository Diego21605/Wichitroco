
package proyecto;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Datos_ventas extends javax.swing.JFrame {

   
    public Datos_ventas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
         Date sistFecha = new Date();
         SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-YYYY");
         jlabel_fecha.setText(formato.format(sistFecha));
  
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxt_precio_pro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxt_c_vendida = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxt_id_producto = new javax.swing.JTextField();
        jtxt_nombre_producto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jlabel_monto_total = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_id_cliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxt_nombre_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxt_telefono_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxt_n_venta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlabel_fecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jtxt_descuento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jlabel_monto_final = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Producto"));

        jLabel6.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel6.setText("Nombre del producto ");

        jLabel8.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel8.setText("Precio del producto");

        jtxt_precio_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_precio_proActionPerformed(evt);
            }
        });
        jtxt_precio_pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_precio_proKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel7.setText("Cantidad vendida");

        jtxt_c_vendida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_c_vendidaActionPerformed(evt);
            }
        });
        jtxt_c_vendida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_c_vendidaKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel13.setText("Id del producto");

        jtxt_id_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_id_productoActionPerformed(evt);
            }
        });
        jtxt_id_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_id_productoKeyTyped(evt);
            }
        });

        jtxt_nombre_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombre_productoActionPerformed(evt);
            }
        });
        jtxt_nombre_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_nombre_productoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel12.setText("Monto total");

        jlabel_monto_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton3.setText("MONTO TOTAL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtxt_id_producto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_c_vendida, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_precio_pro)
                            .addComponent(jtxt_nombre_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jlabel_monto_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtxt_nombre_producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_precio_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_c_vendida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabel_monto_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));
        jPanel2.setToolTipText("Cliente");
        jPanel2.setName("Cliente"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel5.setText("Id. del Cliente");

        jtxt_id_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_id_clienteKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel9.setText("Nombre del cliente");

        jtxt_nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombre_clienteActionPerformed(evt);
            }
        });
        jtxt_nombre_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_nombre_clienteKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel2.setText("Telefono del cliente");

        jtxt_telefono_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_telefono_clienteKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel3.setText("Número de venta");

        jtxt_n_venta.setText("1");
        jtxt_n_venta.setEnabled(false);
        jtxt_n_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_n_ventaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel4.setText("Fecha");

        jlabel_fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_id_cliente)
                            .addComponent(jtxt_telefono_cliente)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtxt_nombre_cliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_n_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jlabel_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_n_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jlabel_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jButton1.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Pago final"));

        jtxt_descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_descuentoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Vijaya", 1, 30)); // NOI18N
        jLabel10.setText("Monto final ");

        jlabel_monto_final.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Vijaya", 1, 30)); // NOI18N
        jLabel11.setText("Descuento");

        jLabel14.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jLabel14.setText("EL DESCUENTO DEBE SER  ");

        jButton4.setFont(new java.awt.Font("Vijaya", 1, 22)); // NOI18N
        jButton4.setText("CALCULAR EL MONTO FINAL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Vijaya", 1, 20)); // NOI18N
        jLabel15.setText("DIGITADO EN NUMEROS ENTEROS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtxt_descuento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlabel_monto_final, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jtxt_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jlabel_monto_final, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        jLabel1.setText("WICHITROCO S.A");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_id_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_id_productoActionPerformed

    }//GEN-LAST:event_jtxt_id_productoActionPerformed

    private void jtxt_nombre_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombre_productoActionPerformed
         
    }//GEN-LAST:event_jtxt_nombre_productoActionPerformed

    private void jtxt_nombre_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_nombre_productoKeyTyped
        
        char c= evt.getKeyChar();
        
        if (Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN DIGITAR LETRAS ");
        
        }
    }//GEN-LAST:event_jtxt_nombre_productoKeyTyped

    private void jtxt_nombre_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_nombre_clienteKeyTyped

        char c= evt.getKeyChar();

        if (Character.isDigit(c)){

            evt.consume();

            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN DIGITAR LETRAS ","ALERTA ",1);

        }
    }//GEN-LAST:event_jtxt_nombre_clienteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre_cliente="",nombre_producto="",monto_t="",monto_f="";
      
       
        
        String telefono_cliente="";
        String identificacion_cliente="";
        String id_producto="";
        String precio_producto="";
        String c_producto="";
        String descuento="";
        
        
        if(jtxt_nombre_cliente.getText().length()==0
                ||jtxt_id_cliente.getText().length()==0
                ||jtxt_telefono_cliente.getText().length()==0
                ||jtxt_nombre_producto.getText().length()==0
                ||jtxt_id_producto.getText().length()==0
                ||jtxt_precio_pro.getText().length()==0
                ||jtxt_c_vendida.getText().length()==0
                ||jtxt_descuento.getText().length()==0
                ||jlabel_fecha.getText().length()==0){
            
                JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS ","ALERTA ",1);

               jtxt_nombre_cliente.requestFocus();
            
                
        }else{
       
                int n_ventas=0;
                n_ventas++;
                jtxt_n_venta.setText(""+n_ventas);
                
            
                nombre_cliente=jtxt_nombre_cliente.getText();
                identificacion_cliente=jtxt_id_cliente.getText();
                telefono_cliente=jtxt_telefono_cliente.getText();

                nombre_producto=jtxt_nombre_producto.getText();
                id_producto=jtxt_id_producto.getText();
                precio_producto=jtxt_precio_pro.getText();
                c_producto=jtxt_c_vendida.getText();
                
               monto_t=jlabel_monto_total.getText();
               descuento=jtxt_descuento.getText();
               monto_f=jlabel_monto_final.getText();

               
                conexion con;
                try {
                    con = new conexion();
                    String insert;
                    insert = "insert into ventas values ('"+nombre_cliente+"','"+identificacion_cliente+"','"+telefono_cliente+"','"+jtxt_n_venta.getText()+"','"+jlabel_fecha.getText()+"','"+nombre_producto+"','"+id_producto+"','"+precio_producto+"','"+c_producto+"','"+monto_t+"','"+descuento+"','"+monto_f+"')";
            
                    con.dml(insert);
                    
                } catch (Exception ex) {
                  
                }
               
               
        
}
        jtxt_nombre_cliente.setText("");
        jtxt_id_cliente.setText("");
        jtxt_telefono_cliente.setText("");
        jtxt_nombre_producto.setText("");
        jtxt_id_producto.setText("");
        jtxt_precio_pro.setText("");
        jtxt_c_vendida.setText("");
        jtxt_descuento.setText("");
        jlabel_monto_total.setText("");
        jlabel_monto_final.setText("");
        
     jtxt_nombre_cliente.requestFocus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        submenu sub_menu = new submenu();
        sub_menu.setVisible(true);

        Datos_ventas.this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        
   if( "".equals(jtxt_precio_pro.getText()) || "".equals(jtxt_c_vendida.getText()) ){
        
       JOptionPane.showMessageDialog(null, "ERROR, EXISTE UN CAMPO VACÍO ", "ALERTA",1); 
        
   }else{ 
       int monto_total = 0;
         int precio_productos = 0 , c_productos = 0;
         precio_productos=Integer.parseInt(jtxt_precio_pro.getText());
       c_productos=Integer.parseInt(jtxt_c_vendida.getText());
       monto_total=precio_productos*c_productos;
         jlabel_monto_total.setText(""+monto_total);
       
       
   }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtxt_precio_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_precio_proActionPerformed
   
    }//GEN-LAST:event_jtxt_precio_proActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        if("".equals(jtxt_descuento.getText())){
            
        JOptionPane.showMessageDialog(null, "ERROR, NO HA DIGITADO EL DESCUENTO ","ALERTA",1);   
        
       }else{
             double descuento_1 = 0, monto_desc = 0, mont_total = 0, monto_final = 0;
       mont_total=Double.parseDouble(jlabel_monto_total.getText());
            descuento_1=Double.parseDouble(jtxt_descuento.getText());
      
            monto_desc=(mont_total*descuento_1/100);
            
            monto_final=mont_total-monto_desc;
            
            jlabel_monto_final.setText(""+monto_final);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtxt_id_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_id_clienteKeyTyped
        
        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN DIGITAR NUMEROS  ","ALERTA ",1);
        
        }
        
    }//GEN-LAST:event_jtxt_id_clienteKeyTyped

    private void jtxt_telefono_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_telefono_clienteKeyTyped
        
        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN DIGITAR NUMEROS  ","ALERTA ",1);
        
        }
        
    }//GEN-LAST:event_jtxt_telefono_clienteKeyTyped

    private void jtxt_descuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_descuentoKeyTyped
        
        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN DIGITAR NUMEROS ","ALERTA ",1);
        
        }
        
    }//GEN-LAST:event_jtxt_descuentoKeyTyped

    private void jtxt_id_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_id_productoKeyTyped

        char c= evt.getKeyChar();
        
        if (!Character.isDigit(c)){
        
        evt.consume();
   
        JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN DIGITAR NUMEROS ","ALERTA ",1);
        
        }
        
    
    }//GEN-LAST:event_jtxt_id_productoKeyTyped

    private void jtxt_precio_proKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_precio_proKeyTyped
       
        char v = evt.getKeyChar();
        if(!Character.isDigit(v)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN DIGITAR NUMEROS ","ALERTA ",1);
        }  
    }//GEN-LAST:event_jtxt_precio_proKeyTyped

    private void jtxt_c_vendidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_c_vendidaKeyTyped
        
        char v = evt.getKeyChar();
        if(!Character.isDigit(v)){
           evt.consume();
           JOptionPane.showInternalMessageDialog(null, "SOLO SE PUEDEN DIGITAR NUMEROS ","ALERTA ",1);
        }
    }//GEN-LAST:event_jtxt_c_vendidaKeyTyped

    private void jtxt_c_vendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_c_vendidaActionPerformed
  
    }//GEN-LAST:event_jtxt_c_vendidaActionPerformed

    private void jtxt_nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombre_clienteActionPerformed
       
    }//GEN-LAST:event_jtxt_nombre_clienteActionPerformed

    private void jtxt_n_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_n_ventaActionPerformed
       
    }//GEN-LAST:event_jtxt_n_ventaActionPerformed

    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datos_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jlabel_fecha;
    private javax.swing.JLabel jlabel_monto_final;
    private javax.swing.JLabel jlabel_monto_total;
    private javax.swing.JTextField jtxt_c_vendida;
    private javax.swing.JTextField jtxt_descuento;
    private javax.swing.JTextField jtxt_id_cliente;
    private javax.swing.JTextField jtxt_id_producto;
    private javax.swing.JTextField jtxt_n_venta;
    private javax.swing.JTextField jtxt_nombre_cliente;
    private javax.swing.JTextField jtxt_nombre_producto;
    private javax.swing.JTextField jtxt_precio_pro;
    private javax.swing.JTextField jtxt_telefono_cliente;
    // End of variables declaration//GEN-END:variables
}
