import java.util.*;

class ArrSort{
	public static void main(String args[])
	{
		int size,temp=0;
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter size of the array");
		
		size = sc.nextInt();	

		int[]a= new int[size];
		System.out.println("enter "+size+" elements");	
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}		

		for(int i=0;i<a.length;i++)
			{for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
						{
							temp = a[i]; a[i] = a[j]; a[j] = temp;	
						}
						
				}}
		System.out.println("ascending order:\n");
			for(int i:a)
			{System.out.println(i);}

		for(int i=0;i<a.length;i++)
			{for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
						{
							temp = a[i]; a[i] = a[j]; a[j] = temp;	
						}
						
				}

	}System.out.println("descending order:\n");
		for(int i:a)
			{System.out.println(i);}



}}