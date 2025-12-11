package java10PooAvanzado.ejemploEestudiantes;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int codigoEstudiante;

    public Estudiante() {
    }

    public Estudiante(int codigoEstudiante, String apellido, String nombre) {
        this.codigoEstudiante = codigoEstudiante;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        if(codigoEstudiante < 0){
            //System.out.println("Valor incorrecto");
            throw new IllegalArgumentException("El codigo no debe ser menor a cero");
        }
        this.codigoEstudiante = codigoEstudiante;
    }

    public void decirNombre(){
        System.out.println("Mi nombre es: " + nombre);
    }
}
