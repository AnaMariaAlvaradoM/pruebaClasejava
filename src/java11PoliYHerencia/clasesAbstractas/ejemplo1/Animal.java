package java11PoliYHerencia.clasesAbstractas.ejemplo1;

abstract class Animal {
    //! Método abstracto
    public abstract void hacerSonido();
    //! Método concreto
    public void domir(){
        System.out.println("Estoy durmiendo");
    }

}
