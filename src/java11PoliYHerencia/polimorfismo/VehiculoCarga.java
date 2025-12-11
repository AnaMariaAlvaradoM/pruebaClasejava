package java11PoliYHerencia.polimorfismo;

public class VehiculoCarga extends Vehiculo{
    private int carga;

    public VehiculoCarga(String marca, int modelo, String placa, int carga) {
        super(marca, modelo, placa);
        this.carga = carga;
    }
    @Override
    public void arrancar(){
        System.out.println("El vehiculo de carga está arrancando");
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + ", linea: " + placa +  ", Modelo: " + modelo + ", Carga: " + carga);
    }
}
