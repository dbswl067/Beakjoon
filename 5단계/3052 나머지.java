import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        int num[] = new int[42];
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = s.nextInt() % 42;
            num[arr[i]]++;
        }
        for(int j = 0; j < 42; j++){
            if(num[j] != 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}