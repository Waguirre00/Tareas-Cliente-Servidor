/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Helicoptero extends Aereo implements MovimientoAtras,RotarMismoEje{
    private String TipoCola;
    private int CantidadAspas;

    public Helicoptero(String TipoCola, int CantidadAspas, int CantidadMotores, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(CantidadMotores, Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.TipoCola = TipoCola;
        this.CantidadAspas = CantidadAspas;
    }

    public int getCantidadAspas() {
        return CantidadAspas;
    }

    public void setCantidadAspas(int CantidadAspas) {
        this.CantidadAspas = CantidadAspas;
    }

    public String getTipoCola() {
        return TipoCola;
    }

    public void setTipoCola(String TipoCola) {
        this.TipoCola = TipoCola;
    }

    public void Despegar(){
        System.out.println("Despegar vertical");
    }
    
    @Override
    public void Subir(){
        System.out.println("Subiendo con un Helicoptero");
    };
    
    @Override
    public void Bajar(){
         System.out.println("Bajand con un Helicoptero");
    };
    
    @Override
    public void MovimientoAtras(){
        System.out.println("Reberza con un camion");
    }
    
    @Override
    public void Rotando(){
        System.out.println("Rotando canoa");
    }
}
