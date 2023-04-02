import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner orderDog = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del perro al que busca?");
        String client = orderDog.next();


        Canine perro1 = new Canine("Canine","Omnivore","Lolo", "Dalmata");
        Canine perro2 = new Canine("Canine","Omnivore","Pepe", "Pastor Aleman");



        System.out.println("Excelente, " + client + " será entregado en 5 minutos");

    }
}
