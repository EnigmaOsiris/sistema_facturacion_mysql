package Gui;
import Logica.Datos2;
import logica.DesktopConFondo;
public class FrmPrincipal extends javax.swing.JFrame {
    private Datos2 objDatos2;
    public FrmPrincipal(Datos2 objDatos2) {
        initComponents();
        this.objDatos2 = objDatos2;
    }
    
    public void empleado(){
        mnuArchivoClientes.setEnabled(false);
        mnuArchivoProductos.setEnabled(false);
        mnuArchivoUsuario.setEnabled(false);
        mnuMovimientosReporte_factura.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtpEscritorio = new DesktopConFondo();
        mbrBarraMenu = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuArchivoClientes = new javax.swing.JMenuItem();
        mnuArchivoProductos = new javax.swing.JMenuItem();
        mnuArchivoUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoCambio_clave = new javax.swing.JMenuItem();
        mnuArchivoCambio_usuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoCerrar_sesion = new javax.swing.JMenuItem();
        mnuMovimientos = new javax.swing.JMenu();
        mnuMovimientosNueva_factura = new javax.swing.JMenuItem();
        mnuMovimientosReporte_factura = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaAyuda = new javax.swing.JMenuItem();
        mnuAyudaAcerca_de = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de facturacion");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                cerarSesion(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dtpEscritorio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dtpEscritorioLayout = new javax.swing.GroupLayout(dtpEscritorio);
        dtpEscritorio.setLayout(dtpEscritorioLayout);
        dtpEscritorioLayout.setHorizontalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        dtpEscritorioLayout.setVerticalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");

        mnuArchivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886285_Client_Male_Light.png"))); // NOI18N
        mnuArchivoClientes.setText("Clientes");
        mnuArchivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoClientesActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoClientes);

        mnuArchivoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886582_Product-documentation.png"))); // NOI18N
        mnuArchivoProductos.setText("Productos");
        mnuArchivoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoProductosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoProductos);

        mnuArchivoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886637_userconfig.png"))); // NOI18N
        mnuArchivoUsuario.setText("Usuarios");
        mnuArchivoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoUsuarioActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoUsuario);
        mnuArchivo.add(jSeparator1);

        mnuArchivoCambio_clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886614_Login Manager.png"))); // NOI18N
        mnuArchivoCambio_clave.setText("Cambio clave");
        mnuArchivoCambio_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambio_claveActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCambio_clave);

        mnuArchivoCambio_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886614_Login Manager.png"))); // NOI18N
        mnuArchivoCambio_usuario.setText("Cambio usuario");
        mnuArchivoCambio_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambio_usuarioActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCambio_usuario);
        mnuArchivo.add(jSeparator2);

        mnuArchivoCerrar_sesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuArchivoCerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886806_go-home.png"))); // NOI18N
        mnuArchivoCerrar_sesion.setText("Cerrar sesión");
        mnuArchivoCerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCerrar_sesionActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCerrar_sesion);

        mbrBarraMenu.add(mnuArchivo);

        mnuMovimientos.setText("Movimientos");

        mnuMovimientosNueva_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456887076_document-new.png"))); // NOI18N
        mnuMovimientosNueva_factura.setText("Nueva factura");
        mnuMovimientosNueva_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimientosNueva_facturaActionPerformed(evt);
            }
        });
        mnuMovimientos.add(mnuMovimientosNueva_factura);

        mnuMovimientosReporte_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886201_order-history.png"))); // NOI18N
        mnuMovimientosReporte_factura.setText("Reporte factura");
        mnuMovimientosReporte_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimientosReporte_facturaActionPerformed(evt);
            }
        });
        mnuMovimientos.add(mnuMovimientosReporte_factura);

        mbrBarraMenu.add(mnuMovimientos);

        mnuAyuda.setText("Ayuda");

        mnuAyudaAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886668_Help.png"))); // NOI18N
        mnuAyudaAyuda.setText("Ayuda");
        mnuAyudaAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaAyudaActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaAyuda);

        mnuAyudaAcerca_de.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886678_Information.png"))); // NOI18N
        mnuAyudaAcerca_de.setText("Acerca de...");
        mnuAyudaAcerca_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaAcerca_deActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaAcerca_de);

        mbrBarraMenu.add(mnuAyuda);

        setJMenuBar(mbrBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void mnuArchivoCerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCerrar_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuArchivoCerrar_sesionActionPerformed
    
    private void mnuArchivoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoUsuarioActionPerformed
        FrmUsuarios objUsuario = new FrmUsuarios(objDatos2);
        objUsuario.setLocation(350, 150);
        dtpEscritorio.add(objUsuario);
        objUsuario.show();
    }//GEN-LAST:event_mnuArchivoUsuarioActionPerformed
    
    private void mnuArchivoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoProductosActionPerformed
        FrmProductos objProductos = new FrmProductos(objDatos2);
        objProductos.setLocation(320, 130);
        dtpEscritorio.add(objProductos);
        objProductos.show();
    }//GEN-LAST:event_mnuArchivoProductosActionPerformed
    
    private void mnuArchivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoClientesActionPerformed
        FrmClientes objClientes = new FrmClientes(objDatos2);
        objClientes.setLocation(170, 80);
        dtpEscritorio.add(objClientes);
        objClientes.show();
    }//GEN-LAST:event_mnuArchivoClientesActionPerformed
    
    private void mnuArchivoCambio_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambio_claveActionPerformed
        FrmCambioClave objCambiarClave = new FrmCambioClave(this, rootPaneCheckingEnabled, objDatos2);
        objCambiarClave.setLocationRelativeTo(null);
        objCambiarClave.setVisible(true);
    }//GEN-LAST:event_mnuArchivoCambio_claveActionPerformed
    
    private void mnuArchivoCambio_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambio_usuarioActionPerformed
        this.dispose();
        FrmLogin objLogin = new FrmLogin();
        objLogin.setLocationRelativeTo(null);
        objLogin.setVisible(true);
    }//GEN-LAST:event_mnuArchivoCambio_usuarioActionPerformed

    private void cerarSesion(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerarSesion
    }//GEN-LAST:event_cerarSesion

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((DesktopConFondo) dtpEscritorio).setImagen("/Imagenes/Fondo.jpg");
    }//GEN-LAST:event_formWindowOpened

    private void mnuAyudaAcerca_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaAcerca_deActionPerformed
        FrmAcercaDe objfrmAcercaDe=new FrmAcercaDe(this, rootPaneCheckingEnabled);
        objfrmAcercaDe.setLocationRelativeTo(null);
        objfrmAcercaDe.setVisible(true);
    }//GEN-LAST:event_mnuAyudaAcerca_deActionPerformed

    private void mnuMovimientosNueva_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimientosNueva_facturaActionPerformed
        FrmFactura objFrmFactura=new FrmFactura(objDatos2);
        dtpEscritorio.add(objFrmFactura);
        objFrmFactura.show();
    }//GEN-LAST:event_mnuMovimientosNueva_facturaActionPerformed

    private void mnuAyudaAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaAyudaActionPerformed
        FrmAyuda objAyuda = new FrmAyuda(this, rootPaneCheckingEnabled);
        objAyuda.setLocationRelativeTo(this);
        objAyuda.setVisible(true);
    }//GEN-LAST:event_mnuAyudaAyudaActionPerformed

    private void mnuMovimientosReporte_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimientosReporte_facturaActionPerformed
        FrmReporteFactura objReporte = new FrmReporteFactura(objDatos2);
        objReporte.setLocation(170, 80);
        dtpEscritorio.add(objReporte);
        objReporte.show();
    }//GEN-LAST:event_mnuMovimientosReporte_facturaActionPerformed
    
    public static void main(String args[]) {
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });*/
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dtpEscritorio;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar mbrBarraMenu;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuArchivoCambio_clave;
    private javax.swing.JMenuItem mnuArchivoCambio_usuario;
    private javax.swing.JMenuItem mnuArchivoCerrar_sesion;
    private javax.swing.JMenuItem mnuArchivoClientes;
    private javax.swing.JMenuItem mnuArchivoProductos;
    private javax.swing.JMenuItem mnuArchivoUsuario;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuAyudaAcerca_de;
    private javax.swing.JMenuItem mnuAyudaAyuda;
    private javax.swing.JMenu mnuMovimientos;
    private javax.swing.JMenuItem mnuMovimientosNueva_factura;
    private javax.swing.JMenuItem mnuMovimientosReporte_factura;
    // End of variables declaration//GEN-END:variables
}
