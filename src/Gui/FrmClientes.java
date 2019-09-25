package Gui;
import Logica.Clientes;
import Logica.Datos2;
import Logica.Utilidades;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public final class FrmClientes extends javax.swing.JInternalFrame {
    private Datos2 objDatos2;
    
    private DefaultTableModel Tabla;
    private boolean edit = false;
    private int posicionCliente;
    private boolean mas =false;
    public FrmClientes(Datos2 objDatos2) {
        initComponents();
        this.objDatos2 = objDatos2;
        try {
            llenarTabla();
            mostrarRegistro();
        } catch (Exception e) {}
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        bloqueaObjetosFormulario();        
        try {
            llenarTabla();
        } catch (Exception e) {}
        if(objDatos2.getNumeroClientes()==0){
            editNuevoDesabilita();
        }
        if(objDatos2.getNumeroClientes()<2){
            activaBotonesDireccionamiento();
        }
    }
    
    private void activaBotonesDireccionamiento(){
        btnPrimero.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnAtras.setEnabled(false);
        btnSiguiente.setEnabled(false);
    }
    
    private void llenarTabla(){
        try {
            String titulo[] = {"Id clientes", "Nombre(s)", "Apellidos", "Direccion", "Telefono", "Fecha de nacimiento", "Identificacion", "Ciudad", "Fecha de ingreso"};
            String registro[] = new String[9];
            Tabla = new DefaultTableModel(null, titulo);
            ResultSet rs = objDatos2.getClientes();
            while(rs.next()){
                registro[0] = rs.getString("idClientes");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                registro[3] = rs.getString("direccion");
                registro[4] = rs.getString("telefono");
                registro[5] = rs.getString("fecha_nacimiento");
                registro[6] = identificacion(rs.getInt("identificacion"));
                registro[7] = ciudad(rs.getInt("ciudad"));
                registro[8] = rs.getString("fecha_ingreso");
                Tabla.addRow(registro);
            }
            tblUsuarios.setModel(Tabla);
        } catch (Exception e) {
        }
    }
    
    private String ciudad(int ciudad){
        switch(ciudad){
            case 1:
                return "México";
            case 2:
                return "Oaxaca";
            case 3:
                return "Monterrey nuevo leon";
            case 4:
                return "Tuxtepec";
            case 5:
                return "Morelos";
            case 6:
                return "Puebla";
            case 7:
                return "Querétaro";
            case 8:
                return "Tlaxcala";
            case 9:
                return "Tlaxiaco";
            default:
                return "Veracruz";
        }
    }
    
    private int ciudad(String ciuda){
        if(ciuda.equals("México"))
            return 1;
        else if(ciuda.equals("Oaxaca"))
            return 2;
        else if(ciuda.equals("Monterrey nuevo leon"))
            return 3;
        else if(ciuda.equals("Tuxtepec"))
            return 4;
        else if(ciuda.equals("Morelos"))
            return 5;
        else if(ciuda.equals("Puebla"))
            return 6;
        else if(ciuda.equals("Querétaro"))
            return 7;
        else if(ciuda.equals("Tlaxcala"))
            return 8;
        else
            return 9;
    }
    
    private String identificacion(int identificacion){
        switch(identificacion){
            case 1:
                return "IFE";
            case 2:
                return "Pasaporte";
            case 3:
                return "Licencia de conducir";
            case 4:
                return "Credencial de estudiante";
            default:
                return "Cartilla militar";
        }
    }
    
    private int identificacion(String ident){
        if(ident.equals("IFE"))
            return 1;
        else if(ident.equals("Pasaporte"))
            return 2;
        else if(ident.equals("Licencia de conducir"))
            return 3;
        else if(ident.equals("Credencial de estudiante"))
            return 4;
        else
            return 5;
    }
        
    private void bloqueaObjetosFormulario(){
        txtIdCliente.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txtDireccion.setEditable(false);
        txtTelefono.setEditable(false);
        dteFecha_nacimiento.setEnabled(false);
        cbxIdentificacion.setEnabled(false);
        cbxCiudad.setEnabled(false);
        dteFecha_ingreso.setEnabled(false);
    }
    
    private void desbloqueaObjetosFormulario(){
        txtIdCliente.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txtDireccion.setEditable(true);
        txtTelefono.setEditable(true);
        dteFecha_nacimiento.setEnabled(true);
        cbxIdentificacion.setEnabled(true);
        cbxCiudad.setEnabled(true);
        dteFecha_ingreso.setEnabled(false);
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
        txtIdCliente = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxIdentificacion = new javax.swing.JComboBox();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        dteFecha_nacimiento = new com.toedter.calendar.JDateChooser();
        dteFecha_ingreso = new com.toedter.calendar.JDateChooser();
        cbxCiudad = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Fecha ingreso:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(530, 230, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID cliente:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 30, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre(s):");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 70, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Fecha nacimiento:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 230, 170, 30);

        txtApellidos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(180, 110, 280, 30);

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtIdCliente);
        txtIdCliente.setBounds(180, 30, 280, 30);

        txtNombres.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtNombres);
        txtNombres.setBounds(180, 70, 280, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Ciudad:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(600, 110, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tipo de identificacion:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 30, 200, 30);

        cbxIdentificacion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cbxIdentificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione su identificacion", "IFE", "Pasaporte", "Licencia de conducir", "Credencial de estudiante", "Cartilla militar" }));
        jPanel1.add(cbxIdentificacion);
        cbxIdentificacion.setBounds(670, 30, 320, 30);

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886014_sq_br_last.png"))); // NOI18N
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUltimo);
        btnUltimo.setBounds(270, 270, 80, 40);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886085_sq_br_prev.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(150, 310, 80, 40);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886031_sq_br_next.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(270, 310, 80, 40);

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886000_sq_br_first.png"))); // NOI18N
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimero);
        btnPrimero.setBounds(150, 270, 80, 40);

        btnMas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456887102_list-add-user.png"))); // NOI18N
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMas);
        btnMas.setBounds(580, 270, 90, 40);

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886157_Edit-Male-User.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit);
        btnEdit.setBounds(710, 270, 80, 40);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886710_Cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(580, 310, 90, 40);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886589_Save.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(830, 270, 80, 40);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886190_Search-Male-User.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(830, 310, 80, 40);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886171_Remove-Male-User.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(710, 310, 80, 40);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID usuario", "Nombre(s)", "Apellidos", "Perfil"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 360, 990, 130);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Apellidos:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 110, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Direccion:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 150, 100, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Telefono:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 190, 90, 30);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(180, 150, 280, 30);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(180, 190, 280, 30);

        dteFecha_nacimiento.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(dteFecha_nacimiento);
        dteFecha_nacimiento.setBounds(180, 230, 280, 30);

        dteFecha_ingreso.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(dteFecha_ingreso);
        dteFecha_ingreso.setBounds(670, 230, 320, 30);

        cbxCiudad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cbxCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleecione su ciudad", "México", "Oaxaca", "Moterrey nuevo leon", "Tuxtepec", "Morelos", "Puebla", "Queretaro", "Tlaxcala", "Tlaxiaco", "Veracruz" }));
        jPanel1.add(cbxCiudad);
        cbxCiudad.setBounds(670, 110, 320, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        txtIdCliente.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        Calendar fechaActual = new GregorianCalendar();
        dteFecha_nacimiento.setCalendar(fechaActual);
        cbxIdentificacion.setSelectedIndex(0);
        cbxCiudad.setSelectedIndex(0);
        dteFecha_ingreso.setCalendar(fechaActual);
        txtIdCliente.requestFocusInWindow();
        desbloqueaObjetosFormulario();
        editNuevoDesabilita();
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnMas.setEnabled(false);
        cbxIdentificacion.setSelectedIndex(0);
        mas=true;
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!txtIdCliente.getText().equals("") && !txtNombres.getText().equals("") && !txtApellidos.getText().equals("") && !txtDireccion.getText().equals("") && !txtTelefono.getText().equals("") && dteFecha_nacimiento.getDate()!= null && cbxIdentificacion.getSelectedIndex()!=0 && cbxCiudad.getSelectedIndex() != 0 && dteFecha_ingreso.getDate() != null){
            if(dteFecha_nacimiento.getDate().before(dteFecha_ingreso.getDate())){
                Clientes objClientes = new Clientes();
                objClientes.setIdCliente(txtIdCliente.getText());
                objClientes.setNombres(txtNombres.getText());
                objClientes.setApellidos(txtApellidos.getText());
                objClientes.setDireccion(txtDireccion.getText());
                try {
                    objClientes.setTelefono(Long.parseLong(txtTelefono.getText()));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Verifique el telefono");
                }
                objClientes.setFechaNacimiento(dteFecha_nacimiento.getDate());
                objClientes.setTipoIdentificacion(cbxIdentificacion.getSelectedIndex());
                objClientes.setCiudad(cbxCiudad.getSelectedIndex());
                objClientes.setFechaIngreso(dteFecha_ingreso.getDate());
                String msg = objDatos2.agregarCliente(objClientes, edit);
                JOptionPane.showMessageDialog(rootPane, msg);
                bloqueaObjetosFormulario();
                editNuevoHabilita();
                llenarTabla();
                mostrarRegistro();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Verifique la fecha de nacimiento");
                return;
            }
            btnSave.setEnabled(false);
            btnCancel.setEnabled(false);
            edit = false;
            btnMas.setEnabled(true);
            mas=false;
            if(objDatos2.getNumeroClientes()>1){
                btnPrimero.setEnabled(true);
                btnUltimo.setEnabled(true);
                btnAtras.setEnabled(true);
                btnSiguiente.setEnabled(true);
            }
            if(objDatos2.getNumeroClientes()>0){
                btnEdit.setEnabled(true);
                btnSearch.setEnabled(true);
                btnDelete.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Verifique que los campos, tengan sus datos correspondientes");
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        posicionCliente = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        posicionCliente = objDatos2.getNumeroClientes()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(posicionCliente > 0)
            posicionCliente--;
        else
            posicionCliente = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(posicionCliente < objDatos2.getNumeroClientes() - 1)
            posicionCliente++;
        else
            posicionCliente = objDatos2.getNumeroClientes() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Clientes objClientes = new Clientes();
        try {
            edit=false;
            bloqueaObjetosFormulario();
            mostrarRegistro();
            editNuevoHabilita();
        } catch (Exception e) {
            txtIdCliente.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            dteFecha_nacimiento.setDate(null);
            cbxIdentificacion.setSelectedIndex(0);
            cbxCiudad.setSelectedIndex(0);
            dteFecha_ingreso.setDate(null);
        }
        if(mas==true){
            mas=false;
        }
        if(objDatos2.getNumeroClientes()>0){
            btnEdit.setEnabled(true);
            btnSearch.setEnabled(true);
            btnDelete.setEnabled(true);
        }
        if(objDatos2.getNumeroClientes()>1){
            btnPrimero.setEnabled(true);
            btnUltimo.setEnabled(true);
            btnAtras.setEnabled(true);
            btnSiguiente.setEnabled(true);
        }
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnMas.setEnabled(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        edit = true;
        desbloqueaObjetosFormulario();
        editNuevoDesabilita();
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnMas.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int rta = JOptionPane.showConfirmDialog(rootPane, "Desea eliminar el cliente???");
        if(rta != 0){
            return;
        }
        try {
            String msg = objDatos2.deleteCliente(txtIdCliente.getText());
            llenarTabla();
            mostrarRegistro();
            JOptionPane.showMessageDialog(rootPane, msg);
        } catch (Exception e) {
            txtIdCliente.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            dteFecha_nacimiento.setDate(null);
            cbxIdentificacion.setSelectedIndex(0);
            cbxCiudad.setSelectedIndex(0);
            dteFecha_ingreso.setDate(null);
            JOptionPane.showMessageDialog(rootPane, "Cliente eliminado");
            editNuevoDesabilita();
        }
        if(objDatos2.getNumeroClientes()<2){
            btnPrimero.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnAtras.setEnabled(false);
            btnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String id = "";
        id = JOptionPane.showInputDialog("Ingrese ID del cliente");
        if(id.equals(""))
            JOptionPane.showMessageDialog(rootPane, "ID invalido");
        else{
            if(!objDatos2.existeCliente(id)){
                JOptionPane.showMessageDialog(rootPane, "Cliente no localizado");
            }else{
                int num = tblUsuarios.getRowCount();
                for(int i=0; i<num; i++){
                    if(Utilidades.objectToString(tblUsuarios.getValueAt(i, 0)).equals(id)){
                        posicionCliente = i;
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
    private javax.swing.JComboBox cbxCiudad;
    private javax.swing.JComboBox cbxIdentificacion;
    private com.toedter.calendar.JDateChooser dteFecha_ingreso;
    private com.toedter.calendar.JDateChooser dteFecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void mostrarRegistro(){
        txtIdCliente.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionCliente, 0)));
        txtNombres.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionCliente, 1)));
        txtApellidos.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionCliente, 2)));
        txtDireccion.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionCliente, 3)));
        txtTelefono.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionCliente, 4)));
        dteFecha_nacimiento.setDate(Utilidades.objectToDate(tblUsuarios.getValueAt(posicionCliente, 5)));
        cbxIdentificacion.setSelectedIndex(identificacion(Utilidades.objectToString(tblUsuarios.getValueAt(posicionCliente, 6))));
        cbxCiudad.setSelectedIndex(ciudad(Utilidades.objectToString(tblUsuarios.getValueAt(posicionCliente, 7))));
        dteFecha_ingreso.setDate(Utilidades.objectToDate(tblUsuarios.getValueAt(posicionCliente, 8)));
    }
}
