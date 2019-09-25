package Gui;
import Logica.Datos2;
import Logica.Usuarios;
import Logica.Utilidades;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FrmUsuarios extends javax.swing.JInternalFrame {
    
    private final Datos2 objDatos2;
    private DefaultTableModel Tabla;
    private boolean edit = false;
    int posicionUsuario = 0;
    private boolean mas =false;
    
    public FrmUsuarios(Datos2 objDatos2) {
        initComponents();
        
        this.objDatos2 = objDatos2;
        llenarTabla();
        mostrarRegistro();
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        bloqueaObjetosFormulario();
        if(objDatos2.getNumeroUsuarios()==0){
            editNuevoDesabilita();
        }
        if(objDatos2.getNumeroUsuarios()<2){
            btnPrimero.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnAtras.setEnabled(false);
            btnSiguiente.setEnabled(false);
        }
    }
    
    private void llenarTabla(){
        try {
            String titulo[] = {"Id usuario", "Nombre(s)", "Apellidos", "Perfil"};
            String registro[] = new String[4];
            Tabla = new DefaultTableModel(null, titulo);
            ResultSet rs = objDatos2.getUsuarios();
            while(rs.next()){
                registro[0] = rs.getString("idUsuarioss");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                registro[3] = perfil(rs.getInt("idPerfil"));
                Tabla.addRow(registro);
            }
            tblUsuarios.setModel(Tabla);
        } catch (Exception e) {
        }
    }
    
    private String perfil(int perfil){
        switch(perfil){
            case 1:
                return "Administrador";
            default:
                return "Empleado";
        }
    }
    private int perfil(String perfil){
        if(perfil.equals("Administrador"))
            return 1;
        else
            return 2;
    }
        
    private void bloqueaObjetosFormulario(){
        txtIdUsuario.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        pxtClave.setEditable(false);
        pxtConfirmacion.setEditable(false);
        cbxPerfil.setEnabled(false);
    }
    
    private void desbloqueaObjetosFormulario(){
        txtIdUsuario.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        pxtClave.setEditable(true);
        pxtConfirmacion.setEditable(true);
        cbxPerfil.setEnabled(true);
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
        pxtClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxPerfil = new javax.swing.JComboBox();
        pxtConfirmacion = new javax.swing.JPasswordField();
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Clave:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 30, 60, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID usuario:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 103, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre(s):");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 90, 30);

        txtApellidos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(110, 110, 210, 30);

        txtIdUsuario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtIdUsuario);
        txtIdUsuario.setBounds(110, 30, 210, 30);

        txtNombres.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(txtNombres);
        txtNombres.setBounds(110, 70, 210, 30);

        pxtClave.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(pxtClave);
        pxtClave.setBounds(470, 30, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Confirmación:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(340, 110, 128, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Perfil:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 70, 60, 30);

        cbxPerfil.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un perfil", "Administrador", "Empleado" }));
        jPanel1.add(cbxPerfil);
        cbxPerfil.setBounds(470, 70, 210, 30);

        pxtConfirmacion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        pxtConfirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(pxtConfirmacion);
        pxtConfirmacion.setBounds(470, 110, 210, 30);

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
        btnMas.setBounds(330, 150, 80, 40);

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886157_Edit-Male-User.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit);
        btnEdit.setBounds(430, 150, 80, 40);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886710_Cancel.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(330, 190, 80, 40);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886589_Save.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(530, 150, 80, 40);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886190_Search-Male-User.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(530, 190, 80, 40);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1456886171_Remove-Male-User.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(430, 190, 80, 40);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID usuario", "Nombre(s)", "Apellidos", "Perfil"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(12, 240, 660, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
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
        pxtClave.setText("");
        pxtConfirmacion.setText("");
        txtIdUsuario.requestFocusInWindow();
        desbloqueaObjetosFormulario();
        editNuevoDesabilita();
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        cbxPerfil.setSelectedIndex(0);
        btnMas.setEnabled(false);
        mas=true;
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(new String(pxtClave.getPassword()).equals(new String(pxtConfirmacion.getPassword()))){
            if(!txtIdUsuario.getText().equals("") && !txtNombres.getText().equals("") && !txtApellidos.getText().equals("") && cbxPerfil.getSelectedIndex()!=0){
                Usuarios objUsuarios = new Usuarios();
                objUsuarios.setIdUsuario(txtIdUsuario.getText());
                objUsuarios.setNombre(txtNombres.getText());
                objUsuarios.setApellidos(txtApellidos.getText());
                objUsuarios.setClave(new String(pxtClave.getPassword()));
                objUsuarios.setPerfil(cbxPerfil.getSelectedIndex());
                String msg = objDatos2.agregarUsuario(objUsuarios, edit);
                JOptionPane.showMessageDialog(rootPane, msg);
                bloqueaObjetosFormulario();
                editNuevoHabilita();
                llenarTabla();
                posicionUsuario = objDatos2.getNumeroUsuarios()-1;
                mostrarRegistro();
                btnSave.setEnabled(false);
                btnCancel.setEnabled(false);
                edit = false;
                btnMas.setEnabled(true);
                mas=false;
                if(objDatos2.getNumeroUsuarios()>1){
                    btnPrimero.setEnabled(true);
                    btnUltimo.setEnabled(true);
                    btnAtras.setEnabled(true);
                    btnSiguiente.setEnabled(true);
                }
                if(objDatos2.getNumeroUsuarios()>0){
                    btnEdit.setEnabled(true);   
                    btnDelete.setEnabled(true);
                    btnSearch.setEnabled(true);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Campos vacíos");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Las claves no coinciden");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        posicionUsuario = 0;   
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        posicionUsuario = objDatos2.getNumeroUsuarios()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(posicionUsuario > 0)
            posicionUsuario -= 1;
        else
            posicionUsuario = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(posicionUsuario < objDatos2.getNumeroUsuarios() -1)
            posicionUsuario += 1;
        else
            posicionUsuario = objDatos2.getNumeroUsuarios()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try {
            edit=false;
            bloqueaObjetosFormulario();
            editNuevoHabilita();
            llenarTabla();
            mostrarRegistro();
        } catch (Exception e) {
        }
        if(mas==true){
            mas=false;
        }
        if(objDatos2.getNumeroUsuarios()>0){
            btnEdit.setEnabled(true);   
            btnDelete.setEnabled(true);
            btnSearch.setEnabled(true);
        }
        if(objDatos2.getNumeroUsuarios()>1){
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
        int rta = JOptionPane.showConfirmDialog(rootPane, "Desea eliminar el usuario???");
        if(rta != 0){
            return;
        }
        try {
            String msg = objDatos2.delete(txtIdUsuario.getText());
            posicionUsuario = objDatos2.getNumeroUsuarios()-1;
            llenarTabla();
            mostrarRegistro();
            JOptionPane.showMessageDialog(rootPane, msg);
        } catch (Exception e) {
            txtIdUsuario.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            pxtClave.setText("");
            cbxPerfil.setSelectedIndex(0);
            pxtConfirmacion.setText("");
            JOptionPane.showMessageDialog(rootPane, "Usuario eliminado con éxito");
            btnDelete.setEnabled(false);
            btnSearch.setEnabled(false);
            btnEdit.setEnabled(false);
        }
        if(objDatos2.getNumeroUsuarios()<2){
            btnPrimero.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnAtras.setEnabled(false);
            btnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String id = "";
        id = JOptionPane.showInputDialog("Ingrese ID del usuario");
        if(id.equals(""))
            JOptionPane.showMessageDialog(rootPane, "ID invalido");
        else{
            if(!objDatos2.existeUsuario(id)){
                JOptionPane.showMessageDialog(rootPane, "Usuario no localizado");
            }else{
                int num = tblUsuarios.getRowCount();
                for(int i=0; i<num; i++){
                    if(Utilidades.objectToString(tblUsuarios.getValueAt(i, 0)).equals(id)){
                        posicionUsuario = i;
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
    private javax.swing.JComboBox cbxPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pxtClave;
    private javax.swing.JPasswordField pxtConfirmacion;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

    public void mostrarRegistro(){
        txtIdUsuario.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionUsuario, 0)));
        txtNombres.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionUsuario, 1)));
        txtApellidos.setText(Utilidades.objectToString(tblUsuarios.getValueAt(posicionUsuario, 2)));
        pxtClave.setText("");
        String aux = Utilidades.objectToString(tblUsuarios.getValueAt(posicionUsuario, 3));
        cbxPerfil.setSelectedIndex(perfil(aux));
        pxtConfirmacion.setText("");  
    }
}
