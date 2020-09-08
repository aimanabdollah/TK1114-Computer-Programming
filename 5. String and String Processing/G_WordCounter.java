import java.util.Scanner;

public class G_WordCounter {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //get the number of string
        int n = input.nextInt();
        //validate input range
        while (n<1 || n>50)
        {
            System.err.println("Please enter number (1-50)..");
            n = input.nextInt();
        }
        input.nextLine();
        // create array Strings  of size n
        String[] sentences = new String[n];
        // loop to get input from user 
        // and store into array
        for (int i = 0; i <sentences.length ; i++) {
            sentences[i] = input.nextLine();
        }
        //Counter variable 
        int counter=0;
        // Loop to find words in a sentence
        for (int i = 0; i <sentences.length ; i++) {
            //remove the # from line (not to be counted)
            String sentence = sentences[i].substring(0,sentences[i].length()-1);
            //split the line into words
            String[] words = sentence.split(" ");
            // print stats
            System.out.println("Case #"+(++counter)+": "+words.length);
        }
    }
}