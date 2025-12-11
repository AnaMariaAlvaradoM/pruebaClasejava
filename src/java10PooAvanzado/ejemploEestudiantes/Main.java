package java10PooAvanzado.ejemploEestudiantes;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(1234, "Munevar", "Nico");

        //estudiante2.nombre;

        //System.out.println(estudiante2.nombre);
        System.out.println("El nombre del estudiante es: "+ estudiante2.getNombre());
        System.out.println("El apellido del estudiante es: "+ estudiante2.getApellido());
        System.out.println("El codigo del estudiante es: "+ estudiante2.getCodigoEstudiante());
        String nombre2 = estudiante2.getNombre();
        System.out.println("El nombre del estudiante es: "+ nombre2);

        //System.out.println(estudiante1.nombre);
        System.out.println("El nombre del estudiante es: "+ estudiante1.getNombre());

        estudiante1.setNombre("Diana");
        estudiante1.setApellido("Moya");
        estudiante1.setCodigoEstudiante(56785);

        System.out.println("El nombre del estudiante es: "+ estudiante1.getNombre());
        System.out.println("El apellido del estudiante es: "+ estudiante1.getApellido());
        System.out.println("El codigo del estudiante es: "+ estudiante1.getCodigoEstudiante());

        estudiante2.setCodigoEstudiante(-7777);
        System.out.println("El codigo del estudiante es: "+ estudiante2.getCodigoEstudiante());
        System.out.println("El codigo del estudiante es: "+ estudiante2.getCodigoEstudiante());


    }
}
