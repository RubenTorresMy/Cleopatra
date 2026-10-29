import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //crear matriz
        char tablero[][] = new char[10][10];
        //variables
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int columnaAleatoria2;
        int filaAleatoria2;
        int vidas = 10;
        boolean juegoTerminado = false;
        int filaRobot = 0;
        int columnaRobot = 0;






        //rellenar la matriz con *
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '*';
            }
        }
        //crear personaje en posicion 0,0
        char ROBOT = 'R';
        tablero[0][0] = ROBOT;
        //crear meta en posicion 9,9
        char META = 'F';
        tablero[9][9] = META;


        //5 X aleatoriamente sin repetir posicion
        for (int i = 0; i < 5; i++) {
            int filaAleatoria;
            int columnaAleatoria;
            do {
                filaAleatoria = random.nextInt(10);
                columnaAleatoria = random.nextInt(10);
            } while (tablero[filaAleatoria][columnaAleatoria] != '*');
            tablero[filaAleatoria][columnaAleatoria] = 'X';
        }


        //colocar una bateria en una posicion aleatoria
        do {
            filaAleatoria2 = random.nextInt(10);
            columnaAleatoria2 = random.nextInt(10);
        } while (tablero[filaAleatoria2][columnaAleatoria2] != '*');
        tablero[filaAleatoria2][columnaAleatoria2] = 'B';


        //colocar 20 K en posiciones aleatorias
        for (int i = 0; i < 20; i++) {
            int filaAleatoria;
            int columnaAleatoria;
            do {
                filaAleatoria = random.nextInt(10);
                columnaAleatoria = random.nextInt(10);
            } while (tablero[filaAleatoria][columnaAleatoria] != '*');
            tablero[filaAleatoria][columnaAleatoria] = 'K';
        }


        //mostrar tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }


        do {
            //Mover el robot
            System.out.println("Mueve el robot con las teclas W/A/S/D");
            char movimiento = scanner.next().charAt(0);


            int nuevaFila = filaRobot;
            int columnaNueva = columnaRobot;


            //SECUENCIA DE MOVIMIENTO
            //D
            if (movimiento == 'D') {
                columnaNueva++;
            }
            if (columnaNueva >= 10) {
                System.out.println("Movimiento fuera del tablero");
            }
            //Obstaculo
            if (columnaNueva < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'X') {
                    System.out.println("Movimiento bloqueado");
                }
            }
            //Kill
            if (columnaNueva >= 0 && columnaNueva < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'K') {
                    System.out.println("Has perdido una vida!!");
                    vidas --;
                    System.out.println("Vidas restantes: " + vidas);
                }
            }
            //Movimiento del robot
            if (columnaNueva < 10) {
                if (tablero[nuevaFila][columnaNueva] == '*') {
                    tablero[filaRobot][columnaRobot] = '*';
                    filaRobot = nuevaFila;
                    columnaRobot = columnaNueva;


                    tablero[nuevaFila][columnaNueva] = 'R';
                }
            }
            //Ahora hacerlo con todas las teclas


            //S
            if (movimiento == 'S') {
                nuevaFila++;
            }
            if (nuevaFila >= 10) {
                System.out.println("Movimiento fuera del tablero");
            }
            //Obstaculo
            if (nuevaFila < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'X') {
                    System.out.println("Movimiento bloqueado");
                }
            }
            //Kill
            if (nuevaFila >= 0 && nuevaFila < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'K') {
                    System.out.println("Has perdido una vida!!");
                    vidas --;
                    System.out.println("Vidas restantes: " + vidas);
                }
            }
            //Movimiento del robot
            if (nuevaFila < 10) {
                if (tablero[nuevaFila][columnaNueva] == '*') {
                    tablero[filaRobot][columnaRobot] = '*';
                    filaRobot = nuevaFila;
                    columnaRobot = columnaNueva;


                    tablero[nuevaFila][columnaNueva] = 'R';
                }
            }
            //A
            if (movimiento == 'A') {
                columnaNueva--;
            }
            if (columnaNueva < 0) {
                System.out.println("Movimiento fuera del tablero");
            }
            //Obstaculo
            if (columnaNueva >= 0 && columnaNueva < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'X') {
                    System.out.println("Movimiento bloqueado");
                }
            }
            //Kill
            if (columnaNueva >= 0 && columnaNueva < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'K') {
                    System.out.println("Has perdido una vida!!");
                    vidas --;
                    System.out.println("Vidas restantes: " + vidas);
                }
            }
            //Movimiento del robot
            if (columnaNueva >= 0 && columnaNueva < 10) {
                if (tablero[nuevaFila][columnaNueva] == '*') {
                    tablero[filaRobot][columnaRobot] = '*';
                    filaRobot = nuevaFila;
                    columnaRobot = columnaNueva;


                    tablero[nuevaFila][columnaNueva] = 'R';
                }
            }


            //W
            if (movimiento == 'W') {
                nuevaFila--;
            }
            if (nuevaFila < 0) {
                System.out.println("Movimiento fuera del tablero");
            }
            //Obstaculo
            if (nuevaFila >= 0 && nuevaFila < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'X') {
                    System.out.println("Movimiento bloqueado");
                }
            }
            //Kill
            if (nuevaFila >= 0 && nuevaFila < 10) {
                if (tablero[nuevaFila][columnaNueva] == 'K') {
                    System.out.println("Has perdido una vida!!");
                    vidas --;
                    System.out.println("Vidas restantes: " + vidas);
                }
            }
            //Movimiento del robot
            if (nuevaFila >= 0 && nuevaFila < 10) {
                if (tablero[nuevaFila][columnaNueva] == '*') {
                    tablero[filaRobot][columnaRobot] = '*';
                    filaRobot = nuevaFila;
                    columnaRobot = columnaNueva;


                    tablero[nuevaFila][columnaNueva] = 'R';
                }
            }




            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }while(vidas != 0);
    }
}



