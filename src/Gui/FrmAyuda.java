package Gui;

public class FrmAyuda extends javax.swing.JDialog {
    
    public FrmAyuda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComoUtilizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ayuda");

        jLabel1.setFont(new java.awt.Font("Arial", 2, 27)); // NOI18N
        jLabel1.setText("¿Aún no sabe por donde empezar?");

        ComoUtilizar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ComoUtilizar.setText("*  ¿Cómo a empezar a utilizar el sistema?                                   ");
        ComoUtilizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estableceAyuda(evt);
            }
        });

        Informacion.setEditable(false);
        Informacion.setColumns(20);
        Informacion.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        Informacion.setRows(5);
        Informacion.setText("Informacion basica sobre el sistema de facturación");
        jScrollPane1.setViewportView(Informacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComoUtilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 383, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComoUtilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estableceAyuda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estableceAyuda
        Informacion.setText("**  ¿Cómo utilizar el sistema?\n\n"
                + "El sistema contiene un menú principal que contiene:\n"
                + "1)  Archivo.\n"
                + "     Despliega un submenú para operar con los datos de clientes, productos, usuarios: \n"
                + "     1.1)  Clientes.\n"
                + "             En la interface clientes podeis realizar las operaciones\n"
                + "             con los clientes, tales como: agregar nuevos clientes, eliminar\n"
                + "             un cliente, buscar clientes y editar los datos de los clientes insertados\n"
                + "             actualmente en la base de datos.\n\n"
                + "     1.2)  Productos.\n"
                + "             En la interface deproductos podrá manipular los datos de los productos,\n"
                + "             como agregar un nuevo producto a la base de datos, eliminar un producto, cambiar\n"
                + "             su precio o algún dato del producto. De igual manera podrá eliminar un \n"
                + "             producto, bucar un producto, todo con sus respectivos botones.\n\n"
                + "     1.3)  Usuarios.\n"
                + "             En ésta interface podrá agregar nuevos usuarios que tendrán acceso al sistema.\n"
                + "             Existen dos tipos de usuarios, el administrador y el empleado. El administrador tendrá\n"
                + "             acceso a todas las opciones del sistema. El empleado tendrá acceso a las opciones del sistema\n"
                + "             excepto los submenús de clientes, productos, usuarios y nueva factura, ya que éstas tareas solo\n"
                + "             lo podrá realizar un usuario administrador.\n"
                + "             De igual manera ésta interface tiene la posibilidad de realizar todas las operaciones anteriores mencionadas,\n"
                + "             insertar un usuario, eliminar un usuario, modificar un usuario y buscar un usuario.\n\n"
                + "     1.4)  Cambio clave.\n"
                + "             Ésta ventana le proporciona la posibilidad de cambiar la clave del usuario actualmente\n"
                + "             loggeado en el sistema.\n\n"
                + "     1.5)  Cambio usuario.\n"
                + "             Desde ésta ventana, ustéd podrá cambiar de usuario en el sistema, es decir, salir del usuario\n"
                + "             actualmente loggeado y entrar con otro usuario.\n\n"
                + "     1.6)  Cerrar sesión.\n"
                + "             Con ésta opción, el sistema termina su ejecución.\n\n"
                + "2)  Movimientos.\n"
                + "     Despliega un submenú para generar facturas y reportes.\n"
                + "     2.1)  Nueva factura.\n"
                + "             Agrega una nueva factura a la base de datos, deberá proporcionar los datos\n"
                + "             que se le pide.\n\n"
                + "     2.2)  Reporte factura.\n"
                + "             Genera un reporte de algunas de las facturas creadas anteriormente.\n\n"
                + "3)  Ayuda.\n"
                + "     Despliega un menú de 2 opciones.\n"
                + "     3.1)  Ayuda.\n"
                + "             Muestra las ayudas de cómo ocupar el sistema.\n\n"
                + "     3.2)  Acerca de.\n"
                + "             Muestra la información del creador del sistema facturacion.\n\n"
                + "\n\nNota:\n"
                + "Todo el sistema, y sus opciones están conectados directamente con una base de datos\n"
                + "la cual se actualiza cada vez que se hacen modificaciones con los datos del sistema.");
    }//GEN-LAST:event_estableceAyuda
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmAyuda dialog = new FrmAyuda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComoUtilizar;
    private javax.swing.JTextArea Informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
