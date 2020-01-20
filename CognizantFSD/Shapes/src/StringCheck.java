import java.util.Scanner;

public class StringCheck {

			public static void main(String args[]) {
				int check=0;
				Scanner sc = new Scanner(System.in);
				String s1 = sc.nextLine();
				String s2 = sc.nextLine();
				char a1[] = s1.toCharArray();
				char a2[] = s2.toCharArray();
				if(s1.length()!= s2.length())
					{
						System.out.println("Not equal");
						System.exit(1);
					}
				for(int i=0;i<s1.length();i++)
				{
					if(a1[i]!=a2[i])
					{
						System.out.println("Not equal");
						check++;
						break;
						
					}
					
				}
				if(check==0) {
					System.out.println("Equal");
				}
				
				
				
				
				
		}
}


