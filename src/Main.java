// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 import java.util.Scanner;

public class Main {
    public static void Ejercicio1(){

        System.out.println("byte byte1;");
        System.out.println("short short1;");
        System.out.println( "int int1;");
        System.out.println("long long1;");
        System.out.println("float float1;");
        System.out.println("double double1;");
        System.out.println("boolean boolean1;");
        System.out.println("String nombre;");
        System.out.println("boolean bandera;");
        System.out.println("char char1;");


    }
    public static void Ejercicio2(){
        System.out.println("byte byte1 = 127;");
        System.out.println("short short1 = -32768;");
        System.out.println( "int int1 = 34;");
        System.out.println("long long1 = 922337223;");
        System.out.println("float float1 = 3123123;");
        System.out.println("double double1 = 1231231231;");
        System.out.println("boolean boolean1 = true;");
        System.out.println("String nombre = \"David\";");
        System.out.println("boolean bandera = '\\u0061';");
        System.out.println("char char1;");
    }
    public static void Ejercicio3(){
        int num = 10;
        System.out.println("La variable de entorno es: " + num);
    }
    public static void Ejercicio4(){
        String name = "David";
        int Edad = 24;
        System.out.println(name);
        System.out.println(Edad);
    }
    public static void Ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita tu nombre");
        String name = scanner.nextLine();
        System.out.println("Digita tu numero");
        String numero = scanner.nextLine();
        System.out.println("Tu nombre es: " + name + " Tu numero es: " + numero );
    }
    public static void Ejercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita tu num1");
        int num1 = scanner.nextInt();
        System.out.println("Digita tu num2");
        int num2 = scanner.nextInt();
        if(num1 > 25 && num2 > 25){
            System.out.println("Ambos son mayores a 25");

        }
        else if(num1 > 25){
            System.out.println("El numero 1 es mayor a 25");
        }else if(num2 > 25){
            System.out.println("El numero 2 es mayor a 25");
        }else {
            System.out.println("Ambos son inferiores");
        }
    }
    public static void Ejercicio7(){
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
                System.out.println("No existe un valor valido para tipo de bomba");
        }
    }
    public static void Ejercicio8(){
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while ( nota<0 || nota > 10){
            System.out.println("Error el numero tiene que estar por encima de 0 y por debajo 10");
            nota = scanner.nextInt();
        }
        System.out.println(nota);
    }
    public static void Ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("Digita un numero");
            int numero = scanner.nextInt();
            if(numero == 0){
                break;
            }
            i++;
        }while(i <= 19);

    }
    public static void Ejercicio10(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("\nDigita un numero");
            int num = scanner.nextInt();
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
        }

    }
    public static void Ejercicio11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una frase");
        String frase = scanner.nextLine();
        int longitud = frase.length() ;
        String resultado = "";
        String prueba = " ";
        char aux ;

        for (int i = 0; i < longitud ; i++) {
             aux = frase.charAt(i);

                 switch (aux) {
                     case 'a':
                         resultado += "@";
                         break;
                     case 'e':
                         resultado += "#";
                         break;
                     case 'i':
                         resultado += "$";
                         break;
                     case 'o':
                         resultado += "%";
                         break;
                     case 'u':
                         resultado += "*";
                         break;
                     default:
                         resultado += aux;
             }
        }
        System.out.println(resultado);
    }
    public static void Ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Digita el segundo numero");
        int num2 = scanner.nextInt();
        if(num1 % num2 == 0){
            System.out.println("Es multiplo");
        }else {
            System.out.println("No es multiplo");
        }
    }
    public static void Ejercicio13(){
        String[] vector = new String[7];
    }
    public static void Ejercicio14(){
        Scanner scanner = new Scanner(System.in);
        String[] vector = new String[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Digita el nombre de todos tus compañeros");
            String nombre = scanner.nextLine();
            vector[i] = nombre;
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("["+vector[i]+"]");
        }

    }
    public static void main(String[] args) {
        System.out.println("Hay 14 pruebas cual quieres ejecutar, Digita numero entre 1 y 14");
        System.out.println("Existen algunos Ejercicio basicos asi que solo te mostrara la ejecucion");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                Ejercicio1();
            break;
            case 2:
                Ejercicio2();
            break;
            case 3:
                Ejercicio3();
            break;
            case 4:
                Ejercicio4();
            break;
            case 5:
                Ejercicio5();
            break;
            case 6:
                Ejercicio6();
            break;
            case 7:
                Ejercicio7();
            break;
            case 8:
                Ejercicio8();
            break;
            case 9:
                Ejercicio9();
            break;
            case 10:
                Ejercicio10();
            break;
            case 11:
                Ejercicio11();
            break;
            case 12:
                Ejercicio12();
            break;
            case 13:
                Ejercicio13();
            break;
            case 14:
                Ejercicio14();
            break;
            default:
                System.out.println("Error digita un numero valido");
        }


    }

}