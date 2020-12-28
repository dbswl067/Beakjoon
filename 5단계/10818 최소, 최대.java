import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int min = 1000000, max = -1000000;

        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            if(a < min)
                min = a;
            if(a > max)
                max = a;
        }
        System.out.println(min + " " + max);
    }
}