import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        bw.write((int)Math.pow(2,n) - 1 +"\n");
        hanoi(n,1,2,3);
        
        bw.flush();
        bw.close();
    }
    public static void hanoi(int n, int from, int tmp, int to) throws IOException {
        if(n == 1)
            bw.write(from + " " + to + "\n");
        else{
            hanoi(n - 1, from, to, tmp);
            bw.write(from + " " + to + "\n");
            hanoi(n - 1, tmp, from, to);
        }
    }

}
