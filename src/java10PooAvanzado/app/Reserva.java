package java10PooAvanzado.app;

public class Reserva {
    private int pasajeros;

    public Reserva() {
    }

    public Reserva(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        if (pasajeros <= 0){
            throw new IllegalArgumentException("Mínimo un pasajero");
        }
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "pasajeros=" + pasajeros +
                '}';
    }
}
