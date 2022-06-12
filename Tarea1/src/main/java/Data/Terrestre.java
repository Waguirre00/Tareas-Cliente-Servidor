/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Terrestre extends Vehiculo {
    private int CantidadLlantas;
    private String Categoria;

    public Terrestre(int CantidadLlantas, String Categoria, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.CantidadLlantas = CantidadLlantas;
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCantidadLlantas() {
        return CantidadLlantas;
    }

    public void setCantidadLlantas(int CantidadLlantas) {
        this.CantidadLlantas = CantidadLlantas;
    }
    
    public void Frenar(){
        System.out.println("Frenado");
    }
    
    public void Rebersa(){
        System.out.println("Retrocediendo");
    }
}
