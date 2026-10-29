import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        char[][] mapa = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapa[i][j] = '.';
            }
        }

        int filatesoro = random.nextInt(5);
        int columnatesoro = random.nextInt(5);
        int filaTrampa = random.nextInt(5);
        int columnaTrampa = random.nextInt(5);


        do {
            filaTrampa = (int) (Math.random() * 5);
            columnaTrampa = (int) (Math.random() * 5);
        } while (mapa[filaTrampa][columnaTrampa] != '.');
        mapa[filatesoro][columnatesoro] = 'X';

        do {
            filatesoro = (int) (Math.random() * 5);
            columnatesoro = (int) (Math.random() * 5);
        } while (mapa[filatesoro][columnatesoro] != '.');
        mapa[filatesoro][columnatesoro] = 'T';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }


    }
}