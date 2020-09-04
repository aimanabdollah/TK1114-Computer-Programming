import java.util.Scanner;
public class D_AlternatingSum {
   public static void main(String[] args) {
       int num;      
       int j = 1;
       Scanner sc = new Scanner(System.in);

       do {
           System.out.print("Input an integer: ");
           num = sc.nextInt();
           int total = 0;
           int i = 1;
           if(num == -1)
               break;
           do {
               if (i == 0) {
                   total = i;
               } else {
                   if (i % 2 == 0) {
                       total = total - i;
                   } else {
                       total = total + i;
                   }
               }
               i++;
           } while (i <= num);
           System.out.println("Case #" + j + ": " + total);
           j++;
       } while (num != -1);
   }
}