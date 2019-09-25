package Gui;

import Logica.Datos2;
import Logica.Utilidades;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class FrmBusquedaProducto extends javax.swing.JDialog {
    
    private Datos2 objDatos2;
    private DefaultTableModel Tabla;
    private String respuesta = "";
    
    public FrmBusquedaProducto(java.awt.Frame parent, boolean modal, Datos2 objDatos2) {
        super(parent, modal);
        initComponents();
        this.objDatos2 = objDatos2;
        
        //Agrupamos los botones para que sean excluyentes
        bgrTipoBusqueda.add(rbtID);
        bgrTipoBusqueda.add(rbtDescripcion);
    }
    
    public String getRespuesta(){
        return respuesta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrTipoBusqueda = new javax.swing.ButtonGroup();
        rbtID = new javax.swing.JRadioButton();
        rbtDescripcion = new javax.swing.JRadioButton();
        txtCriterioBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda producto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rbtID.setSelected(true);
        rbtID.setText("ID");
        rbtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDescripcionActionPerformed(evt);
            }
        });

        rbtDescripcion.setText("Descripcion");
        rbtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDescripcionActionPerformed(evt);
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
                        .addComponent(rbtDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE))
                    .addComponent(txtCriterioBusqueda)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                    .addComponent(rbtDescripcion))
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

    private void rbtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDescripcionActionPerformed
        txtCriterioBusqueda.setText("");
        txtCriterioBusqueda.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtDescripcionActionPerformed

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
    private javax.swing.JRadioButton rbtDescripcion;
    private javax.swing.JRadioButton rbtID;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCriterioBusqueda;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla(){
        String titulo[] = {"Id producto", "Descripcion"};
        String registro[] = new String[2];
        Tabla = new DefaultTableModel(null, titulo);
        String sql = "";
        if(txtCriterioBusqueda.getText().equals("")){
            sql = "select idProducto, descripcion from productos";
        }else{
            if(rbtID.isSelected()){
                sql = "select idProducto, descripcion from productos where idProducto like '" + txtCriterioBusqueda.getText() +"%'";
            }
            if(rbtDescripcion.isSelected()){
                sql = "select idProducto, descripcion from productos where descripcion like '" + txtCriterioBusqueda.getText() +"%'";
            }
        }
        try {
            ResultSet rs = objDatos2.getConsulta(sql);
            while(rs.next()){
                registro[0] = rs.getString("idProducto");
                registro[1] = rs.getString("descripcion");
                Tabla.addRow(registro);
            }
            tblTabla.setModel(Tabla);
            return;
        } catch (Exception e) {
        }
    }
}
