import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    while (i <= 100) {
      i++;
      if (i % 3 == 0) {
        continue;
      } else{
        sum += i;
      }
    }

    System.out.println(sum);
  }
}
