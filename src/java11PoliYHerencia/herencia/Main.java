package java11PoliYHerencia.herencia;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Kia", 2025, "abd123",4);

        carro1.mostrarInfo();
        carro1.arrancar();
        carro1.abrirCapo(4);
    }
}
