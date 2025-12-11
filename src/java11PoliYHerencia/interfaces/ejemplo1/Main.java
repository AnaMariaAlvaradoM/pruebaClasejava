package java11PoliYHerencia.interfaces.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Carro();
        carro.acelarar(60);
        carro.frenar();

        ReapacionChasis carro1 = new Carro();
        carro1.reparaicon();

        Carro carro2 = new Carro();
        carro2.frenar();

    }
}
