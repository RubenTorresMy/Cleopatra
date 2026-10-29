import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Valor1: " + i);
            }
        }
        System.out.println();

        for (int i = 5; i <= 25 ; i += 5) {
            System.out.println("Valor2: " + i);
        }

        System.out.println();

        int numero = -1;
        Scanner teclado = new Scanner(System.in);

       /*  while ( numero != 0) {
            System.out.println("Dime un número:");
            numero = teclado.nextInt();
            System.out.println("Tu número es " + numero);
            System.out.println();
        }



        int numero1 = 1;

        while (numero1 <= 5) {
            System.out.println(numero1);
            numero++;
        }

        */

        int suma = 0;
        for (int i = 1; i <= 5 ; i++) {
            suma = suma + i;
        }
        System.out.println(suma);

        System.out.println();


        int[] notas = {7,5,9,4,8};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println();

        int[] notas1 = {7,4,8,3,6};
        int aprobados = 0;
        int suma1 = 0;
        for (int i = 0; i < notas.length; i++) {
            suma1 += notas1[i];
            if (notas1[i] >= 5) { aprobados++; }
        }

        System.out.println();

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println();

        int[] pares = new int[10];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2;
        }

        System.out.println();

        char[] letras = {'S','O','L','O','X'};
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        





    }
}
