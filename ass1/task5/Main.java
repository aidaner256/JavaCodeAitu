import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp>0){
            System.out.println("it’s warm outside");
        }
        else{
            System.out.println("it’s cold outside");
        }
    }
}
