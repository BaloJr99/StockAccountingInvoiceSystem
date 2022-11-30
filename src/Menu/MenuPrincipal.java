package Menu;

import Usuarios.Usuarios;
import javax.swing.JOptionPane;


public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnContabilidad = new javax.swing.JButton();
        BtnTractores = new javax.swing.JButton();
        BtnEquipo = new javax.swing.JButton();
        BtnPartes = new javax.swing.JButton();
        BtnFacturacion = new javax.swing.JButton();
        BtnClientes = new javax.swing.JButton();
        BtnHonorarios = new javax.swing.JButton();
        BtnEmpleados = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setText("MENU PRINCIPAL");

        BtnContabilidad.setText("CONTABILIDAD");
        BtnContabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContabilidadActionPerformed(evt);
            }
        });

        BtnTractores.setText("TRACTORES");
        BtnTractores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTractoresActionPerformed(evt);
            }
        });

        BtnEquipo.setText("EQUIPO");
        BtnEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEquipoActionPerformed(evt);
            }
        });

        BtnPartes.setText("PARTES");
        BtnPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPartesActionPerformed(evt);
            }
        });

        BtnFacturacion.setText("FACTURACION");
        BtnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFacturacionActionPerformed(evt);
            }
        });

        BtnClientes.setText("CLIENTES");
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });

        BtnHonorarios.setText("HONORARIOS");
        BtnHonorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHonorariosActionPerformed(evt);
            }
        });

        BtnEmpleados.setText("EMPLEADOS");
        BtnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmpleadosActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnContabilidad)
                            .addComponent(BtnFacturacion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnTractores, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnHonorarios, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnPartes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(BtnContabilidad)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTractores)
                    .addComponent(BtnEquipo)
                    .addComponent(BtnPartes))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClientes)
                    .addComponent(BtnHonorarios)
                    .addComponent(BtnEmpleados))
                .addGap(18, 18, 18)
                .addComponent(BtnFacturacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BtnEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEquipoActionPerformed
        Equipos equipo = new Equipos();
        equipo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnEquipoActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
        Usuarios user = new Usuarios();
        user.setVisible(true);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnTractoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTractoresActionPerformed
        Tractores tractor = new Tractores();
        tractor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnTractoresActionPerformed

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        Clientes cliente = new Clientes();
        cliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnHonorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHonorariosActionPerformed
        Honorarios honorarios = new Honorarios();
        honorarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnHonorariosActionPerformed

    private void BtnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmpleadosActionPerformed
        Empleados empleado = new Empleados();
        empleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnEmpleadosActionPerformed

    private void BtnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFacturacionActionPerformed
        Facturas factura = new Facturas();
        factura.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnFacturacionActionPerformed

    private void BtnContabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContabilidadActionPerformed
        Contabilidad conta = new Contabilidad();
        conta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnContabilidadActionPerformed

    private void BtnPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPartesActionPerformed
        JOptionPane.showMessageDialog(this, "PROXIMAMENTE");
        Partes1 parte = new Partes1();
        parte.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnPartesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClientes;
    private javax.swing.JButton BtnContabilidad;
    private javax.swing.JButton BtnEmpleados;
    private javax.swing.JButton BtnEquipo;
    private javax.swing.JButton BtnFacturacion;
    private javax.swing.JButton BtnHonorarios;
    private javax.swing.JButton BtnPartes;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTractores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
