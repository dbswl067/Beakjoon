import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String arr[][] = new String[n][2];

        for(int i = 0; i <n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = s.next();
            }
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
    }


}
