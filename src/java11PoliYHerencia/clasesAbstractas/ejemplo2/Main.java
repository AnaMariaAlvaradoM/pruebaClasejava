package java11PoliYHerencia.clasesAbstractas.ejemplo2;

public class Main {
    public static void main(String[] args) {
        TrabajadorRestaurante chef = new Chef();
        TrabajadorRestaurante mesero = new Mesero();

        chef.marcarEntrada();
        chef.realizarSuTrabajo();
        mesero.marcarEntrada();
        mesero.realizarSuTrabajo();
    }
}
