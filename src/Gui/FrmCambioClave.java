package Gui;
import Logica.Datos2;
import Logica.Usuarios;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class FrmCambioClave extends javax.swing.JDialog {
    Datos2 objDatos2;
    public FrmCambioClave(Frame parent, boolean modal, Datos2 objDatos) {
        super(parent, modal);
        initComponents();
        this.objDatos2 = objDatos;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pxtNuevaClave = new javax.swing.JPasswordField();
        pxtConfirmacion = new javax.swing.JPasswordField();
        pxtClaveActual = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nueva clave:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Confirmación:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Clave actual:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 30, 120, 30);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(70, 160, 120, 30);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(240, 160, 110, 30);

        pxtNuevaClave.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(pxtNuevaClave);
        pxtNuevaClave.setBounds(150, 70, 180, 30);

        pxtConfirmacion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        pxtConfirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(pxtConfirmacion);
        pxtConfirmacion.setBounds(150, 110, 180, 30);

        pxtClaveActual.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(pxtClaveActual);
        pxtClaveActual.setBounds(150, 30, 180, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1457249247_system-config-root.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 30, 130, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(new String(pxtClaveActual.getPassword()).equals("") || new String(pxtNuevaClave.getPassword()).equals("") || new String(pxtConfirmacion.getPassword()).equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos");
            return;
        }
        
        String id = objDatos2.getidLoggeado();
        String clave = objDatos2.getClave();
        if(new String(pxtClaveActual.getPassword()).equals(clave)){
            if(new String(pxtNuevaClave.getPassword()).equals(new String(pxtConfirmacion.getPassword()))){
                clave = new String(pxtNuevaClave.getPassword());
                
                //actualizar clave del usuario loggeado
                Usuarios objUsuarios = new Usuarios();
                ResultSet st = objDatos2.getUsuarios();
                String msg = null;
                boolean ban=true;
                try {
                    while(st.next() && ban){
                        String idUs = st.getString("idUsuarioss");
                        if(idUs.equals(id)){
                            objUsuarios.setIdUsuario(id);
                            objUsuarios.setNombre(st.getString("nombres"));
                            objUsuarios.setApellidos(st.getString("apellidos"));
                            objUsuarios.setClave(new String(pxtConfirmacion.getPassword()));
                            objUsuarios.setPerfil(st.getInt("idPerfil"));
                            msg = objDatos2.agregarUsuario(objUsuarios, true);
                            msg = "Clave cambiado con éxito";
                            ban=false;
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(FrmCambioClave.class.getName()).log(Level.SEVERE, null, ex);
                    msg = "Error al cambiar clave";
                }
                JOptionPane.showMessageDialog(rootPane, msg);
                this.dispose();
                return;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Las claves no coinciden");
                pxtClaveActual.setText("");
                pxtNuevaClave.setText("");
                pxtConfirmacion.setText("");
                pxtClaveActual.requestFocusInWindow();
                return;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Clave incorrecta");
            pxtClaveActual.setText("");
            pxtNuevaClave.setText("");
            pxtConfirmacion.setText("");
            pxtClaveActual.requestFocusInWindow();
            return;
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pxtClaveActual;
    private javax.swing.JPasswordField pxtConfirmacion;
    private javax.swing.JPasswordField pxtNuevaClave;
    // End of variables declaration//GEN-END:variables
}
