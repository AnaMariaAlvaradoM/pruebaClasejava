package java9POOfundamentos;

public class Libro {
    String titulo;
    String autor;
    boolean leido;

    public Libro() {
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.leido = false;
    }

    void mostrarInfo(){
        System.out.println(titulo + " de " + autor + " leído: " + leido);
    }

    void marcarComoLeido(){
        leido = true;
    }









}
