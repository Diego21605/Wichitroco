
package proyecto;

import java.sql.*;
import com.mysql.jdbc.jdbc2.optional.*;

public class conexion {
    
    Connection conexion;
    ResultSet resul;
    Statement stm;
   
  public conexion () throws Exception{
      
    MysqlDataSource datos = new MysqlDataSource();  
      
    datos.setServerName("localhost");
    datos.setUser("root");
    datos.setPassword("");
    datos.setDatabaseName("wichitroco");
    
    conexion = datos.getConnection();
    
  }
   
  public void dml(String instrucciones) throws SQLException{
      
     stm=conexion.createStatement();
     stm.execute(instrucciones);
      
  }
  
  public ResultSet GetConsultar (String sql) throws SQLException{
        
      stm=conexion.createStatement();
      resul=stm.executeQuery(sql);
      return resul;
    
  }
  
  public void Setcerrar() throws SQLException{
      
      conexion.close();
      
  }

}
