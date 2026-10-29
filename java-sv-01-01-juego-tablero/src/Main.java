
import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/>
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int filaYoda = 0;
        int columnaYoda = 0;
        char YODA = 'Y';

        // 1º) Yago
        char[][] matriz = new char[10][10];

        // 2º) Sergio
        int vidas = 10;

        // 3) Dani
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna] = '*';
            }
        }

        matriz[filaYoda][columnaYoda] = YODA;

        // 4º) Carlos y Héctor
        // Alejandro

        char CASILLA_FINAL = 'F';
        matriz[9][9] = CASILLA_FINAL;

        // Marcos y Luis
        Random aleatorios = new Random();

        int filaRandom = aleatorios.nextInt(10);
        int columnaRandom = aleatorios.nextInt(10);

        // Evitar colocar la M encima de Yoda o de la F
        while (matriz[filaRandom][columnaRandom] != '*') {
            filaRandom = aleatorios.nextInt(10);
            columnaRandom = aleatorios.nextInt(10);
        }

        matriz[filaRandom][columnaRandom] = 'M';

        // Alex
        int filaAleatoria2;
        int columnaAleatoria2;

        // Boris e Ikerr: se insertan 5 P
        for (int i = 0; i < 5; i++) {
            do {
                filaAleatoria2 = aleatorios.nextInt(10);
                columnaAleatoria2 = aleatorios.nextInt(10);
            } while (matriz[filaAleatoria2][columnaAleatoria2] != '*');

            matriz[filaAleatoria2][columnaAleatoria2] = 'P';
        }

        System.out.println();
        System.out.println();

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }

        // Pablo
        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("y te puedes desplazar con las letras W A S D");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Dime una letra: ");
            char desplazamiento = Character.toUpperCase(sc.next().charAt(0));

            // Yoel
            // Desplazamiento de YODA

            // Guardamos la posición actual
            int nuevaFila = filaYoda;
            int nuevaColumna = columnaYoda;

            // Calculamos la nueva posición
            if (desplazamiento == 'D') {
                nuevaColumna++;
                System.out.println("Yoda se desplaza hacia la derecha");

            } else if (desplazamiento == 'S') {
                nuevaFila++;
                System.out.println("Yoda se desplaza hacia abajo");

            } else if (desplazamiento == 'W') {
                nuevaFila--;
                System.out.println("Yoda se desplaza hacia arriba");

            } else if (desplazamiento == 'A') {
                nuevaColumna--;
                System.out.println("Yoda se desplaza hacia la izquierda");

            } else {
                System.out.println("Letra no válida. Usa W, A, S o D.");
                continue;
            }

            // Comprobar que Yoda no se salga del tablero
            if (nuevaFila < 0 || nuevaFila >= 10 ||
                    nuevaColumna < 0 || nuevaColumna >= 10) {

                System.out.println("¡Cuidado! No te salgas del tablero.");

            } else {

                // Borrar el Yoda anterior
                matriz[filaYoda][columnaYoda] = '*';

                // Actualizar la posición de Yoda
                filaYoda = nuevaFila;
                columnaYoda = nuevaColumna;

                // Colocar a Yoda en su nueva posición
                matriz[filaYoda][columnaYoda] = YODA;
            }

            // Mostrar el tablero actualizado
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    System.out.print(matriz[fila][columna] + " ");
                }
                System.out.println();
            }

            System.out.println("A Yoda le quedan " + vidas);

        } while (vidas != 0);

        sc.close();
    }
}
