
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author IntegraSot
 */
public class conexion {
   private static final String JDBC_BD = "integrasoft";
   private static final String JDBC_USER = "root";
   private static final String JDBC_PASSWORD = "12345678";
   private static final String JDBC_URL = "jdbc:mysql://localhost/" + JDBC_BD;

   java.sql.Connection connection = null;
            
public conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión enviando el parametro de la URL, User y Contrasena
         connection = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

         if (connection!=null){
            System.out.println("Conexión a base de datos "+JDBC_BD+" OK\n");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
  /**Permite retornar la conexion a la BD
     * @return n*/
   public java.sql.Connection getConnection(){
      return connection;
   }
   
   public static void close(ResultSet rs) throws SQLException{
       rs.close();
   }
   
   public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }
   
   public static void close(PreparedStatement stmt) throws SQLException{
       stmt.close();
   }
   
   public static void close(java.sql.Connection conexion) throws SQLException{
       conexion.close();
   }
   
   //Desconecta la conexion a la BD
   public void desconectar(){
      connection = null;
   }

  
}

