import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String str = new String();

        for(int i = 0; i < n; i++){

            int score = 0, k = 1;
            str = s.next();
            String arr[] = str.split("");

            for(int j = 0; j < str.length(); j++){
                if(arr[j].equals("O")){
                    score += k;
                    k++;
                }
                if(arr[j].equals("X"))
                    k = 1;
            }
            System.out.println(score);
        }

    }
}