import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int w = 10;
        int d = 5;
        for (int i = 0; i < d; i++) {
            int tmp=w;
            while(tmp>0){
                System.out.print("Q");
                tmp--;
            }
            System.out.println();
        }
    }
}
