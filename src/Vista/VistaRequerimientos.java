/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControladorRequerimientos;
import Modelo.Requerimiento_1;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_3;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author VISION
 */
public class VistaRequerimientos {
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("25 Proyectos Clasificados por Casa");
        try {
            // Su código
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();

            // Encabezado del resultado
            System.out.println("Clasificación por Casa");

            // Cada VO cargado, mostrarlo en la vista
            requerimiento1.forEach(req1 -> {
                System.out.printf("%s %s %s %s %s %s %n",
                        req1.getFecha(),
                        req1.getConstructora(),
                        req1.getCiudad(),
                        req1.getAcabados(),
                        req1.getBanco(),
                        req1.getSerial());
            });

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
    
    public static void requerimiento2() {
        System.out.println("INNER JOIN");
        try {
            ArrayList<Requerimiento_2> requerimiento2= controlador.consultarRequerimiento2();
            System.out.println("Concatenacion");
            requerimiento2.forEach(req2 -> {
                System.out.printf("%s %s %f %s %n",
                        req2.getConstructora(),
                        req2.getCiudad(),
                        req2.getPorcentaje_Cuota_Inicial(),
                        req2.getTipo());
            });
           
            } catch (SQLException e) {
                    System.err.println(e);
            }
    }
    public static void requerimiento3() {
        System.out.println("-----Ranking Materiales-------"); 
        try {
            ArrayList<Requerimiento_3> requerimiento3= controlador.consultarRequerimiento3();
            System.out.println("Materiales");
            requerimiento3.forEach(req3 -> {
                System.out.printf("%s %d %n",
                        req3.getNombre_Material(),
                        req3.getPrecio_Unidad());
            });

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
