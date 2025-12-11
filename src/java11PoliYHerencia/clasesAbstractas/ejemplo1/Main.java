package java11PoliYHerencia.clasesAbstractas.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        // ❌ Animal loro = new Animal();
        perro.domir();
        perro.hacerSonido();
        gato.domir();
        gato.hacerSonido();
    }
}
