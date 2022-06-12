/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Data;

/**
 *
 * @author josue
 */
public class Tarea1 {

    public static void main(String[] args) {
        
        Vehiculo MyVehiculo = new Vehiculo("F1","Ferrari",6.5,"Fribra de carbono",2,100.4);
        
        MyVehiculo.setModelo("Truper");
        MyVehiculo.setFabricante("Toyota");
        MyVehiculo.setLargo(6.3);
        MyVehiculo.setMaterialContruccion("Acero");
        MyVehiculo.setCantidadPasajeros(6);
        MyVehiculo.setCapacidadCarga(500.4);
        
        System.out.println("Vehiculo");
        System.out.println(MyVehiculo.getModelo());
        System.out.println(MyVehiculo.getFabricante());
        System.out.println(MyVehiculo.getLargo());
        System.out.println(MyVehiculo.getMaterialContruccion());
        System.out.println(MyVehiculo.getCantidadPasajeros());
        System.out.println(MyVehiculo.getCapacidadCarga());
        
        MyVehiculo.Acelerar();
        MyVehiculo.GiroDerecha();
        MyVehiculo.GiroIzquierda();
        
        System.out.println("Vehiculo Acuatico");
        
        Acuatico MyVehiculoAcuatico = 
                new Acuatico("Punta",9.3,"ZX1","BootRsf",9.4,"Fibra de vidrio",9,49.4);
        
        MyVehiculoAcuatico.setForma("Redonda");
        MyVehiculoAcuatico.setAncho(4.3);
        MyVehiculoAcuatico.setModelo("DXO");
        MyVehiculoAcuatico.setFabricante("SpeedBoot");
        MyVehiculoAcuatico.setLargo(8.3);
        MyVehiculoAcuatico.setMaterialContruccion(" Fibra de carbono");
        MyVehiculoAcuatico.setCantidadPasajeros(3);
        MyVehiculoAcuatico.setCapacidadCarga(400.3);
        
        System.out.println(MyVehiculoAcuatico.getForma());
        System.out.println(MyVehiculoAcuatico.getAncho());
        System.out.println(MyVehiculoAcuatico.getModelo());
        System.out.println(MyVehiculoAcuatico.getFabricante());
        System.out.println(MyVehiculoAcuatico.getLargo());
        System.out.println(MyVehiculoAcuatico.getMaterialContruccion());
        System.out.println(MyVehiculoAcuatico.getCantidadPasajeros());
        System.out.println(MyVehiculoAcuatico.getCapacidadCarga());
        
        MyVehiculoAcuatico.Navegar();
        
        System.out.println("");
        System.out.println("Canoa");
        Canoa MyVehiculoCanoa = 
                new Canoa(4,"Punta",9.3,"ZX1","BootRsf",9.4,"Fibra de vidrio",9,49.4);
        MyVehiculoCanoa.Rotar();
        
        System.out.println("");
        System.out.println("Porta Aviones");
        PortaAviones MyVehiculoPortaAviones = 
                new PortaAviones("4 Cilindros",100,"Punta",50.0,"USS Boot","US",150.0,"Acero",1000,4000000.9);
        MyVehiculoPortaAviones.Disparar();
        
        System.out.println("");
        System.out.println("Vehiculo Terrestre");
        Terrestre MyVehiculoTerrestre = new Terrestre(4,"Deportiva","Z400","Honda",2.0,"Plastico y Acero",2,200.9);
        MyVehiculoTerrestre.setCategoria("Eco");
        MyVehiculoTerrestre.Frenar();
        MyVehiculoTerrestre.Rebersa();
        
        System.out.println("");
        System.out.println("Moto");
        Moto MyVehiculoMoto = new Moto(250,"Recto",4,"Deportiva","Z400","Honda",2.0,"Plastico y Acero",2,200.9);
        MyVehiculoMoto.setCilindrada(500);
        MyVehiculoMoto.Acelerar();
        MyVehiculoMoto.Arancar();
        MyVehiculoMoto.GiroDerecha();
        MyVehiculoMoto.GiroIzquierda();
        
        System.out.println("");
        System.out.println("Camion");
        Camion MyVehiculoCamion = new Camion(6,1000.0,4,"Carga","ToroZ","Toyota",20.0,"Acero",5,1000.9);
        MyVehiculoCamion.setCapacidadMaxima(3000);
        MyVehiculoCamion.Remolcar();
        MyVehiculoCamion.Acelerar();
        MyVehiculoCamion.Frenar();
        MyVehiculoCamion.GiroDerecha();
        MyVehiculoCamion.GiroIzquierda();
        MyVehiculoCamion.Rebersa();
        
        System.out.println("");
        System.out.println("Vehiculo Aereo");
        Aereo MyVehiculoAereo = new Aereo(4,"Sesna","Tokio",20.0,"Alimunio",5,500.9);
        MyVehiculoAereo.setCantidadMotores(2);
        MyVehiculoAereo.Bajar();
        MyVehiculoAereo.Subir();
        
        System.out.println("");
        System.out.println("Avion");
        Avion MyVehiculoAvion = new Avion(12.0,"Retractil",4,"Flanyet","Toyota",20.0,"Alimunio",5,600.9);
        MyVehiculoAvion.setTipoTrenAterrizaje("fijo");
        MyVehiculoAvion.Planear();
        
        System.out.println("");
        System.out.println("Helicoptero");
        Helicoptero MyVehiculoHelicoptero = new Helicoptero("Larga",5,1,"WW2","Robocop",10.0,"Alimunio",5,700.9);
        MyVehiculoHelicoptero.setCantidadAspas(7);
        MyVehiculoHelicoptero.Despegar();
    
    
    }   
}
