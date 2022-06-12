/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public abstract class Acuatico extends Vehiculo{
    private String forma;
    private double Ancho;

//    public Acuatico() {
//    }

    
    public Acuatico(String forma, double Ancho, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.forma = forma;
        this.Ancho = Ancho;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
    public abstract void Navegar();
    
}
