package java11PoliYHerencia.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Vehiculo miCarro1 = new Vehiculo("Chevrolet", 2005, "dss213");
        Vehiculo miCarro2 = new VehiculoCarga("Kia", 2005, "dss213", 50);
        Vehiculo miCarro3 = new VehiculoDeportivo("Mercedez", 2005, "dss213", 50);
        Vehiculo miCarro4 = new VehiculoFamiliar("Jeep", 2005, "dss213", 50);

        miCarro1.arrancar();
        miCarro2.arrancar();
        miCarro3.arrancar();
        miCarro4.arrancar();

        miCarro1.mostrarInfo();
        miCarro2.mostrarInfo();
        miCarro3.mostrarInfo();
        miCarro4.mostrarInfo();
    }
}
