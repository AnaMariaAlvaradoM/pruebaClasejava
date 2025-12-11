package java11PoliYHerencia.polimorfismo;

public class Vehiculo {
    protected String marca;
    protected int modelo;
    protected String placa;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public void arrancar(){
        System.out.println("El vehiculo, está arrancando");
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca + ", linea: " + placa +  ", Modelo: " + modelo );
    }
}
