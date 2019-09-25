package Gui;

import Logica.Datos2;
import Logica.Opciones;
import Logica.Productos;
import Logica.Utilidades;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmFactura extends javax.swing.JInternalFrame {
    
    private final Datos2 objDatos2;
    private DefaultTableModel Tabla;
    public FrmFactura(Datos2 objDatos2) {
        this.objDatos2=objDatos2;
        initComponents();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarCLiente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox();
        cmbCliente = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnGrabarFactura = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotalValor = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nueva factura");
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

        jPanel1.setLayout(null);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEliminar.setText("-");
        btnEliminar.setToolTipText("Elimina producto a la factura");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(300, 140, 60, 50);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAgregar.setText("+");
        btnAgregar.setToolTipText("Agrega producto a la factura");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(240, 140, 60, 50);

        btnBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarProducto.setText("...");
        btnBuscarProducto.setToolTipText("Busca un producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto);
        btnBuscarProducto.setBounds(450, 100, 30, 30);

        btnBuscarCLiente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarCLiente.setText("...");
        btnBuscarCLiente.setToolTipText("Busca un cliente");
        btnBuscarCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCLienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCLiente);
        btnBuscarCLiente.setBounds(450, 60, 30, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 90, 30);

        txtCantidad.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad);
        txtCantidad.setBounds(110, 150, 130, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 90, 30);

        txtFecha.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtFecha.setEnabled(false);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(110, 20, 130, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Producto:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 100, 90, 30);

        cmbProducto.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jPanel1.add(cmbProducto);
        cmbProducto.setBounds(110, 100, 330, 30);

        cmbCliente.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jPanel1.add(cmbCliente);
        cmbCliente.setBounds(110, 60, 330, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 90, 30);

        btnGrabarFactura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnGrabarFactura.setText("G");
        btnGrabarFactura.setToolTipText("Grabar factura");
        btnGrabarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGrabarFactura);
        btnGrabarFactura.setBounds(420, 140, 60, 50);

        btnEliminarTodo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEliminarTodo.setText("X");
        btnEliminarTodo.setToolTipText("Elimina todos los productos de la factura");
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarTodo);
        btnEliminarTodo.setBounds(360, 140, 60, 50);

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblTabla);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 200, 460, 200);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Totales:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 410, 70, 30);

        txtTotalValor.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setEnabled(false);
        jPanel1.add(txtTotalValor);
        txtTotalValor.setBounds(370, 410, 110, 30);

        txtTotal.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setEnabled(false);
        jPanel1.add(txtTotal);
        txtTotal.setBounds(250, 410, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //cargamos clientes
        Opciones objOpciones=new Opciones("NA", "Seleccione un cliente...");
        cmbCliente.addItem(objOpciones);
        
        //cargamos clientes
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
             
        //cargamos clientes
        objOpciones=new Opciones("NA", "Seleccione un producto...");
        cmbProducto.addItem(objOpciones);
        rs = objDatos2.getProductos();
        try {
            while(rs.next()){
                objOpciones = new Opciones(
                    rs.getString("idProducto"), 
                    rs.getString("descripcion"));
                cmbProducto.addItem(objOpciones);
            }
        } catch (Exception e) {
        }
        
        //fecha en sistema
        txtFecha.setText(Utilidades.stringToDate(new Date()));
        
        //Totales en cero
        txtTotal.setText("0");
        txtTotalValor.setText("0");
        
        //llenar tabla
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         if(cmbProducto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");
            cmbProducto.requestFocusInWindow();
            return;
        }
        
        if(txtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una cantidad");
            txtCantidad.setText("");
            txtCantidad.requestFocusInWindow();
            return;
        }
        
        if(!Utilidades.isNumeric(txtCantidad.getText())){
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una valor numerico");
            txtCantidad.setText("");
            txtCantidad.requestFocusInWindow();
            return;
        }
        
        int cantidad=Integer.parseInt(txtCantidad.getText());
        if(cantidad<=0){
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una cantidad superior a cero");
            txtCantidad.setText("");
            txtCantidad.requestFocusInWindow();
            return;
        }
        
        //buscamos los datos del producto seleccionado
        Productos miProducto = objDatos2.getProducto(((Opciones)cmbProducto.getSelectedItem()).getValor());
        
        //Agregamos producto a la tabla
        String registro[] = new String[5];
        registro[0] = miProducto.getId_Productos();
        registro[1] = miProducto.getDescripcion();
        registro[2] = "" + miProducto.getPrecio();
        registro[3] = "" + cantidad;
        registro[4] = "" + (cantidad*miProducto.getPrecio());
        Tabla.addRow(registro);
        
        //Inicializamos campos
        cmbProducto.setSelectedIndex(0);
        txtCantidad.setText("");
        cmbProducto.requestFocusInWindow();
        
        //Actualizar totales
        totales();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Desea borrar todos los detalles de la factura???");
        
        if(rta != 0)
            return;
        limpiarTabla(tblTabla);
        totales();
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnGrabarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarFacturaActionPerformed
        if(cmbCliente.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un cliente");
            cmbCliente.requestFocusInWindow();
            return;
        }
        
        double totalCantidad = Double.parseDouble(txtTotalValor.getText());
        if(totalCantidad==0){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar detalle de la factura");
            cmbProducto.requestFocusInWindow();
            return;
        }
        
        int rta = JOptionPane.showConfirmDialog(rootPane, "Desea guardar la factura???");
        if(rta != 0){
            return;
        }
        //agregamos factura
        int numFac = objDatos2.getNumFac();
        
            
        //encabezado de factura
        objDatos2.agregarFactura(numFac,
                ((Opciones)cmbCliente.getSelectedItem()).getValor(),
                new Date());
            
        //detalle de factura
        int num = tblTabla.getRowCount();
        for(int i=0; i<num; i++){
            objDatos2.agregarDetalleFactura(numFac,
                    i, 
                    Utilidades.objectToString(tblTabla.getValueAt(i, 0)), 
                    Utilidades.objectToString(tblTabla.getValueAt(i, 1)), 
                    Utilidades.objectToDouble(tblTabla.getValueAt(i, 2)), 
                    Utilidades.objectToInt(tblTabla.getValueAt(i, 3)));
            }
        JOptionPane.showMessageDialog(rootPane, "Factura: " + numFac + " generado con éxito");
        //inicializamos campos
        cmbCliente.setSelectedIndex(0);
        limpiarTabla(tblTabla);
        totales();
        cmbCliente.requestFocusInWindow();
    }//GEN-LAST:event_btnGrabarFacturaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(cmbProducto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un producto");
            cmbProducto.requestFocusInWindow();
            return;
        }
        
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
            int filas = tblTabla.getRowCount();
            
            String idCombo = ((Opciones)cmbProducto.getSelectedItem()).getValor();
            for(int i=0; i<filas; i++){
                String idTabla = Utilidades.objectToString(tblTabla.getValueAt(i, 0));
                if(idTabla.equals(idCombo)){
                    modelo.removeRow(i);
                    totales();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCLienteActionPerformed
        FrmBusquedaCliente objFrmBusquedaCliente = new FrmBusquedaCliente(null, closable, objDatos2);
        objFrmBusquedaCliente.setLocationRelativeTo(null);
        objFrmBusquedaCliente.setVisible(true);
        String respuesta = objFrmBusquedaCliente.getRespuesta();
        
        if(respuesta.equals("")){
            return;
        }
        for(int i=0; i<cmbCliente.getItemCount(); i++){
            if(((Opciones)cmbCliente.getItemAt(i)).getValor().equals(respuesta)){
                cmbCliente.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnBuscarCLienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        FrmBusquedaProducto FrmBusquedaProducto = new FrmBusquedaProducto(null, closable, objDatos2);
        FrmBusquedaProducto.setLocationRelativeTo(null);
        FrmBusquedaProducto.setVisible(true);
        String respuesta = FrmBusquedaProducto.getRespuesta();
        
        if(respuesta.equals("")){
            return;
        }
        
        for(int i=0; i<cmbProducto.getItemCount(); i++){
            if(((Opciones)cmbProducto.getItemAt(i)).getValor().equals(respuesta)){
                cmbProducto.setSelectedIndex(i);
                return;
            }
        } 
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCLiente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnGrabarFactura;
    private javax.swing.JComboBox cmbCliente;
    private javax.swing.JComboBox cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla(){
        String titulo[] = {"Id producto", "Descripcion", "Precio", "Cantidad", "Valor"};
        Tabla = new DefaultTableModel(null, titulo);
        tblTabla.setModel(Tabla);
        
        //Alinear campos numericos a la derecha
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        centro.setHorizontalAlignment(SwingConstants.RIGHT);
        tblTabla.getColumnModel().getColumn(2).setCellRenderer(centro);
        tblTabla.getColumnModel().getColumn(3).setCellRenderer(centro);
        tblTabla.getColumnModel().getColumn(4).setCellRenderer(centro);
    }
    
    private void totales(){
        int num = tblTabla.getRowCount();
        int sumCan = 0;
        double sumVal = 0;
        for(int i=0; i<num; i++){
            sumCan += Utilidades.objectToInt(tblTabla.getValueAt(i, 3));
            sumVal += Utilidades.objectToDouble(tblTabla.getValueAt(i, 4));
        }
        txtTotal.setText("" + sumCan);
        txtTotalValor.setText("" + sumVal);
    }
    
    private void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            
            for(int i=0; i<filas; i++){
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
