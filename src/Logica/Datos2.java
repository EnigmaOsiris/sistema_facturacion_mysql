package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
 import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Datos2 {
    private Connection con;
    private String idUsuario, clave;
    
    public Datos2(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db = "jdbc:mysql://localhost/escuela";
            con = DriverManager.getConnection(db, "root", "meinkampf");
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    //OPERACIONES USUARIOS
    public boolean validarUsuario(String usuario, String clave){
        try {
            this.setClave(clave);
            String sql = "select (1) from usuarios where idUsuarioss = '"
                    + usuario + "' and clave = '" + clave + "'";
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                setIdUsuario(usuario);
                return true;
            }
            return false;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int getPerfil(String usuario){
        String sql = "select idPerfil from usuarios where idUsuarios = '" + usuario + "'";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt("idPerfil");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }
    
    public boolean existeUsuario(String usuario){
        String sql = "select idPerfil from usuarios where idUsuarioss = '" + usuario + "'";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    //agrega usuario
    public String agregarUsuario(Usuarios objUsuarios, boolean edit){
        //buca el usuario
        if(existeUsuario(objUsuarios.getIdUsuario()) && !edit){
            return "El usuario ya existe";
        }
        boolean ser=false;
        String email,op2,op3,opp2,ape12;
        //inserta usuario si la condicion cumple
        if(!edit){                                  
                email = objUsuarios.getIdUsuario();                             //obtiene el contenido de la caja de texto y lo almacena en email
                Pattern pat = Pattern.compile("^[\\w-]");                       //crea una variable de tipo pattern y guarda la expresion regular
                Matcher mat = pat.matcher(email);                               //Crea una variable de tipo matcher y compara con los valores de email 
                                                    //con la expresion
                if(mat.find()){                                                 //si email es encontrada en los valores de la expresion regular 
                    JOptionPane.showMessageDialog(null, "validacion Precio Correcta");        //despliega la ventana de confirmacion
                }else{                                                          //si no
                    JOptionPane.showMessageDialog(null, "validacion IdUsuario Incorrecta");      //despliega el mensaje de validacion incorrecta
                }   
                
                
                
                op2 = objUsuarios.getNombre();                                  //obtiene el contenido de la caja de texto y lo almacena en email
                Pattern pat2 = Pattern.compile("(([A-Z])([a-z])+)");            //crea una variable de tipo pattern y guarda la expresion regular
                Matcher mat2 = pat2.matcher(op2);                               //Crea una variable de tipo matcher y compara con los valores de email 
                                                    //con la expresion
                if(mat2.find()){                                                //si email es encontrada en los valores de la expresion regular 
                    JOptionPane.showMessageDialog(null, "validacion Nombre correcta");  //despliega la ventana de confirmacion
                }else{                                                          //si no
                    JOptionPane.showMessageDialog(null, "validacion Nombre Incorrecta");        //despliega el mensaje de validacion incorrecta
                }                   
    //////////////        
                opp2 = objUsuarios.getClave();
                Pattern pat13 = Pattern.compile("^[\\w-]");
                Matcher mat13 = pat13.matcher(opp2);
                if(mat13.find()){
                    JOptionPane.showMessageDialog(null, "validacion Apellido correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "validacion Apellido Incorrecta");                 
                }                               
         ////////////////////////////     
                
                //////////////        
                ape12 = objUsuarios.getApellidos();
                Pattern pat3 = Pattern.compile("(([A-Z])([a-z])+)");
                Matcher mat3 = pat3.matcher(ape12);
                if(mat3.find()){
                    JOptionPane.showMessageDialog(null, "validacion Apellido correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "validacion Apellido Incorrecta");                 
                }                               
         ////////////////////////////    
        String sql = "insert into usuarios values ('"
                + objUsuarios.getIdUsuario() + "', '"
                + objUsuarios.getNombre() + "', '"
                + objUsuarios.getApellidos() + "', '"
                + objUsuarios.getClave() + "', "
                + objUsuarios.getPerfil()+ ")";
            try {
                Statement st = getCon().createStatement();
                st.executeUpdate(sql);
                return "Usuario agregado con éxito";
            } catch (SQLException e) {
                java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
                return "Error al intentar insertar el usuario";
            }
        
        
        
        
        } else {//Actualiza datos del usuario
            
            String email3,op4,op5,lll;
            email3 = objUsuarios.getIdUsuario();
                Pattern pat5 = Pattern.compile("^[\\w-]");
                Matcher mat5 = pat5.matcher(email3);
                if(mat5.find()){
                    JOptionPane.showMessageDialog(null, "validacion IdUsuariio Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion IdUsuario Incorrecta");      
                }   
                
                
                
                op4 = objUsuarios.getNombre();
                Pattern pat6 = Pattern.compile("(([A-Z])([a-z])+)");
                Matcher mat6 = pat6.matcher(op4);
                if(mat6.find()){                
                    JOptionPane.showMessageDialog(null, "validacion Nombre correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "validacion Nombre Incorrecta");
                }                   
    //////////////        
                op5 = objUsuarios.getApellidos();
                Pattern pat7 = Pattern.compile("(([A-Z])([a-z])+)");
                Matcher mat7 = pat7.matcher(op5);
                if(mat7.find()){
                    JOptionPane.showMessageDialog(null, "validacion Apellido correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "validacion Apellido Incorrecta");                 
                }                               
         ////////////////////////////    
                //////////////        
                lll = objUsuarios.getClave();
                Pattern pat13 = Pattern.compile("^[\\w-]");
                Matcher mat13 = pat13.matcher(lll);
                if(mat13.find()){
                    JOptionPane.showMessageDialog(null, "validacion clave correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "validacion clave Incorrecta");                 
                }                               
         ////////////////////////////    
            
            String sql = "update usuarios set "
                + "nombres = '" + objUsuarios.getNombre() + "', "
                + "apellidos = '" + objUsuarios.getApellidos()+ "', "
                + "clave = '" + objUsuarios.getClave()+ "', "
                + "idPerfil = " + objUsuarios.getPerfil()+ " "
                + "where idUsuarioss = '" + objUsuarios.getIdUsuario()+ "'";
            try {
                Statement st = getCon().createStatement();
                st.executeUpdate(sql);
                return "Usuario actualizado con éxito";
            } catch (SQLException e) {
                java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
                return "Error al intentar actualizar el usuario";
            }
        }
    }
    
        //elimina objeto de la lista
    public String delete(String idUsuario){
        String sql = "delete from usuarios where idUsuarioss = '" + idUsuario + "'";
        try {
            Statement st = getCon().createStatement();
            st.executeUpdate(sql);
            return "Usuario borrado con éxito";
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return "Error al intentar borrar el usuario";
        }
    }
    
    public ResultSet getUsuarios(){
        String sql = "select * from usuarios";
        try {
            Statement st = getCon().createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public int getNumeroUsuarios(){
        String sql = "select count(*) as num from usuarios";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt("num");
            }else{
                return 0;
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    
    
    //OPERACIONES PRODUCTOS
    public boolean existeProducto(String producto){
        String sql = "select (1) from productos where idProducto = '" + producto + "'";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    //agrega producto
    public String agregarProducto(Productos objProductos, boolean edit){        
        //buca el producto
        if(existeProducto(objProductos.getId_Productos()) && !edit){
            return "El producto ya existe";
        }
        String idPro,descrip,iva,notas;             
        double precio;
        //inserta producto si la condicion cumple
        if(!edit){
            idPro = objProductos.getId_Productos();
                Pattern pat01 = Pattern.compile("^[\\w-]");
                Matcher mat01 = pat01.matcher(idPro);
                if(mat01.find()){
                    JOptionPane.showMessageDialog(null, "validacion Producto Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion Producto Incorrecta");      
                }
            descrip = objProductos.getDescripcion();
                Pattern pat02 = Pattern.compile("^[\\w-]");
                Matcher mat02 = pat02.matcher(descrip);
                if(mat02.find()){
                    JOptionPane.showMessageDialog(null, "validacion descripcion Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion descripcion Incorrecta");      
                }
            
                notas = objProductos.getNotas();
                Pattern pat03 = Pattern.compile("^[\\w-]");
                Matcher mat03 = pat03.matcher(descrip);
                if(mat03.find()){
                    JOptionPane.showMessageDialog(null, "validacion notas Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion notas Incorrecta");      
                }
                
                /*
                op2 = objUsuarios.getNombre();                                  //obtiene el contenido de la caja de texto y lo almacena
                Pattern pat2 = Pattern.compile("(([A-Z])([a-z])+)");            //crea una variable de tipo pattern y guarda la expresion regular
                Matcher mat2 = pat2.matcher(op2);                               //Crea una variable de tipo matcher y compara con los valores de email 
                                                    //con la expresion
                if(mat2.find()){                                                //si email es encontrada en los valores de la expresion regular 
                    JOptionPane.showMessageDialog(null, "validacion Nombre correcta");  //despliega la ventana de confirmacion
                }else{                                                          //si no
                    JOptionPane.showMessageDialog(null, "validacion Nombre Incorrecta");        //despliega el mensaje de validacion incorrecta
                }                   */
                
                
                precio = objProductos.getPrecio();                              //obtiene el contenido de la caja de texto y lo almacena
                Pattern pat04 = Pattern.compile("(([0-9])+.([0-9])+)");         //crea una variable de tipo pattern y guarda la expresion regular
                Matcher mat04 = pat04.matcher(idPro);                           //Crea una variable de tipo matcher y compara con los valores 
                                                    //con la expresion
                if(mat04.find()){                                                //si la cadena es encontrada en los valores de la expresion regular    
                    JOptionPane.showMessageDialog(null, "validacion precio Correcta");  //despliega la ventana de confirmacion               
                }else{                                                          //si no
                    JOptionPane.showMessageDialog(null, "validacion precio Incorrecta");     //despliega el mensaje de validacion incorrecta  
                }
            
            
            
            String sql = "insert into productos values ('"
                + objProductos.getId_Productos() + "', '"
                + objProductos.getDescripcion() + "', "
                + objProductos.getPrecio() + ", "
                + objProductos.getIva() + ", '"
                + objProductos.getNotas()+ "')";
            try {
                Statement st = getCon().createStatement();
                st.executeUpdate(sql);
                return "Producto agregado con éxito";
            } catch (SQLException e) {
                java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
                return "Error al intentar insertar el producto";
            }
        } else {//Actualiza datos del producto
            
            idPro = objProductos.getId_Productos();
                Pattern pat01 = Pattern.compile("^[\\w-]");
                Matcher mat01 = pat01.matcher(idPro);
                if(mat01.find()){
                    JOptionPane.showMessageDialog(null, "validacion Producto Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion Producto Incorrecta");      
                }
            descrip = objProductos.getDescripcion();
                Pattern pat02 = Pattern.compile("^[\\w-]");
                Matcher mat02 = pat02.matcher(descrip);
                if(mat02.find()){
                    JOptionPane.showMessageDialog(null, "validacion descripcion Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion descripcion Incorrecta");      
                }
            
                notas = objProductos.getNotas();
                Pattern pat03 = Pattern.compile("^[\\w-]");
                Matcher mat03 = pat03.matcher(descrip);
                if(mat03.find()){
                    JOptionPane.showMessageDialog(null, "validacion notas Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion notas Incorrecta");      
                }
                
                precio = objProductos.getPrecio();
                Pattern pat04 = Pattern.compile("(([0-9])+.([0-9])+)");
                Matcher mat04 = pat04.matcher(idPro);
                if(mat04.find()){
                    JOptionPane.showMessageDialog(null, "validacion precio Correcta");                 
                }else{
                    JOptionPane.showMessageDialog(null, "validacion precio Incorrecta");      
                }
                
                
            String sql = "update productos set "
                + "descripcion = '" + objProductos.getDescripcion() + "', "
                + "precio = " + objProductos.getPrecio()+ ", "
                + "idIva = " + objProductos.getIva()+ ", "
                + "notas = '" + objProductos.getNotas()+ "' "
                + "where idProducto = '" + objProductos.getId_Productos() + "'";
            try {
                Statement st = getCon().createStatement();
                st.executeUpdate(sql);
                return "Producto actualizado con éxito";
            } catch (SQLException e) {
                java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
                return "Error al intentar actualizar el producto";
            }
        }
    }
    
        //elimina objeto de la lista
    public String deleteProducto(String idProducto){
        String sql = "delete from productos where idProducto = '" + idProducto + "'";
        try {
            Statement st = getCon().createStatement();
            st.executeUpdate(sql);
            return "Producto borrado con éxito";
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return "Error al intentar borrar el producto";
        }
    }
    
    public ResultSet getProductos(){
        String sql = "select * from productos";
        try {
            Statement st = getCon().createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public Productos getProducto(String idProducto){
        Productos miProducto = null;
        String sql = "select * from productos where idProducto = '" + idProducto + "'";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                miProducto = new Productos(
                    rs.getString("idProducto"), 
                    rs.getString("descripcion"), 
                    rs.getDouble("precio"),
                    rs.getInt("idIva"), 
                    rs.getString("notas"));
            }
            return miProducto;
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public int getNumeroProductos(){
        String sql = "select count(*) as num from productos";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt("num");
            }else{
                return 0;
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }


    //OPERACIONES CLIENTES    
    public boolean existeCliente(String cliente){
        String sql = "select (1) from clientes where idClientes = '" + cliente + "'";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    //agrega usuario
    public String agregarCliente(Clientes objClientes, boolean edit){
        //buca el usuario
        if(existeCliente(objClientes.getIdCliente()) && !edit){
            return "El cliente ya existe";
        }
        String idClien,Nombre,Apellidos,Direccion,telefono;
        //inserta usuario si la condicion cumple
        idClien = objClientes.getIdCliente();
                Pattern pat04 = Pattern.compile("^[\\w-]");
                Matcher mat04 = pat04.matcher(idClien);
                if(mat04.find()){
                    JOptionPane.showMessageDialog(null, "validacion id Correcta");                 
                    
                }else{
                    JOptionPane.showMessageDialog(null, "validacion id Incorrecta");      
                }
        Nombre = objClientes.getNombres();
                Pattern pat05 = Pattern.compile("(([A-Z])([a-z])+)");
                Matcher mat05 = pat05.matcher(Nombre);
                if(mat05.find()){
                    JOptionPane.showMessageDialog(null, "validacion Nombre Correcta");                 
                    
                }else{
                    JOptionPane.showMessageDialog(null, "validacion nombre Incorrecta");      
                }
        Apellidos = objClientes.getApellidos();
                Pattern pat06 = Pattern.compile("(([A-Z])([a-z])+)");
                Matcher mat06 = pat06.matcher(Nombre);
                if(mat06.find()){
                    JOptionPane.showMessageDialog(null, "validacion apellido Correcta");                 
                    
                }else{
                    JOptionPane.showMessageDialog(null, "validacion apellido Incorrecta");      
                }
                
                
                
         String telefono2;
         long telefono3;
         telefono3=objClientes.getTelefono();                                   //obtiene la cadena de la caja de texto
         telefono2=telefono3+" ";
         Pattern pat12 = Pattern.compile("[0-9]+{10}");                         //almacena la expresion regular 
         Matcher mat12 = pat12.matcher(telefono2);                              //compara las cadena si existe en la expresion
         if(mat12.find()){                                                      //si encuentra la cadena dentro de la expresion
            JOptionPane.showMessageDialog(null, "validacion telefono Correcta");        //muestra mensaje confirmacion
         }else{                                                                         //si no
            JOptionPane.showMessageDialog(null, "validacion telefono inCorrecta");      //Validacion incorrecta
         }
         
         
         String ciudad;
         int ciudad2;
         ciudad2=objClientes.getCiudad();
         ciudad=ciudad2+" ";
         Pattern pat13 = Pattern.compile("[0-9]+{1,2}");
         Matcher mat13 = pat13.matcher(ciudad);
         if(mat13.find()){
            JOptionPane.showMessageDialog(null, "validacion ciudad Correcta");
         }else{
            JOptionPane.showMessageDialog(null, "validacion ciudad inCorrecta");
         }
        
        if(!edit){
            String sql = "insert into clientes values ('"
                + objClientes.getIdCliente()+ "', '"
                + objClientes.getNombres() + "', '"
                + objClientes.getApellidos() + "', '"
                + objClientes.getDireccion()+ "', '"
                + objClientes.getTelefono() + "', '"
                + Utilidades.formatDate(objClientes.getFechaNacimiento())+ "', '"
                + objClientes.getTipoIdentificacion()+ "', "
                + objClientes.getCiudad()+ ", '"
                + Utilidades.formatDate(objClientes.getFechaIngreso())+ "')";
            try {
                Statement st = getCon().createStatement();
                st.executeUpdate(sql);
                return "Cliente agregado con éxito";
            } catch (SQLException e) {
                java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
                return "Error al intentar insertar el cliente";
            }
        } else {//Actualiza datos del usuario
            String sql = "update clientes set "
                + "nombres = '" + objClientes.getNombres() + "', "
                + "apellidos = '" + objClientes.getApellidos()+ "', "
                + "direccion = '" + objClientes.getDireccion()+ "', "
                + "telefono = '" + objClientes.getTelefono()+ "', "
                + "fecha_nacimiento = '" + Utilidades.formatDate(objClientes.getFechaNacimiento())+ "', "
                + "identificacion = '" + objClientes.getTipoIdentificacion()+ "', "
                + "ciudad = " + objClientes.getCiudad()+ ", "
                + "fecha_ingreso = '" + Utilidades.formatDate(objClientes.getFechaIngreso()) + "' "
                + "where idClientes = '" + objClientes.getIdCliente()+ "'";
            try {
                Statement st = getCon().createStatement();
                st.executeUpdate(sql);
                return "Cliente actualizado con éxito";
            } catch (SQLException e) {
                java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
                return "Error al intentar actualizar el cliente";
            }
        }
    }
    
        //elimina objeto de la lista
    public String deleteCliente(String idCliente){
        String sql = "delete from clientes where idClientes = '" + idCliente + "'";
        try {
            Statement st = getCon().createStatement();
            st.executeUpdate(sql);
            return "CLiente borrado con éxito";
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return "Error al intentar borrar el cliente";
        }
    }
    
    public ResultSet getClientes(){
        String sql = "select * from clientes";
        try {
            Statement st = getCon().createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public int getNumeroClientes(){
        String sql = "select count(*) as num from clientes";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt("num");
            }else{
                return 0;
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }
    
    public  int getNumFac(){
        String sql = "select max(idFactura) as num from facturas";
        try {
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt("num") + 1;
            }else{
                return 1;
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public void agregarFactura(int idFactura, String idCliente, Date fecha){
        String sql = "insert into facturas values ("
            + idFactura + ", '"
            + idCliente + "', '" 
            + Utilidades.formatDate(fecha) + "')";
        try {
            Statement st = getCon().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
        }
    }

    public String agregarDetalleFactura(int idFactura, int idLinea, String idProducto, 
            String descripcion, double precio, int cantProd){
        String sql = "insert into detallefactura values ("
            + idFactura + ", "
            + idLinea + ", '"
            + idProducto + "', '"
            + descripcion + "', "
            + precio + ", "
            + cantProd + ")";
        try {
            Statement st = getCon().createStatement();
            st.executeUpdate(sql);
            return "Factura agregado con éxito.";
        } catch (SQLException e) {
            return "Error al agregar la factura.";
        }
    }
    
    public String getidLoggeado(){
       return getIdUsuario();
    }
    
    public String getClave(){
        return clave;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public ResultSet getConsulta(String sql){
        try {
            Statement st = getCon().createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }    
    }
    
    public ResultSet getFacturas(){
        String sql = "select * from facturas";
        try {
            Statement st = getCon().createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(Datos2.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }    
    }
}
