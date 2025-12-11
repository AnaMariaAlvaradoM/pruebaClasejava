package java9POOfundamentos.Taller.cine;

public class Main {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("nombrePelicula", "Ciencia Ficción", 169, 3);
        Sala s1 = new Sala("A1", "IMAX", 100, 95);

        Reserva r1 = new Reserva(p1, s1, "Pepito Mendieta");
        Reserva r2 = new Reserva(p1, s1, "Pepita mendieta");

        r1.realizarReserva();
        r2.realizarReserva();

        System.out.println();
        p1.mostrarFicha();
        s1.mostrarEstado();
    }
}
