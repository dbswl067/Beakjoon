import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();

        if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            if (m >= 45) {
                m -= 45;
            }
            else {
                h--;
                m = 60 - (45 - m);
                if (h < 0)
                    h = 23;

            }
            System.out.println(h + " " + m);
        }
    }
}