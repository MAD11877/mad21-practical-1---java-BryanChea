import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int max = 0;
    int count = 0;
    int most = 0;
    ArrayList<Integer> iList = new ArrayList<Integer>();
    while(num-- > 0){
      int i = in.nextInt();
      for(int k : iList){
          if(k == i){
            count++;
          }
      }
      if(count > max){
        max = count;
        most = i;
      }
      else if(count == 0){
        iList.add(i);
      }
      else{
        count = 0;
      }
    }
    System.out.println(most);
  }
}
