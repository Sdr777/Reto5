/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author VISION
 */
public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> respuesta= new ArrayList<>();
        Connection conexion=JDBCUtilities.getConnection();
        try {
            String consulta="select Constructora, Ciudad, Porcentaje_Cuota_Inicial, T.Area_Max || ' ' || T.Estrato as Tipo from Proyecto P inner join Tipo T on (P.ID_Tipo = T.ID_Tipo) where p.Ciudad = 'Armenia' order by  T.Area_Max, T.Estrato;";

            try (Statement statement = conexion.createStatement(); ResultSet resultSet = statement.executeQuery(consulta)) {
                
                while(resultSet.next()){
                    Requerimiento_2 requerimiento2 = new Requerimiento_2();
                    requerimiento2.setConstructora(resultSet.getString("Constructora"));
                    requerimiento2.setCiudad(resultSet.getString("Ciudad"));
                    requerimiento2.setPorcentaje_Cuota_Inicial(resultSet.getDouble("Porcentaje_Cuota_Inicial"));
                    requerimiento2.setTipo(resultSet.getString("Tipo"));
                    respuesta.add(requerimiento2);
                }
            }
        }
        catch (SQLException e) {
            System.err.println("Error consultando Inner Join y Concatenacion: "+ e);
        }finally{
            if(conexion!= null){
                conexion.close();
            }
        }
    return respuesta;     
    }
}
