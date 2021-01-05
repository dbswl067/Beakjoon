import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = s.nextInt();
        int arr[] = new int[n];
        int top = -1;

        for(int i = 0; i < n; i++){
            String str = s.next();
            if(str.equals("push")){
                top++;
                arr[top] = s.nextInt();
            }
            if(str.equals("pop")){
                if(top == -1)
                    sb.append(-1 + "\n");
                else {
                    sb.append(arr[top] + "\n");
                    top--;
                }
            }
            if(str.equals("size")){
                sb.append((top + 1) + "\n");
            }
            if(str.equals("empty")){
                if(top == -1)
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            }
            if(str.equals("top")){
                if(top == -1)
                    sb.append(-1 + "\n");
                else {
                    sb.append(arr[top] + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
