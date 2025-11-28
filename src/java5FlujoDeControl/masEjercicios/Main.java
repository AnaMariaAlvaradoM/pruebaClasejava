package java5FlujoDeControl.masEjercicios;


public class Main {
    public static void main(String[] args) {
        //? Solo if
        ifElse.soloIf();
        //? Solo if con parámetro
        //ifElse.soloIf(50)
        //? Solo if con scanner
        //  System.out.println("Ingrese la edad: ");
        // Scanner scanner = new Scanner(System.in);
        //  int edad = (scanner.nextInt());
        // IfElse.soloIf(edad)

        //? if con else
        ifElse.ifConElse(40);

        //? anidados
        ifElse.NotaAnidados(50);

        //? Ya el scanner está en el método, entonces
        //? Solo lo llamo
        ifElse.ifAnidados();

        ifElse.ParImpar();
        ifElse.apuestas();
        ifElse.apuestasOtraOpcion();


        //** Switch
        Switch.calificaciones();
        Switch.diasSemana();
        Switch.peliculas();




    }
}
