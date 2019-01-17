
package CapaAccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ClsBDAgenda {
    private Connection con=null;
    private Statement consulta;
    private ResultSet resultado;

public ClsBDAgenda(String direccion){
    try{
        con=DriverManager.getConnection("jdbc:ucanaccess://"+direccion);
        consulta=con.createStatement();
        System.out.print("conexion realizada con exito");
    }
    catch (Exception e){
        System.out.print("error conexion"+e);
    }
}    
public ResultSet cargar() throws SQLException{
    String comando = "SELECT* FROM TbAgenda";
    consulta.execute(comando);
    resultado=consulta.getResultSet();
    return resultado;
}
}
