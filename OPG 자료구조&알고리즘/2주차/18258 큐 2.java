import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int front = -1, back = -1;

        for(int i = 0; i < n; i++){
            String str = s.next();
            if(str.equals("push")){
                arr[++back] = s.nextInt();
            }
            if(str.equals("pop")){
                if(front == back)
                    sb.append( -1 + "\n");
                else
                    sb.append(arr[++front] + "\n");
            }
            if(str.equals("size")){
                sb.append((back - front) + "\n");
            }
            if(str.equals("empty")){
                if(front == back)
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            }
            if(str.equals("front")){
                if(front == back)
                    sb.append(-1 + "\n");
                else
                    sb.append(arr[front + 1] + "\n");
            }
            if(str.equals("back")){
                if(front == back)
                    sb.append(-1 + "\n");
                else
                    sb.append(arr[back] + "\n");
            }
        }
        System.out.println(sb);
    }
}
