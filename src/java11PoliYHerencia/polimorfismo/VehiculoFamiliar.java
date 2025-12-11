package java11PoliYHerencia.polimorfismo;

public class VehiculoFamiliar extends Vehiculo{
    private int cantidadPuestos;

    public VehiculoFamiliar(String marca, int modelo, String placa, int cantidadPuestos) {
        super(marca, modelo, placa);
        this.cantidadPuestos = cantidadPuestos;
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo familiar está arrancando");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", linea: " + placa + ", Modelo: " + modelo + ", CanPues: " + cantidadPuestos);
    }
}
