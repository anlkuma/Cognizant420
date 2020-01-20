import java.util.*;


class ArrMinMax{

		public static void main(String args[]){
					int temp=0, min,max;			
			Scanner sc = new Scanner(System.in);		
			System.out.println("enter the array size\n");
			int n= sc.nextInt();
			int[] a = new int[n];
			System.out.println("enter "+n+" elements\n");

			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();

				int k=0;
					temp=a[k];
			for(int j=0;j<n;j++)
			{
				
				if(a[j]<temp)
				temp=a[j];				
			}	
			System.out.println(" min element is:" +temp);

				temp=a[k];
			for(int j=0;j<n;j++)
			{	
				if(a[j]>temp)
				temp=a[j];
			}				
			System.out.println("max element is: "+temp);
				
}



}