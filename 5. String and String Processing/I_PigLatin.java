import java.util.*;
public class I_PigLatin
{
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n,i,j;
       String str,temp,result;
       n=s.nextInt();
       s.nextLine();
       for(i=0;i<n;i++)
       {
           str=s.nextLine();//read the String
           result="";
           String []strarr=str.split(" ");//if it has more than one word spilt at spacs
           for (String t: strarr)//for each string process latin
           {
               char ch=t.charAt(0);//first Character of word
               if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
               {
                //if it is vowel just add "ay"
                temp=t+"ay";
               }
               else//else move thtemp=t+"ay"; first to last using substring and add ay
                  temp=t.substring(1)+ch+"ay";
      
               result+=" "+temp;//result eill store all the converted words as a single sentence
           }
         System.out.println("case #"+(i+1)+":"+result);//print result
       }
   }
}
