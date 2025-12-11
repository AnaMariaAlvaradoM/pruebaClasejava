package java6Bucles;

public class For {
    //! Sintaxis
    //! for (inicialización, condición, actualización){
    //!     Codigo
    //!}

    //! formas de incrementar
//        i = i + 1;
//        i += 1
//        i++


    public static void comparacionWhileFor(){
        for(int i=0; i < 10; i++){
            System.out.println(i);
        }
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
    }

    public static void ejercicio1For(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Num: " + i);
        }
    }

    public  static void ejercicio2For(){
        for(int i= 10; i >= 1 ; i-- ){
            System.out.println("Numero: " + i);
        }
    }
    public  static void ejercicio3For(){
        for(int i = 0; i < 10 ; i++ ){
            System.out.println("Numero: " + i);
        }
    }




}
