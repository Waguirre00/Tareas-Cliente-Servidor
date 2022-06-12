/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Aereo extends Vehiculo {
    private int CantidadMotores;

    public Aereo(int CantidadMotores, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.CantidadMotores = CantidadMotores;
    }

    public int getCantidadMotores() {
        return CantidadMotores;
    }

    public void setCantidadMotores(int CantidadMotores) {
        this.CantidadMotores = CantidadMotores;
    }
    
    public void Subir(){
        System.out.println("Subiendo");
    }
    
    public void Bajar(){
        System.out.println("Bajando");
    }
}
