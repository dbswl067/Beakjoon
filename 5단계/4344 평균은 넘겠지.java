import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.###");
        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            int n2 = s.nextInt();
            int arr[] = new int[n2];
            double sum = 0, cnt = 0, avg = 0, rate = 0;

            for(int j = 0; j < n2; j++){
                arr[j] = s.nextInt();
                sum += arr[j];
            }
            avg = sum /n2;
            for(int k = 0; k <n2; k++){
                if(arr[k] > avg)
                    cnt++;
            }
            rate = (cnt / n2) * 100;
            System.out.printf("%.3f%%\n",rate);
        }

    }
}