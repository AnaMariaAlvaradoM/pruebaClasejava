package java10PooAvanzado.app;

public class Main {
    public static void main(String[] args) {
        Reserva reserva1 = new Reserva();
        try{
            reserva1.setPasajeros(0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Si ven, si sigue funcionando");

        Reserva reserva2 = new Reserva();
        reserva2.setPasajeros(2);
        System.out.println(reserva2.getPasajeros());









//        try{
//            int num = 10 / 0;
//        } catch (ArithmeticException e){
//            System.out.println("Error: No se puede dividir entre 0");
//        }
//        System.out.println("Si esto sale, es  porque la app sigue funciando aún habiendo generado la excepcion");

    }
}
