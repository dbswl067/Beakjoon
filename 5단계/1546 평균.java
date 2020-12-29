import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double arr[] = new double[n];
        double max = -1, sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }

        for(int j = 0; j < n; j++){
            arr[j] = (arr[j] / max) * 100;
            sum += arr[j];
        }
        System.out.println(sum / n);
    }
}