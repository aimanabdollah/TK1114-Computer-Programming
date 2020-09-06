import java.util.Scanner;
public class D_6SidedDieRoll {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int testCase = sc.nextInt();

		for(int k=1; k<=testCase; k++) {
			
			int count1 = 0, count2 = 0, count3 = 0,
					count4 = 0, count5 = 0, count6 = 0;
					
		
			int[] face = new int[100];
			int i=0;
			face[i]=sc.nextInt();
				while(face[i]!=-1)
				{
					i++;
					face[i]=sc.nextInt();			
				}
			
			System.out.print("Case #"+(k)+": ");
				
			System.out.print("\nFace 1: ");
			for(int j=0; j<face.length; j++) {
				if(face[j]==1)
					count1++;
			}
			System.out.print(count1);
			System.out.println();
			
			System.out.print("Face 2: ");
			for(int j=0; j<face.length; j++) {
				if(face[j]==2)
					count2++;
			}
			System.out.print(count2);
			System.out.println();
			
			System.out.print("Face 3: ");
			for(int j=0; j<face.length; j++) {
				if(face[j]==3)
					count3++;
			}
			System.out.print(count3);
			System.out.println();
			
			System.out.print("Face 4: ");
			for(int j=0; j<face.length; j++) {
				if(face[j]==4)
					count4++;
			}
			System.out.print(count4);
			System.out.println();
			
			System.out.print("Face 5: ");
			for(int j=0; j<face.length; j++) {
				if(face[j]==5)
					count5++;
			}
			System.out.print(count5);
			System.out.println();
			
			System.out.print("Face 6: ");
			for(int j=0; j<face.length; j++) {
				if(face[j]==6)
					count6++;
			}
			System.out.print(count6);
			System.out.println();
					
		}	
	}		
}
