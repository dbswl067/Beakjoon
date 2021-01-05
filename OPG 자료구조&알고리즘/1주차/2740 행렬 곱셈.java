import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int arr1[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = s.nextInt();
            }
        }

        int m2 = s.nextInt();
        int k = s.nextInt();

        int arr2[][] = new int[m2][k];
        for(int i = 0; i < m2; i++){
            for(int j = 0; j < k; j++){
                arr2[i][j] = s.nextInt();
            }
        }

        int mul[][] = new int[n][k];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                 for(int l = 0; l < m; l++){
                     mul[i][j] += arr1[i][l] * arr2[l][j];
                 }
            }
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < k; j++)
                bw.write(mul[i][j] + " ");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

}
