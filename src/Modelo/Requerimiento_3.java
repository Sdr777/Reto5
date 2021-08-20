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
public class Requerimiento_3 {
    private Integer Precio_Unidad;
    private String Nombre_Material;

    public Requerimiento_3() {   
    }
    public Requerimiento_3(String Nombre_Material, Integer Precio_Unidad) {
        this.Nombre_Material = Nombre_Material;
        this.Precio_Unidad= Precio_Unidad;
    }
    public String getNombre_Material() {
        return Nombre_Material;
    }
    public void setNombre_Material(String Nombre_Material) {
        this.Nombre_Material = Nombre_Material;
    }
    public Integer getPrecio_Unidad() {
        return Precio_Unidad;
    }
    public void setPrecio_Unidad(Integer Precio_Unidad) {
        this.Precio_Unidad = Precio_Unidad;
    }
}
