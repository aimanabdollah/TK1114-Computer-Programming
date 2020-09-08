import java.util.*;
public class H_Belalang {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num;
       num=sc.nextInt();
       ArrayList<String> al=new ArrayList<String>();
       String str;
       for(int i=0;i<num;i++)
       {
           str=sc.nextLine();
           al.add(str);
       }
       Iterator itr=al.iterator();
       int i=0;
       while(itr.hasNext())
       { i++;
       System.out.println("Case #"+i+": "+balalang(itr.next().toString()));
       }
      
   }
   public static String balalang(String str)
   {
       String update="";
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)==' ')
           {
               update+='a';
           }
           else if(str.charAt(i)=='a')
           {
               update+=' ';
           }
           else
           {
               update+=(char)('a'+'z'-str.charAt(i)+1);
           }
       }
       return update;
   }
}