// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero entre 1 y 4");
      int name = scanner.nextInt();
      switch (name){
          case 1:
              System.out.println("La bomba es una bomba de agua");
              break;
          case 2:
              System.out.println("La bomba es una bomba de gasolina");
              break;
          case 3:
              System.out.println("La bomba es una bomba de hormigon");
              break;
          case 4:
              System.out.println("La bomba es una bomba de pasta alimenticia");
              break;
          default:
              System.out.println("La bomba es una bomba de pasta alimenticia");
      }

    }
}