package Gui;

import Logica.Datos2;
import Logica.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class FrmBusquedaCliente extends javax.swing.JDialog {
    
    private Datos2 objDatos2;
    private DefaultTableModel Tabla;
    private String respuesta = "";
    
    public FrmBusquedaCliente(java.awt.Frame parent, boolean modal, Datos2 objDatos2) {
        super(parent, modal);
        initComponents();
        this.objDatos2 = objDatos2;
        
        //Agrupamos los botones para que sean excluyentes
        bgrTipoBusqueda.add(rbtID);
        bgrTipoBusqueda.add(rbtNombres);
        bgrTipoBusqueda.add(rbtApellidos);
    }
    
    public String getRespuesta(){
        return respuesta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrTipoBusqueda = new javax.swing.ButtonGroup();
        rbtID = new javax.swing.JRadioButton();
        rbtApellidos = new javax.swing.JRadioButton();
        rbtNombres = new javax.swing.JRadioButton();
        txtCriterioBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rbtID.setSelected(true);
        rbtID.setText("ID");
        rbtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNombresActionPerformed(evt);
            }
        });

        rbtApellidos.setText("Apellidos");
        rbtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNombresActionPerformed(evt);
            }
        });

        rbtNombres.setText("Nombre(s)");
        rbtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNombresActionPerformed(evt);
            }
        });

        txtCriterioBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCriterioBusquedaKeyTyped(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rbtID)
                        .addGap(27, 27, 27)
                        .addComponent(rbtNombres)
                        .addGap(31, 31, 31)
                        .addComponent(rbtApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCriterioBusqueda)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtID)
                    .addComponent(rbtNombres)
                    .addComponent(rbtApellidos))
                .addGap(18, 18, 18)
                .addComponent(txtCriterioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarTabla();
        txtCriterioBusqueda.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void rbtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNombresActionPerformed
        txtCriterioBusqueda.setText("");
        txtCriterioBusqueda.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtNombresActionPerformed

    private void txtCriterioBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioBusquedaKeyTyped
        llenarTabla();
    }//GEN-LAST:event_txtCriterioBusquedaKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        respuesta="";
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int numFilas = tblTabla.getRowCount();
        if(numFilas == 0){
            respuesta="";
            dispose();
            return;
        }
        for(int i=0; i<numFilas; i++){
            if(tblTabla.isRowSelected(i)){
                respuesta = Utilidades.objectToString(tblTabla.getValueAt(i, 0));
                dispose();
                return;
            }
        }
        respuesta = Utilidades.objectToString(tblTabla.getValueAt(0, 0));
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*FrmBusquedaCliente dialog = new FrmBusquedaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                        */
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrTipoBusqueda;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtApellidos;
    private javax.swing.JRadioButton rbtID;
    private javax.swing.JRadioButton rbtNombres;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCriterioBusqueda;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla(){
        String titulo[] = {"Id cliente", "Nombre(s)", "Apellidos"};
        String registro[] = new String[3];
        Tabla = new DefaultTableModel(null, titulo);
        String sql = "";
        if(txtCriterioBusqueda.getText().equals("")){
            sql = "select idClientes, nombres, apellidos from clientes";
        }else{
            if(rbtNombres.isSelected()){
                sql = "select idClientes, nombres, apellidos from clientes where nombres like '" + txtCriterioBusqueda.getText() +"%'";
            }
            if(rbtID.isSelected()){
                sql = "select idClientes, nombres, apellidos from clientes where idClientes like '" + txtCriterioBusqueda.getText() +"%'";
            }
            if(rbtApellidos.isSelected()){
                sql = "select idClientes, nombres, apellidos from clientes where apellidos like '" + txtCriterioBusqueda.getText() +"%'";
            }
        }
        try {
            ResultSet rs = objDatos2.getConsulta(sql);
            while(rs.next()){
                registro[0] = rs.getString("idClientes");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                Tabla.addRow(registro);
            }
            tblTabla.setModel(Tabla);
            return;
        }catch(SQLException e){
        }
    }
}
