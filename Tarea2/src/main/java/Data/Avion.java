/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Avion extends Aereo {
    private double LongitudAlas;
    private String TipoTrenAterrizaje;

    public Avion(double LongitudAlas, String TipoTrenAterrizaje, int CantidadMotores, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(CantidadMotores, Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.LongitudAlas = LongitudAlas;
        this.TipoTrenAterrizaje = TipoTrenAterrizaje;
    }

    public String getTipoTrenAterrizaje() {
        return TipoTrenAterrizaje;
    }

    public void setTipoTrenAterrizaje(String TipoTrenAterrizaje) {
        this.TipoTrenAterrizaje = TipoTrenAterrizaje;
    }

    public double getLongitudAlas() {
        return LongitudAlas;
    }

    public void setLongitudAlas(double LongitudAlas) {
        this.LongitudAlas = LongitudAlas;
    }
    
    public void Planear(){
        System.out.println("Planeando");
    }
    
    @Override
    public void Subir(){
        System.out.println("Subiendo con un avion");
    };
    @Override
    public void Bajar(){
         System.out.println("Bajand con un avion");
    };
}
