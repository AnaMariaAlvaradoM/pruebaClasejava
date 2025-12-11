package java9POOfundamentos.Taller.cine;

public class Pelicula {
    String titulo;
    String genero;
    int duracionMin;
    int disponibles;

    public Pelicula(String titulo, String genero, int duracionMin, int disponibles) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMin = duracionMin;
        this.disponibles = disponibles;
    }

    void venderEntrada() {
        if (disponibles > 0) {
            disponibles--;
            System.out.println("Entrada vendida para: " + titulo);
        } else {
            System.out.println("No hay entradas disponibles para: " + titulo);
        }
    }

    void mostrarFicha() {
        System.out.println("----- FICHA DE LA PELÍCULA -----");
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracionMin + " min");
        System.out.println("Entradas disponibles: " + disponibles);
    }
}
