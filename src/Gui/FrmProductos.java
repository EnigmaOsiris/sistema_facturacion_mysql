package Gui;
import Logica.Datos2;
import Logica.Productos;
import Logica.Utilidades;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public final class FrmProductos extends javax.swing.JInternalFrame {
    private Datos2 objDatos2;
    
    private DefaultTableModel Tabla;
    private boolean edit = false;
    private boolean mas=false;
    private int posicionProducto = 0;
    public FrmProductos(Datos2 objDatos2) {
        initComponents();
        this.objDatos2 = objDatos2;
        
        try {
            llenarTabla();
            mostrarRegistro();
            btnSave.setEnabled(false);
            btnCancel.setEnabled(false);
        } catch (Exception e) {
        }
        bloqueaObjetosFormulario();
        if(objDatos2.getNumeroProductos()<2){
            btnPrimero.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnAtras.setEnabled(false);
            btnSiguiente.setEnabled(false);
        }
        if(objDatos2.getNumeroProductos()==0){
            btnDelete.setEnabled(false);
            btnSearch.setEnabled(false);
            btnEdit.setEnabled(false);
        }
    }
    
    private void llenarTabla(){
        try {
            String titulo[] = {"Id producto", "Descripcion", "Precio", "IVA" , "Notas"};
            String registro[] = new String[5];
            Tabla = new DefaultTableModel(null, titulo);
            ResultSet rs = objDatos2.getProductos();
            while(rs.next()){
                registro[0] = rs.getString("idProducto");
                registro[1] = rs.getString("descripcion");
                registro[2] = rs.getString("precio");
                registro[3] = iva(rs.getInt("idIva"));
                registro[4] = rs.getString("notas");
                Tabla.addRow(registro);
            }
            tblUsuarios.setModel(Tabla);
            //Alinear campos numericos a la derecha
            DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
            centro.setHorizontalAlignment(SwingConstants.RIGHT);
            tblUsuarios.getColumnModel().getColumn(2).setCellRenderer(centro);
        } catch (Exception e) {
        }
    }
    
    private String iva(int iv){
        switch(iv){
            case 1:
                return "0%";
            case 2:
                return "10%";
            default:
                return "16%";
        }
    }
    
    private int iva(String iv){
        if(iv.equals("0%")){
            return 1;
        }else if(iv.equals("10%")){
            return 2;
        }else{
            return 3;
        }
    }
    
    private void bloqueaObjetosFormulario(){
        txtIdUsuario.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txaNota.setEditable(false);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        cbxIVA.setEnabled(false);
    }
    
    private void desbloqueaObjetosFormulario(){
        txtIdUsuario.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txaNota.setEditable(true);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        cbxIVA.setEnabled(true);
    }

    private void editNuevoDesabilita(){
        btnSearch.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    private void editNuevoHabilita(){
        btnSearch.setEnabled(true);
        btnDelete.setEnabled(true);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUltimo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaNota = new javax.swing.JTextArea();
        cbxIVA = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Productos");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("IVA:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 30, 40, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID producto:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 110, 70, 30);

        txtApellidos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(130, 110, 260, 30);

        txtIdUsuario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtIdUsuario);
        txtIdUsuario.setBounds(130, 30, 260, 30);

        txtNombres.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtNombres);
        txtNombres.setBounds(130, 70, 260, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Notas:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 70, 60, 30);

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886014_sq_br_last.png"))); // NOI18N
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUltimo);
        btnUltimo.setBounds(190, 150, 80, 40);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886085_sq_br_prev.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(90, 190, 80, 40);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886031_sq_br_next.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(190, 190, 80, 40);

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886000_sq_br_first.png"))); // NOI18N
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimero);
        btnPrimero.setBounds(90, 150, 80, 40);

        btnMas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456887102_list-add-user.png"))); // NOI18N
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMas);
        btnMas.setBounds(400, 150, 80, 40);

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886157_Edit-Male-User.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit);
        btnEdit.setBounds(500, 150, 80, 40);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886710_Cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(400, 190, 80, 40);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886589_Save.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(600, 150, 80, 40);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886190_Search-Male-User.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(600, 190, 80, 40);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886171_Remove-Male-User.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(500, 190, 80, 40);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "Descrpcion", "Precio", "IVA", "Notas(s)"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(12, 240, 730, 130);

        txaNota.setColumns(20);
        txaNota.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txaNota.setRows(5);
        jScrollPane2.setViewportView(txaNota);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(480, 70, 260, 70);

        cbxIVA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cbxIVA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione iva", "0%", "10%", "16%" }));
        jPanel1.add(cbxIVA);
        cbxIVA.setBounds(480, 30, 260, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        txtIdUsuario.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txaNota.setText("");
        txtIdUsuario.requestFocusInWindow();
        desbloqueaObjetosFormulario();
        editNuevoDesabilita();
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        cbxIVA.setSelectedIndex(0);
        btnMas.setEnabled(false);
        mas=true;
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!txtIdUsuario.getText().equals("") && !txtNombres.getText().equals("") && Utilidades.isNumeric(txtApellidos.getText()) && !txaNota.getText().equals("") && cbxIVA.getSelectedIndex()!=0){
            Productos objProductos = new Productos();
            objProductos.setId_Productos(txtIdUsuario.getText());
            objProductos.setDescripcion(txtNombres.getText());
            if(Utilidades.isNumeric(txtApellidos.getText()))
                objProductos.setPrecio(Double.parseDouble(txtApellidos.getText()));
            else{
                JOptionPane.showMessageDialog(rootPane, "Verique el precio");
                return;
            }
            objProductos.setIva(cbxIVA.getSelectedIndex());
            objProductos.setNotas(txaNota.getText());
            String msg = objDatos2.agregarProducto(objProductos, edit);
            llenarTabla();
            mostrarRegistro();
            editNuevoHabilita();
            edit = false;
            btnMas.setEnabled(true);
            bloqueaObjetosFormulario();
            mas=false;
            if(objDatos2.getNumeroProductos()>0){
                btnEdit.setEnabled(true);   
                btnDelete.setEnabled(true);
                btnSearch.setEnabled(true);
            }
            if(objDatos2.getNumeroProductos()>=2){
                btnPrimero.setEnabled(true);
                btnUltimo.setEnabled(true);
                btnAtras.setEnabled(true);
                btnSiguiente.setEnabled(true);
            }
            JOptionPane.showMessageDialog(rootPane, msg);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Verique los campos vacios");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        posicionProducto = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        posicionProducto = objDatos2.getNumeroProductos()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(posicionProducto>0){
            posicionProducto -= 1;
        }else{
            posicionProducto = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(posicionProducto<objDatos2.getNumeroProductos()-1)
            posicionProducto += 1;
        else
            posicionProducto = objDatos2.getNumeroProductos()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try{
            bloqueaObjetosFormulario();
            editNuevoHabilita();
            edit=false;
            llenarTabla();
            mostrarRegistro();
        }catch(Exception e){
            txtIdUsuario.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            cbxIVA.setSelectedIndex(0);
            txaNota.setText("");
        }
        btnMas.setEnabled(true);
        if(mas==true){
            mas=false;
        }
        if(objDatos2.getNumeroProductos()>0){
            btnEdit.setEnabled(true);   
            btnDelete.setEnabled(true);
            btnSearch.setEnabled(true);
        }   
        if(objDatos2.getNumeroProductos()>1){
            btnPrimero.setEnabled(true);
            btnUltimo.setEnabled(true);
            btnAtras.setEnabled(true);
            btnSiguiente.setEnabled(true);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        edit = true;
        desbloqueaObjetosFormulario();
        editNuevoDesabilita();
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Desea eliminar el producto???");
        if(rta != 0){
            return;
        }
        try {
            String msg = objDatos2.deleteProducto(txtIdUsuario.getText());
            posicionProducto = objDatos2.getNumeroProductos() - 1;
            llenarTabla();
            mostrarRegistro();
            JOptionPane.showMessageDialog(rootPane, msg);
        } catch (Exception e) {
            txtIdUsuario.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            cbxIVA.setSelectedIndex(0);
            txaNota.setText("");
            JOptionPane.showMessageDialog(rootPane, "producto eliminado");
            btnDelete.setEnabled(false);
            btnSearch.setEnabled(false);
            btnEdit.setEnabled(false);
        }
        if(objDatos2.getNumeroProductos()<2){
            btnPrimero.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnAtras.setEnabled(false);
            btnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String id = "";
        id = JOptionPane.showInputDialog("Ingrese ID del producto");
        if(id.equals(""))
            JOptionPane.showMessageDialog(rootPane, "ID invalido");
        else{
            if(!objDatos2.existeProducto(id)){
                JOptionPane.showMessageDialog(rootPane, "producto no localizado");
            }else{
                int num = tblUsuarios.getRowCount();
                for(int i=0; i<num; i++){
                    if(Utilidades.objectToString(tblUsuarios.getValueAt(i, 0)).equals(id)){
                        posicionProducto = i;
                        break;
                    }
                }
                mostrarRegistro();
            }
        }         
    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cbxIVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextArea txaNota;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

    public void mostrarRegistro(){
        txtIdUsuario.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionProducto, 0)));
        txtNombres.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionProducto, 1)));
        txtApellidos.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionProducto, 2)));
        cbxIVA.setSelectedIndex(iva(Utilidades.objectToString(tblUsuarios.getValueAt(posicionProducto, 3))));
        txaNota.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionProducto, 4)));
    }
}
