package Gui;

import Logica.Datos2;
import Logica.Opciones;
import Logica.Reportes;
import Logica.Utilidades;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FrmReporteFactura extends javax.swing.JInternalFrame {
    private Datos2 objDatos2;
    public FrmReporteFactura(Datos2 objDatos2) {
        initComponents();
        this.objDatos2 = objDatos2;
        
        //Agrupamos los botones para que sean excluyentes
        bgrTipo.add(rbtTodo);
        bgrTipo.add(rbtSeleccion);
        
        bgrFiltro.add(rbtFecha);
        bgrFiltro.add(rbtNumeroFactura);
        bgrFiltro.add(rbtCliente);
        
        rbtTodo.setSelected(true);
        rbtFecha.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrFiltro = new javax.swing.ButtonGroup();
        bgrTipo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        rbtSeleccion = new javax.swing.JRadioButton();
        rbtNumeroFactura = new javax.swing.JRadioButton();
        rbtTodo = new javax.swing.JRadioButton();
        rbtFecha = new javax.swing.JRadioButton();
        rbtCliente = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dchFechaInicial = new com.toedter.calendar.JDateChooser();
        dchFechaFinal = new com.toedter.calendar.JDateChooser();
        cmbFacturaInicial = new javax.swing.JComboBox();
        cmbFacturaFinal = new javax.swing.JComboBox();
        cmbCliente = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reportes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel1.setText("Archivo:");

        txtArchivo.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        txtArchivo.setText("Reporte");

        btnSeleccionar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnSeleccionar.setText("...");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        rbtSeleccion.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        rbtSeleccion.setText("Seleccion");
        rbtSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSeleccionActionPerformed(evt);
            }
        });

        rbtNumeroFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtNumeroFactura.setText("Numero de factura");
        rbtNumeroFactura.setEnabled(false);
        rbtNumeroFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNumeroFacturaActionPerformed(evt);
            }
        });

        rbtTodo.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        rbtTodo.setText("Todas");
        rbtTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTodoActionPerformed(evt);
            }
        });

        rbtFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtFecha.setText("Fecha");
        rbtFecha.setEnabled(false);
        rbtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFechaActionPerformed(evt);
            }
        });

        rbtCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtCliente.setText("Cliente");
        rbtCliente.setEnabled(false);
        rbtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha inicial:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Factura inicial:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha final:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Factura final:");

        dchFechaInicial.setEnabled(false);
        dchFechaInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dchFechaFinal.setEnabled(false);
        dchFechaFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cmbFacturaInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbFacturaInicial.setEnabled(false);

        cmbFacturaFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbFacturaFinal.setEnabled(false);

        cmbCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCliente.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cliente:");

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1460267741_Check.png"))); // NOI18N
        btnGenerar.setToolTipText("Generar reporte");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeleccionar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmbFacturaFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbFacturaInicial, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dchFechaInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dchFechaFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtNumeroFactura)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtCliente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(rbtTodo)
                                        .addGap(26, 26, 26)
                                        .addComponent(rbtSeleccion))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtSeleccion)
                    .addComponent(rbtTodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFecha)
                    .addComponent(rbtNumeroFactura)
                    .addComponent(rbtCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(dchFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dchFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFacturaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFacturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTodoActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtTodoActionPerformed

    //habilita campos
    private void habilitarCampos(){
        if(rbtTodo.isSelected()){
            rbtFecha.setEnabled(false);
            rbtNumeroFactura.setEnabled(false);
            rbtCliente.setEnabled(false);
            
            dchFechaFinal.setEnabled(false);
            dchFechaInicial.setEnabled(false);
            
            cmbCliente.setEnabled(false);
            
            cmbFacturaInicial.setEnabled(false);
            cmbFacturaFinal.setEnabled(false);
        }else{
            rbtFecha.setEnabled(true);
            rbtNumeroFactura.setEnabled(true);
            rbtCliente.setEnabled(true); 

            if(rbtFecha.isSelected()){
                dchFechaFinal.setEnabled(true);
                dchFechaInicial.setEnabled(true);

                cmbCliente.setEnabled(false);

                cmbFacturaInicial.setEnabled(false);
                cmbFacturaFinal.setEnabled(false);
            }
            if(rbtNumeroFactura.isSelected()){
                dchFechaFinal.setEnabled(false);
                dchFechaInicial.setEnabled(false);

                cmbCliente.setEnabled(false);

                cmbFacturaInicial.setEnabled(true);
                cmbFacturaFinal.setEnabled(true);
            }
            if(rbtCliente.isSelected()){
                dchFechaFinal.setEnabled(false);
                dchFechaInicial.setEnabled(false);

                cmbCliente.setEnabled(true);

                cmbFacturaInicial.setEnabled(false);
                cmbFacturaFinal.setEnabled(false);
            }
        }        
    }
    
    private void rbtSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSeleccionActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtSeleccionActionPerformed

    private void rbtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFechaActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtFechaActionPerformed

    private void rbtNumeroFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNumeroFacturaActionPerformed
       habilitarCampos();
    }//GEN-LAST:event_rbtNumeroFacturaActionPerformed

    private void rbtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtClienteActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtClienteActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if(txtArchivo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un nombre de archivo");
            return;
        }
        String archivo = txtArchivo.getText() + ".pdf";
        String sql = "SELECT facturas.idFactura, facturas.idCliente, CONCAT(nombres, ' ' ,apellidos) AS nombreFULL, fecha, \n" +
            "idLinea, idProducto, descripcion, precio, cantidadProductos, precio * cantidadProductos AS valor\n" +
            "from facturas INNER JOIN clientes ON facturas.idCliente = clientes.idClientes \n" +
            "INNER JOIN detallefactura ON facturas.idFactura = detallefactura.idFactura";
        
        String filtro = "";
        if(rbtTodo.isSelected()){
            filtro = "";
        }else{
            if(rbtCliente.isSelected()){
                if(cmbCliente.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(rbtCliente, "Seleccione un cliente");
                    cmbCliente.requestFocusInWindow();
                    return;
                }
                filtro = " where facturas.idCliente = '" + ((Opciones)cmbCliente.getSelectedItem()).getValor() +"'";
            }
            if(rbtNumeroFactura.isSelected()){
                if(cmbFacturaInicial.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(rbtCliente, "Seleccione la factura inicial");
                    cmbCliente.requestFocusInWindow();
                    return;
                }
                if(cmbFacturaFinal.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(rbtCliente, "Seleccione la factura final");
                    cmbCliente.requestFocusInWindow();
                    return;
                }
                filtro = " where facturas.idFactura >= " 
                        + ((Opciones)cmbFacturaInicial.getSelectedItem()).getValor() 
                        + " and facturas.idFactura <= "
                        + ((Opciones)cmbFacturaFinal.getSelectedItem()).getValor();
            }
            if(rbtFecha.isSelected()){
                if(dchFechaInicial.getDate() == null){
                    JOptionPane.showMessageDialog(rbtCliente, "Seleccione la fecha inicial");
                    dchFechaInicial.requestFocusInWindow();
                    return;
                }
                if(dchFechaFinal.getDate() == null){
                    JOptionPane.showMessageDialog(rbtCliente, "Seleccione la fecha final");
                    dchFechaFinal.requestFocusInWindow();
                    return;
                }
                filtro = " where fecha >= '"
                        + Utilidades.formatDate(dchFechaInicial.getDate())
                        + "' and fecha <= '"
                        + Utilidades.formatDate(dchFechaFinal.getDate()) 
                        + "'";
            }
        }
        
        //adicionamos el filtro a la consulta
        sql = sql + filtro;
        
        try {
            Reportes.reporteFacturas(archivo, objDatos2.getConsulta(sql));
            JOptionPane.showMessageDialog(rbtCliente, "reporte generado");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        //cargamos clientes
        Opciones objOpciones=new Opciones("NA", "Seleccione un cliente...");
        cmbCliente.addItem(objOpciones);
        ResultSet rs = objDatos2.getClientes();
        try {
            while(rs.next()){
                objOpciones = new Opciones(
                    rs.getString("idClientes"), 
                    rs.getString("nombres") + " "+ 
                    rs.getString("apellidos"));
                cmbCliente.addItem(objOpciones);
            }
        } catch (Exception e) {
        }
        
        //cargamos las facturas
        objOpciones=new Opciones("NA", "Seleccione una factura...");
        cmbFacturaInicial.addItem(objOpciones);
        cmbFacturaFinal.addItem(objOpciones);
        ResultSet rsFac = objDatos2.getFacturas();
        try {
            while(rsFac.next()){
                objOpciones = new Opciones(
                    rsFac.getString("idFactura"), 
                    rsFac.getString("idFactura"));
                cmbFacturaInicial.addItem(objOpciones);
                cmbFacturaFinal.addItem(objOpciones);
            }
        } catch (Exception e) {
        }        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        FrmSelectorArchivo objArchivo = new FrmSelectorArchivo(null, closable);
        objArchivo.setLocationRelativeTo(null);
        objArchivo.setVisible(true);
        String archivo = objArchivo.getArchivo();
        if(!archivo.equals("")){
            txtArchivo.setText(archivo);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrFiltro;
    private javax.swing.ButtonGroup bgrTipo;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox cmbCliente;
    private javax.swing.JComboBox cmbFacturaFinal;
    private javax.swing.JComboBox cmbFacturaInicial;
    private com.toedter.calendar.JDateChooser dchFechaFinal;
    private com.toedter.calendar.JDateChooser dchFechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbtCliente;
    private javax.swing.JRadioButton rbtFecha;
    private javax.swing.JRadioButton rbtNumeroFactura;
    private javax.swing.JRadioButton rbtSeleccion;
    private javax.swing.JRadioButton rbtTodo;
    private javax.swing.JTextField txtArchivo;
    // End of variables declaration//GEN-END:variables

}
