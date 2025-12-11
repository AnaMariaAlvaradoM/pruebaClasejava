package java9POOfundamentos.Taller.cine;

public class Sala {
    String id;
    String tipo;
    int capacidad;
    int ocupados;

    public Sala(String id, String tipo, int capacidad, int ocupados) {
        this.id = id;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ocupados = ocupados;
    }

    void ocuparAsiento() {
        if (ocupados < capacidad) {
            ocupados++;
            System.out.println("Asiento ocupado en la sala " + id);
        } else {
            System.out.println("La sala está llena.");
        }
    }

    void mostrarEstado() {
        System.out.println("----- ESTADO DE LA SALA -----");
        System.out.println("Sala: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Ocupados: " + ocupados);
    }
}
