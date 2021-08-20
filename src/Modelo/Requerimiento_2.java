/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author VISION
 */
public class Requerimiento_2 {
    private Double Porcentaje_Cuota_Inicial;
    private String Tipo;
    private String Constructora;
    private String Ciudad;

    public Requerimiento_2() {   
    }
    
    public Requerimiento_2(String Constructora, String Ciudad, Double Porcentaje_Cuota_Inicial, String Tipo) {
        this.Constructora = Constructora;
        this.Ciudad = Ciudad;
        this.Porcentaje_Cuota_Inicial= Porcentaje_Cuota_Inicial;
        this.Tipo = Tipo;
    }
    public Double getPorcentaje_Cuota_Inicial() {
        return Porcentaje_Cuota_Inicial;
    }
    public void setPorcentaje_Cuota_Inicial(Double Porcentaje_Cuota_Inicial) {
        this.Porcentaje_Cuota_Inicial = Porcentaje_Cuota_Inicial;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
}
