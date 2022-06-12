/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Camion extends Terrestre implements MovimientoAtras{
    private int CantidadEjes;
    private double CapacidadMaxima;

    public Camion(int CantidadEjes, double CapacidadMaxima, int CantidadLlantas, String Categoria, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(CantidadLlantas, Categoria, Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.CantidadEjes = CantidadEjes;
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public double getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(double CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public int getCantidadEjes() {
        return CantidadEjes;
    }

    public void setCantidadEjes(int CantidadEjes) {
        this.CantidadEjes = CantidadEjes;
    }
    
    public void Remolcar(){
        System.out.println("Remolcando");
    }
    @Override
    public void Acelerar(){
        System.out.println("Acelerando con camion");
    }
    
    @Override
    public void GiroDerecha(){
        System.out.println("Girando Derecha con camion");
    }
    
    @Override
    public void GiroIzquierda(){
        System.out.println("Giro Izquierda con camion");
    }
    
    @Override
    public void Frenar(){
        System.out.println("Frenando con un camion");
    };
    
    @Override
    public void MovimientoAtras(){
        System.out.println("Reberza con un camion");
    }
}
