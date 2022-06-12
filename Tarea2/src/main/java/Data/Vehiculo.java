/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author josue
 */
public class Vehiculo {
    
    private String Modelo;
    private String Fabricante;
    private double largo;
    private String MaterialContruccion;
    private int CantidadPasajeros;
    private double CapacidadCarga;

//    public Vehiculo() {
//    }

    
    public Vehiculo(String Modelo, String Fabricante, Double largo, String MaterialContruccion, int CantidadPasajeros, Double CapacidadCarga) {
        this.Modelo = Modelo;
        this.Fabricante = Fabricante;
        this.largo = largo;
        this.MaterialContruccion = MaterialContruccion;
        this.CantidadPasajeros = CantidadPasajeros;
        this.CapacidadCarga = CapacidadCarga;
    }

    public Double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(Double CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public String getMaterialContruccion() {
        return MaterialContruccion;
    }

    public void setMaterialContruccion(String MaterialContruccion) {
        this.MaterialContruccion = MaterialContruccion;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }
    
    public void Acelerar(){
        System.out.println("Acelerando");
    }
    
    public void GiroDerecha(){
        System.out.println("Girando Derecha");
    }
    
    public void GiroIzquierda(){
        System.out.println("Giro Izquierda");
    }
}
