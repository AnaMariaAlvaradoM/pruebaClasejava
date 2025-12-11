package java11PoliYHerencia.herencia;

public class Carro extends Vehiculo{
    private int numPuertas;

    public Carro(){

    }
    public Carro(String marca, int modelo, String placa, int numPuertas) {
        super(marca, modelo, placa);
        this.numPuertas = numPuertas;
    }

    public void abrirCapo(){
        System.out.println("Abriendo el capó del carro : " + marca + " " + placa);
    }
    public void abrirCapo(int nuLlantas){
        System.out.println("Abriendo el capó del carro : " + marca + " " + placa);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de puestar: " + numPuertas);
    }

}
