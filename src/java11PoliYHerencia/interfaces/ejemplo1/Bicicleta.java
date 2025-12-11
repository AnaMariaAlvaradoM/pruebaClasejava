package java11PoliYHerencia.interfaces.ejemplo1;

public class Bicicleta implements Vehiculo{
    @Override
    public void acelarar(int velocidad) {
        System.out.println("la bici acelerá a : " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println("la bici está frendando");
    }

}
