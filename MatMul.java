class MatMul{

	public void multiply(int rr1, int cc1, int rr2, int cc2)
		{
				
			int res[][] = new int[rr1][cc2]
			int
				if(cc1 != rr2)
				{	
					System.out.println("multiplicatioin is not possible");
				}
				else
				{
					for(int i=0;i<rr1;i++)
					{	
						for(int j=0;j<cc1;j++)
						{
							res[i][j]=0;
							for(int k=0;k<cc2;k++)
								{
									res[i][j] = res[i][j]+ a[i][j]*b[j][k]
								}										//	res[i][j] = a[i][j]*b[i][j]+
						}	System.out.println(res[i][j]+" ");

					}					

		
				}
		
		}



}

class mainClass{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r1, c1, r2, c2 values:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

				
		int a[][] = new  int[r1][c1];
		int b[][] = new int[r2][c2];
		MatMul m = new MatMul();
		m.multiply(r1, c1, r2, c2);



}