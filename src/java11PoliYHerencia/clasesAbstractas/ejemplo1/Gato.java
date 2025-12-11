package java11PoliYHerencia.clasesAbstractas.ejemplo1;

public class Gato extends Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void domir() {
        super.domir();
    }
}
