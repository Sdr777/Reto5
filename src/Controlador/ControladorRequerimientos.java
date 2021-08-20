/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Requerimiento_1;
import Modelo.Requerimiento_1Dao;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_2Dao;
import Modelo.Requerimiento_3;
import Modelo.Requerimiento_3Dao;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author VISION
 */
public class ControladorRequerimientos {
    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento_2Dao;
    private final Requerimiento_3Dao requerimiento_3Dao;
     public ControladorRequerimientos() {
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
    }
     
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        return this.requerimiento1Dao.requerimiento1();
    }
    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return this.requerimiento_2Dao.requerimiento2();
    }
    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return this.requerimiento_3Dao.requerimiento3();
    }
}
