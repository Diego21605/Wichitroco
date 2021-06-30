
package proyecto;


import java.util.logging.Level;
import java.util.logging.Logger;


public class inicio extends javax.swing.JFrame implements Runnable {

     private Thread tiempo=null;
    
    public inicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
       
        
        tiempo=new Thread( this);
        tiempo.start();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/8385613acc26c29367f74306b3c99bd51641565a_00.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 310, 60));

        jLabel2.setFont(new java.awt.Font("Vijaya", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("BIENVENIDOS ...");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 310, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/Servicios-TI-2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static void main(String args[]) {
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
        
         try {
             Thread.sleep(5500);
             this.dispose();
             new login().setVisible(true);
         } catch (InterruptedException ex) {
             Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
