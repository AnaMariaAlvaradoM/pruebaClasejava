package java11PoliYHerencia.polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    private int hP;

    public VehiculoDeportivo(String marca, int modelo, String placa, int hP) {
        super(marca, modelo, placa);
        this.hP = hP;
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo deportivo está arrancando");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", linea: " + placa + ", Modelo: " + modelo + ", Hp: " + hP);
    }
}
