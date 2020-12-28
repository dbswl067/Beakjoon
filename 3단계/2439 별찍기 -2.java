import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++) {
                if(n - (i + 1) > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
