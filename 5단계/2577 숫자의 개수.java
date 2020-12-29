import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int cal = a * b * c;

        int length = (int)(Math.log10(cal)+1);
        String str = String.valueOf(cal);
        String []arr = str.split("");
        int[] num = new int[10];

        for(int i = 0; i < length; i++){
            num[Integer.parseInt(arr[i])]++;
        }

        for(int j = 0; j < 10; j++)
            System.out.println(num[j]);
    }
}