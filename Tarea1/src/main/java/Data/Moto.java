/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Moto extends Terrestre {
    private int Cilindrada;
    private String TipoVolante;

    public Moto(int Cilindrada, String TipoVolante, int CantidadLlantas, String Categoria, String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        super(CantidadLlantas, Categoria, Modelo, Fabricante, largo, MaterialContruccion, CantidadPasajeros, CapacidadCarga);
        this.Cilindrada = Cilindrada;
        this.TipoVolante = TipoVolante;
    }

    public String getTipoVolante() {
        return TipoVolante;
    }

    public void setTipoVolante(String TipoVolante) {
        this.TipoVolante = TipoVolante;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int Cilindrada) {
        this.Cilindrada = Cilindrada;
    }
    
    public void Arancar(){
        System.out.println("Haciendo el caballito");
    }
    
    @Override
    public void Acelerar(){
        System.out.println("Acelerando con moto");
    }
    
    @Override
    public void GiroDerecha(){
        System.out.println("Girando Derecha con moto");
    }
    
    @Override
    public void GiroIzquierda(){
        System.out.println("Giro Izquierda con moto");
    }
}
