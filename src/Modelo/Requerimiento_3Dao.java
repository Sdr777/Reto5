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
public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> respuesta= new ArrayList<>();
        Connection conexion=JDBCUtilities.getConnection();
        try {
            String consulta="select Nombre_Material, max(Precio_Unidad) as Max_Precio_Unidad from MaterialConstruccion group by Nombre_Material having max(Precio_Unidad)>1500;";

            try (Statement statement = conexion.createStatement(); ResultSet resultSet = statement.executeQuery(consulta)) {
                
                while(resultSet.next()){
                    Requerimiento_3 requerimiento3 = new Requerimiento_3();
                    requerimiento3.setNombre_Material(resultSet.getString("Nombre_Material"));
                    requerimiento3.setPrecio_Unidad(resultSet.getInt("Max_Precio_Unidad"));
                    respuesta.add(requerimiento3);
                }
            }
        }
        catch (SQLException e) {
            System.err.println("Error consultando ranking de materiales: "+ e);
        }finally{
            if(conexion!= null){
                conexion.close();
            }
        }
    return respuesta;     
    }
}
