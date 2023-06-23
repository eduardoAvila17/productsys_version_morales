package programas;

import formularios.acceso;
import formularios.menupri;
import java.sql.*;
import javax.swing.*;

public class ver_conex
{
    ///parametros para la conexion
     public String login = acceso.vuser;
    public String pass = acceso.vpas;    
    public final String URL_BD = "jdbc:mysql://"+acceso.vhost+"/"+acceso.vbd;
    ///

    public Connection conexion = null;
    //ojo
    public Statement sentencia;
    public ResultSet resultado;
	

	public static void main(String[] args) // programa principal
	{
		new ver_conex();// llama al constructor
	}
    
    public ver_conex()// constructor
    {
        try  // todo bien if
        {
            Class.forName("com.mysql.jdbc.Driver");//Se registra el Driver jdbc de MySQL
            conexion = DriverManager.getConnection(URL_BD,login,pass);
             
            //JOptionPane.showMessageDialog(null, "YA ESTAS CONECTADO  A LA BASE DE DATOS","Bienvenidos",JOptionPane.INFORMATION_MESSAGE);
            
	    //  new menupri().setVisible(true);            	
        } 
        catch (Exception e) // error de conexion else
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema con la conexion" , "Verifiquelo",JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        }
    }

    public boolean ejecurarConsulta(String query){
    //throw new UnsupportedOperationException("Not yet implemented");
    try {
        sentencia=conexion.createStatement();
     resultado=sentencia.executeQuery(query);
  return true;
    }
   catch (Exception e) // error de conexion
        { 
       
       e.printStackTrace();
       return false;
               
   } 
    
    }
 }



