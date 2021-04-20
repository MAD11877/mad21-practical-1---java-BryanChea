import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    while(i-- > 0){
      for(int k = 0; k <= i; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
