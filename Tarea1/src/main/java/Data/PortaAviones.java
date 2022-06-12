/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class PortaAviones extends Acuatico{
    private String TipoMotor;
    private int CapacidadAviones;

    public PortaAviones(String TipoMotor, int CapacidadAviones, String forma, double Ancho, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(forma, Ancho, Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.TipoMotor = TipoMotor;
        this.CapacidadAviones = CapacidadAviones;
    }

    public int getCapacidadAviones() {
        return CapacidadAviones;
    }

    public void setCapacidadAviones(int CapacidadAviones) {
        this.CapacidadAviones = CapacidadAviones;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String TipoMotor) {
        this.TipoMotor = TipoMotor;
    }
    
    public void Disparar(){
        System.out.println("Disparando");
    }
}
