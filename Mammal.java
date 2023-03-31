import java.util.Scanner;
public abstract class Mammal {  //Nombre de la clase Padre

    //Atributos de la clase Padre
    public String species;
    public String feeding;
    public String name;
    public String breed;


    //Constructor clase Padre
  //  public Mammal(String NewName){
   // }
    //Metodo de la clase Padre
    public static void main(String[] args) {

        Scanner orderDog = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre del perro al que busca?");
        String client = orderDog.next();

        //Funcionaria como una base de datos, quisiera ponerle un if de que si no se encuentra le aparezca otro cartel
        
    Canine Perro1 = new Canine("Canine","Omnivore","Lolo");
    Canine Perro2 = new Canine("Canine","Omnivore","Pepe");



    System.out.println("Excelente, " + client + " será entregado en 5 minutos");

            }
        }
