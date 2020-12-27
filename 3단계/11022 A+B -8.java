import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            arr[i] = a + b;

            System.out.println("Case #"+ (i+1) + ": " + a + " + " + b + " = "+ arr[i]);
        }
        
    }
}
