package java11PoliYHerencia.interfaces.ejemplo1;

public class Carro implements Vehiculo, Vendedor, ReapacionChasis{
    @Override
    public void acelarar(int velocidad) {
        System.out.println("El carro acelerá a : " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println("El carro está frendando");
    }

    @Override
    public void vender() {
        System.out.println("El carro ha sido vendido");
    }

    @Override
    public void reparaicon() {
        System.out.println("Se está reparando");
    }
}
