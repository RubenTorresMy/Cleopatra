import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int distancia(int x, int y){
        if ((x<0 && y>0) || (x>0 && y<0)){
            return Math.abs(x-y)-1; // sin año 0
        }
        return Math.abs(x-y);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        //
        String string = br.readLine();
        if (string == null || string.isEmpty()){out.flush();return;}
        int T = Integer.parseInt(string.trim());
        for (int i = 0; i < T; i++) {
            String line;
            while ((line = br.readLine()) != null && line.trim().isEmpty()){
                StringTokenizer st = new StringTokenizer(line);
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(st.nextToken());
                int dtA = distancia(A,B);
                int dtC = distancia(C,B);
                if (dtA < dtC){
                    out.print(A);
                }else if (dtC < dtA){
                    out.print(C);
                }else{
                   out.print("EMPATE");
                }


            }
            out.flush();
        }






    }
}