package programas;
import formularios.acceso;
import formularios.menupri;
import java.sql.*;
import javax.swing.*;
import org.jvnet.substance.SubstanceLookAndFeel;

public class conexion
{
    ///parametros para la conexion
    public String login = acceso.vuser;
    public String pass = acceso.vpas;    
    public final String URL_BD = "jdbc:mysql://"+acceso.vhost+"/"+acceso.vbd;
    public Statement sentencia;
    public ResultSet resultado;
    ///

    public Connection conexion = null;
//    Statement sentencia;
//    private ResultSet resultado;
    public conexion()// constructor
    {
        try  // todo bien if
        {
            Class.forName("com.mysql.jdbc.Driver");//Se registra el Driver jdbc de MySQL
            conexion = DriverManager.getConnection(URL_BD,login,pass);
             
            JOptionPane.showMessageDialog(null, "YA ESTAS CONECTADO  A LA BASE DE DATOS","Bienvenidos",JOptionPane.INFORMATION_MESSAGE);
            
//	     new menu().setVisible(true);            	
        } 
        catch (Exception e) // error de conexion else
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema con la conexion" , "Verifiquelo",JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        }
    }

    public boolean ejecurarConsulta(String query) {
      //  throw new UnsupportedOperationException("Not yet implemented");
               try{
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
    @SuppressWarnings("CallToThreadDumpStack")
     public ResultSet dameLista(String campos, String tabla, String condicion) {
        ResultSet rs = null;
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery("select " + campos + " from " + tabla + " " + condicion);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error", "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("select " + campos + " from " + tabla + " " + condicion);
        }
        return rs;
    }

    @SuppressWarnings("CallToThreadDumpStack")
    public ResultSet dameLista(String sql) {
        ResultSet rs = null;
        try {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            rs = s.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio Un error", "Atencion",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println(sql);
        }
        return rs;
    }
 
 }




