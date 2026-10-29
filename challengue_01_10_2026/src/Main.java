//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creo la matriz
        char matriz[][] = new char[10][10];

        //relleno la matriz con '.'
        for (int f = 1; f < 10; f++) {
            for (int c = 1; c < 10; c++) {
                matriz[f][c] = '.';
            }
        }


        int filaAleatoria;
        int columnaAleatoria;

        //Relleno el tablero con un Darth Vader aleatorio

        do {
            filaAleatoria = (int) (Math.random() * 10);
            columnaAleatoria = (int) (Math.random() * 10);
        } while (matriz[filaAleatoria][columnaAleatoria] != '.');
        matriz[filaAleatoria][columnaAleatoria] = 'D';


        //Relleno el tablero con un Yoda aleatorio
        do {
            filaAleatoria = (int) (Math.random() * 10);
            columnaAleatoria = (int) (Math.random() * 10);
        } while (matriz[filaAleatoria][columnaAleatoria] != '.');
        matriz[filaAleatoria][columnaAleatoria] = 'Y';


        //Relleno el tablero con 5 muros aleatorios
        for (int Muros = 1; Muros <= 5; Muros++) {
            do {
                filaAleatoria = (int) (Math.random() * 10);
                columnaAleatoria = (int) (Math.random() * 10);
            } while (matriz[filaAleatoria][columnaAleatoria] != '.');
            matriz[filaAleatoria][columnaAleatoria] = 'M';
        }


        //imprimo la matriz
        for (int f = 1; f < 10; f++) {
            for (int c = 1; c < 10; c++) {
                System.out.print(matriz[f][c]);
            }
            System.out.println(" ");
        }


        //contar personajes

        int contVader = 0;
        int contYodas = 0;
        int contMuros = 0;
        int contPosicionesLibres = 0;

        for (
                int f = 0;
                f < 10; f++) {
            for (int c = 0; c < 10; c++) {


                if (matriz[f][c] == 'D') {
                    contVader++;
                }

                if (matriz[f][c] == 'Y') {
                    contYodas++;
                }

                if (matriz[f][c] == 'M') {
                    contMuros++;
                }

                if (matriz[f][c] == '.') {
                    contPosicionesLibres++;
                }

            }
        }

        //Imprimimos por pantalla los personajes encontrados

        System.out.println("Total de Darth Vader encontrados: " + contVader);

        System.out.println("Total de Yodas encontrados: " + contYodas);

        System.out.println("Total de Muros encontrados: " + contMuros);

        System.out.println("Total de posiciones libres encontradas: " + contPosicionesLibres);

    }
}





