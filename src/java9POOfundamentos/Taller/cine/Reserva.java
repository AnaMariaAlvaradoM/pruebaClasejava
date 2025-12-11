package java9POOfundamentos.Taller.cine;

public class Reserva {
    Pelicula pelicula;
    Sala sala;
    String cliente;

    public Reserva(Pelicula pelicula, Sala sala, String cliente) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
    }

    void realizarReserva() {
        System.out.println("\nProcesando reserva para: " + cliente);
        pelicula.venderEntrada();
        sala.ocuparAsiento();
        System.out.println("Reserva realizada para " + cliente);
    }

    void mostrarDetalle() {
        System.out.println("----- DETALLE DE RESERVA -----");
        System.out.println("Cliente: " + cliente);
        System.out.println("Película: " + pelicula.titulo);
        System.out.println("Sala: " + sala.id);
        System.out.println("-------------------------------");
    }
}
