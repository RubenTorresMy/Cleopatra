import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       /* System.out.println("Introduce un número:");

        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Tu número es negativo");
        } else if (numero > 0) {
            System.out.println("Tu numero es positivo");
        } else {
            System.out.println("Tu numero es 0");
        }


       Scanner scanner = new Scanner(System.in);

       int positivos = 0;
       int negativos = 0;
       int ceros = 0;
       int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número: ");
            int numero = scanner.nextInt();
            suma = suma + numero;

            if (numero > 0){
                positivos++;
            }else if (numero < 0){
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Suma: " + suma);



        Scanner scanner = new Scanner(System.in);
        int[]array = new int[8];
        //contadores
        int suma = 0;
        int pares = 0;
        int impares = 0;

        //Introducir los numeros
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) +": ");
            array[i] = scanner.nextInt();
        }

        //recorrer el array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            suma = suma + array[i];

            if (array[i] % 2 == 0){
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println();

        System.out.println("Suma: " + suma);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);


        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];

        int suma = 0;
        int mayores25 = 0;
        int menores10 = 0;

        //pedir datos
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Escribe la temperatura del dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i] + " ");
            suma += temperaturas[i];

            if (temperaturas[i] > 25){
                mayores25 ++;
            }else if (temperaturas[i] <= 10){
                menores10 ++;
            }
        }

        //calculo la media
        double media = suma / temperaturas.length;

        System.out.println();

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Dias con más de 25 grados: " + mayores25);
        System.out.println("Dias con 10 grados o menos: " + menores10);





        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[5][5];

        //rellenar con '*'
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '*';
            }
        }

        //colocar objetos
        int contObjetos = 0;

        while (contObjetos < 5) {
            System.out.println("\nIntroduce la posición del objeto:");
            System.out.println("Fila (0-4): ");
            int fila = scanner.nextInt();

            System.out.println("Columna (0-4): ");
            int columna = scanner.nextInt();

            //Esta dentro del tablero?

            if (fila >= 0 && fila < 5 &&
                    columna >= 0 && columna < 5) {
                tablero[fila][columna] = 'O';
                contObjetos++;

                System.out.println("Objeto colocoado correctamente");
            }else {
                System.out.println("Esa posición es incorrecta");
            }
        }

        //mostrar tablero
        System.out.println("\n--- TABLERO ---");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }



        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 5;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }



        char[][] matriz = new char[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '*';

            }
        }



        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }






        char[][] matriz = new char[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '*';
            }
        }
        Random random = new Random();

        int filaMosca = random.nextInt(5);
        int columnaMosca = random.nextInt(5);

        matriz[filaMosca][columnaMosca] = 'M';

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }




        Scanner scanner = new Scanner(System.in);

        double numero = 0;
        System.out.println("Introduce un numero: ");
        numero = scanner.nextDouble();

        System.out.println("la mitad de tu numero es: " + numero/218);

        */
        



    }
}
