/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Canoa extends Acuatico{
    private int CantidadRemos;

    public Canoa(int CantidadRemos, String forma, double Ancho, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(forma, Ancho, Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.CantidadRemos = CantidadRemos;
    }

    public int getCantidadRemos() {
        return CantidadRemos;
    }

    public void setCantidadRemos(int CantidadRemos) {
        this.CantidadRemos = CantidadRemos;
    }
    
    public void Rotar(){
        System.out.println("Rotando canoa");
    }
}
