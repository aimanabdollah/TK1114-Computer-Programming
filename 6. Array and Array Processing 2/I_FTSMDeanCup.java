import java.util.*;
import java.io.*;
public class I_FTSMDeanCup {
   public static void main(String[] args) throws Exception{
	   
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(in.readLine());
       
       int arr[][][] = new int[n][4][3];
       int score[][] = new int[n][5];
       
       for (int i=0;i<n;i++) {
           int high_score=0;
           for (int j=0;j<4;j++) {
               String str = in.readLine(); // Taking input from user and storing it in str
               String nums [] = new String[3];
               nums = str.split(" "); // Spliting the input based on space
               arr[i][j][0] = Integer.parseInt(nums[0]); // assigning value to array
               arr[i][j][1] = Integer.parseInt(nums[1]);
               arr[i][j][2] = Integer.parseInt(nums[2]);
               score[i][j] = arr[i][j][0] * 3 + arr[i][j][1]*1; // Calculating score for team
               if (score[i][j] > high_score) { // If the new score is greater then high_score 
                                               // then assign new score to high_score.
                   high_score = score[i][j];
                   score[i][4] = j +1; // update winner team.
               }
           }
       }
       // Printing
       for (int i=0;i<n;i++) {
           System.out.print("Case #"+(i+1)+": ");
           for (int j =0;j<5;j++) {
               System.out.print(score[i][j] + " ");
           }
           System.out.println();
       }
   }
}